 package UI.view;
 import javax.swing.ImageIcon;
import javax.swing.JFrame;
 import javax.swing.UIManager;
 
 public abstract class ViewBase extends JFrame {
   public ViewBase() {
     templateMethod();
     setExtendedState(MAXIMIZED_BOTH);
     repaint();
   }
   
   public void templateMethod() {
     setTitle("Hotel");
     setIconImage(new ImageIcon(getClass().getResource("/icons8-hotel-de-3-estrelas-80.png")).getImage());
     setLayout(null);
     setSize(700, 700);
     setDefaultCloseOperation(3);
     setLocationRelativeTo(null);
     try {
       byte b;
       int i;
       UIManager.LookAndFeelInfo[] arrayOfLookAndFeelInfo;
       for (i = (arrayOfLookAndFeelInfo = UIManager.getInstalledLookAndFeels()).length, b = 0; b < i; ) {
         UIManager.LookAndFeelInfo info = arrayOfLookAndFeelInfo[b];
         if ("Nimbus".equals(info.getName())) {
           UIManager.setLookAndFeel(info.getClassName());
           break;
         } 
         b++;
       } 
     } catch (Exception exception) {}
     adicionarBotoes();
     adicionarJLabel();
     adicionarTextField();
     adicionarTabela();
     adicionarMenu();
     adicionarRadioButton();
     adicionarJComboBox();
     setVisible(true);
   }
   
   public abstract void adicionarBotoes();
   
   public void adicionarTextField() {}
   
   public abstract void adicionarJLabel();
   
   public void adicionarLabel(String usuario) {}
   
   public void adicionarMenu() {}
   
   public void adicionarTabela() {}
   
   public void adicionarRadioButton() {}
   
   public void adicionarJComboBox() {}
 }
