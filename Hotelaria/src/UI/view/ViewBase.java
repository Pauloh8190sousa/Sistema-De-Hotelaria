/*    */ package UI.view;
/*    */ 
/*    */ import java.awt.LayoutManager;
/*    */ import javax.swing.ImageIcon;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.UIManager;
/*    */ 
/*    */ public abstract class ViewBase extends JFrame {
/*    */   public ViewBase() {
/* 11 */     templateMethod();
/* 12 */     setExtendedState(6);
/* 13 */     repaint();
/*    */   }
/*    */   
/*    */   public void templateMethod() {
/* 16 */     setTitle("Hotel");
/* 17 */     setIconImage((new ImageIcon(getClass().getResource("/icons8-hotel-de-3-estrelas-80.png"))).getImage());
/* 18 */     setLayout(null);
/* 19 */     setSize(700, 700);
/* 20 */     setDefaultCloseOperation(3);
/* 21 */     setLocationRelativeTo(null);
/*    */     try {
/*    */       byte b;
/*    */       int i;
/*    */       UIManager.LookAndFeelInfo[] arrayOfLookAndFeelInfo;
/* 24 */       for (i = (arrayOfLookAndFeelInfo = UIManager.getInstalledLookAndFeels()).length, b = 0; b < i; ) {
/* 24 */         UIManager.LookAndFeelInfo info = arrayOfLookAndFeelInfo[b];
/* 25 */         if ("Nimbus".equals(info.getName())) {
/* 26 */           UIManager.setLookAndFeel(info.getClassName());
/*    */           break;
/*    */         } 
/*    */         b++;
/*    */       } 
/* 30 */     } catch (Exception exception) {}
/* 33 */     adicionarBotoes();
/* 34 */     adicionarJLabel();
/* 35 */     adicionarTextField();
/* 36 */     adicionarTabela();
/* 37 */     adicionarMenu();
/* 38 */     adicionarRadioButton();
/* 39 */     adicionarJComboBox();
/* 40 */     setVisible(true);
/*    */   }
/*    */   
/*    */   public abstract void adicionarBotoes();
/*    */   
/*    */   public void adicionarTextField() {}
/*    */   
/*    */   public abstract void adicionarJLabel();
/*    */   
/*    */   public void adicionarLabel(String usuario) {}
/*    */   
/*    */   public void adicionarMenu() {}
/*    */   
/*    */   public void adicionarTabela() {}
/*    */   
/*    */   public void adicionarRadioButton() {}
/*    */   
/*    */   public void adicionarJComboBox() {}
/*    */ }

