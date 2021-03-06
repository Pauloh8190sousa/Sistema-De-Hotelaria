 package Util;
 import javax.swing.JOptionPane;
 import org.apache.commons.mail.DefaultAuthenticator;
 import org.apache.commons.mail.EmailException;
 import org.apache.commons.mail.SimpleEmail;

 import system.ControllerGerenciador;
 import system.Empresa;
/*    */ 
/*    */ public class Email {
/*    */   public boolean enviarEmail(String destino, String assunto, String msg) {
/* 12 */     SimpleEmail email = new SimpleEmail();
/* 13 */     email.setSSLOnConnect(true);
/* 14 */     email.setHostName("smtp.gmail.com");
/* 15 */     email.setSslSmtpPort("465");
	         ControllerGerenciador controller = new ControllerGerenciador();
	         Empresa empresa = controller.getEmpresa();
/* 16 */     email.setAuthenticator(new DefaultAuthenticator(empresa.getEmail(), empresa.getSenha()));
/*    */     try {
/* 18 */       email.setFrom(empresa.getEmail());
/* 19 */       email.setDebug(true);
/* 20 */       email.setSubject(assunto);
/* 21 */       email.setMsg(msg);
/* 22 */       email.addTo(destino);
/* 23 */       email.send();
/* 24 */       JOptionPane.showMessageDialog(null, "E-mail enviado");
/* 25 */       return true;
/* 26 */     } catch (EmailException emailException) {
/* 29 */       return false;
/*    */     } 
/*    */   }
/*    */ }