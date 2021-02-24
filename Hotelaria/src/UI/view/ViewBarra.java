/*    */ package UI.view;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.Component;
/*    */ import java.awt.Font;
/*    */ import java.awt.LayoutManager;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.JProgressBar;
/*    */ 
/*    */ public class ViewBarra extends JFrame {
/* 10 */   private JProgressBar barra = new JProgressBar();
/*    */   
/*    */   public ViewBarra(long tempo, int operacao, String acao) {
/* 13 */     setSize(600, 170);
/* 14 */     setLocationRelativeTo((Component)null);
/* 15 */     setLayout((LayoutManager)null);
/* 16 */     setDefaultCloseOperation(operacao);
/* 17 */     setResizable(false);
/* 18 */     setUndecorated(true);
/* 19 */     setVisible(true);
/* 20 */     this.barra.setString(acao);
/* 21 */     this.barra.setStringPainted(true);
/* 22 */     this.barra.setValue((int)(1.0D + Math.random() * 5.0D));
/* 23 */     this.barra.setMaximum(100);
/* 24 */     this.barra.setBounds(40, 40, 500, 50);
/* 25 */     this.barra.setFont(new Font("Arial", 1, 20));
/* 26 */     this.barra.setForeground(Color.BLACK);
/* 27 */     add(this.barra);
/* 28 */     (new Barra(tempo, this)).start();
/*    */   }
/*    */   
/*    */   public class Barra extends Thread {
/*    */     private long tempo;
/*    */     
/*    */     private JFrame frame;
/*    */     
/*    */     public Barra(long tempo, JFrame frame) {
/* 34 */       this.tempo = tempo;
/* 35 */       this.frame = frame;
/*    */     }
/*    */     
/*    */     public void run() {
/* 38 */       while (ViewBarra.this.barra.getValue() < 100) {
/*    */         try {
/* 40 */           sleep(this.tempo);
/* 41 */           ViewBarra.this.barra.setValue((int)(ViewBarra.this.barra.getValue() + 1.0D + Math.random() * 20.0D));
/* 42 */         } catch (InterruptedException e) {
/* 43 */           e.printStackTrace();
/*    */         } 
/*    */       } 
/* 46 */       this.frame.dispose();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\paulo\Desktop\Hospedagem Java\!\UI\view\ViewBarra.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */