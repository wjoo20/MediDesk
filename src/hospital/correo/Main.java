package hospital.correo;
import hospital.bo.RecuperacionBO;
import hospital.views.Register;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;


public class Main
{
public static String generateRandomWord(int wordLength) { 
 Random r = new Random(); // Inicia un numero aleatorio
 StringBuilder sb = new StringBuilder(wordLength); 
 for(int i = 0; i < wordLength; i++) { // Por cada letra en la palabra
  char tmp = (char) ('a' + r.nextInt('z' - 'a')); // Genera un letra entre la a y la z
  sb.append(tmp); // Añade al String
 }


 return sb.toString();
}

    String nueva_clave = generateRandomWord(5);
    Register r = new Register();
    String encriptado = r.encrypt(nueva_clave);
    String  d_email = "medideskhospital@gmail.com",
            d_password = "medidesk123",
            d_host = "smtp.gmail.com",
            d_port  = "465",
            m_to = "joniguevara1@gmail.com",
            m_subject = "Recuperacion de Cuenta",
            m_text = "Tu nueva contraseña es: "+nueva_clave;

    public Main(String txtCorreo)
    {
        Properties props = new Properties();
        props.put("mail.smtp.user", d_email);
        props.put("mail.smtp.host", d_host);
        props.put("mail.smtp.port", d_port);
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.debug", "true");
        props.put("mail.smtp.socketFactory.port", d_port);
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false");

        SecurityManager security = System.getSecurityManager();

        try
        {
            Authenticator auth = new SMTPAuthenticator();
            Session session = Session.getInstance(props, auth);
            session.setDebug(true);
            MimeMessage msg = new MimeMessage(session);
            msg.setText(m_text);
            msg.setSubject(m_subject);
            msg.setFrom(new InternetAddress(d_email));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(txtCorreo));
            Transport.send(msg);
            
        }
        catch (Exception mex)
        {
            mex.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "Mensaje Enviado");
        RecuperacionBO recubo=new RecuperacionBO();
        recubo.Recuperar_pass(encriptado,txtCorreo);

    }

    public  void main1(String txtCorreo)
    {
        Main blah = new Main(txtCorreo);
    }

    private class SMTPAuthenticator extends javax.mail.Authenticator
    {
        public PasswordAuthentication getPasswordAuthentication()
        {
            return new PasswordAuthentication(d_email, d_password);
        }
    }
}