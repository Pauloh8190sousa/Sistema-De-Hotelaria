/*    */ package UI.ouvintes;
/*    */ 
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import javax.swing.JFrame;

import UI.view.ViewCadastrarPessoa;
/*    */ 
/*    */ public class OuvinteViewCadastrarPessoa implements ActionListener {
/*    */   private JFrame view;
/*    */   
/*    */   public OuvinteViewCadastrarPessoa(JFrame view) {
/* 13 */     this.view = view;
/*    */   }
/*    */   
/*    */   public void actionPerformed(ActionEvent arg0) {
			 new ViewCadastrarPessoa();
/* 17 */     view.dispose();
/*    */   }
/*    */ }


/* Location:              C:\Users\paulo\Desktop\Hospedagem Java\!\UI\ouvintes\OuvinteViewCadastrarPessoa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */