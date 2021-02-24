/*    */ package UI.ouvintes;
/*    */ 
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import javax.swing.JFrame;

import UI.view.ViewInicio;
/*    */ 
/*    */ public class OuvinteVoltarInicio implements ActionListener {
/*    */   private JFrame view;
/*    */   
/*    */   public OuvinteVoltarInicio(JFrame view) {
/* 15 */     this.view = view;
/*    */   }
/*    */   
/*    */   public void actionPerformed(ActionEvent arg0) {
			 new ViewInicio();
/* 20 */     view.dispose();
/*    */   }
/*    */ }


/* Location:              C:\Users\paulo\Desktop\Hospedagem Java\!\UI\ouvintes\OuvinteVoltarInicio.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */