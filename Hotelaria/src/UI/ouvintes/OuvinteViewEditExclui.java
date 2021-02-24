/*    */ package UI.ouvintes;
/*    */ 
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import javax.swing.JFrame;

import UI.view.ViewEditExclui;
/*    */ 
/*    */ public class OuvinteViewEditExclui implements ActionListener {
/*    */   private JFrame view;
/*    */   
/*    */   public OuvinteViewEditExclui(JFrame view) {
/* 14 */     this.view = view;
/*    */   }
/*    */   
/*    */   public void actionPerformed(ActionEvent arg0) {
			 new ViewEditExclui();
/* 19 */     view.dispose();
/*    */   }
/*    */ }


/* Location:              C:\Users\paulo\Desktop\Hospedagem Java\!\UI\ouvintes\OuvinteViewEditExclui.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */