/*    */ package UI.view;
/*    */ 
/*    */ import java.awt.Graphics;
/*    */ import java.awt.Image;
/*    */ import javax.swing.ImageIcon;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ public class ViewFundo extends JPanel {
/*    */   public void paintComponent(Graphics g) {
/* 11 */     super.paintComponent(g);
/* 12 */     Image background = (new ImageIcon(getClass().getResource("/trevo.jpg"))).getImage();
/* 13 */     g.drawImage(background, 0, 0, this);
/*    */   }
/*    */ }


/* Location:              C:\Users\paulo\Desktop\Hospedagem Java\!\UI\view\ViewFundo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */