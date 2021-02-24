/*     */ package UI.view;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.FlowLayout;
/*     */ import java.awt.Font;
/*     */ import java.awt.GridLayout;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JPasswordField;
/*     */ import javax.swing.JTextField;
/*     */ import system.ControllerGerenciador;
/*     */ 
/*     */ public class ViewRecuperarSenha extends ViewBase {
/*     */   private JPanel p1;
/*     */   
/*     */   private JPanel p2;
/*     */   
/*     */   private JPanel p3;
/*     */   
/*     */   private JPanel p4;
/*     */   
/*     */   private JTextField campoToken;
/*     */   
/*     */   private JPasswordField campoSenha;
/*     */   
/*     */   private JPasswordField campoConfirmar;
/*     */   
/*     */   public ViewRecuperarSenha() {
/*  29 */     setLayout(new GridLayout(4, 1));
/*  30 */     Color cor = new Color(0, 191, 255);
/*  31 */     this.p1.setBackground(cor);
/*  32 */     this.p2.setBackground(cor);
/*  33 */     this.p3.setBackground(cor);
/*  34 */     this.p4.setBackground(cor);
/*  36 */     add(this.p1);
/*  37 */     add(this.p2);
/*  38 */     add(this.p3);
/*  39 */     add(this.p4);
/*     */   }
/*     */   
/*     */   public void adicionarBotoes() {
/*  42 */     OuvinteRedefinir ouvinte = new OuvinteRedefinir();
/*  43 */     this.p4 = new JPanel(new FlowLayout(1, 40, 0));
/*  44 */     JButton redefinir = new JButton("Redefinir");
/*  45 */     redefinir.setFont(new Font("Arial", 1, 18));
/*  46 */     redefinir.addActionListener(ouvinte);
/*  47 */     redefinir.setIcon(new ImageIcon(getClass().getResource("/icons8-mostrar-a-senha-30.png")));
/*  48 */     this.p4.add(redefinir);
/*     */   }
/*     */   
/*     */   public void adicionarJLabel() {
/*  53 */     JLabel token = new JLabel("Token");
/*  54 */     token.setFont(new Font("Arial", 1, 18));
/*  56 */     JLabel senha = new JLabel("Nova Senha");
/*  57 */     senha.setFont(new Font("Arial", 1, 18));
/*  59 */     JLabel confirmar = new JLabel("Confirmar senha");
/*  60 */     confirmar.setFont(new Font("Arial", 1, 18));
/*  62 */     this.p1 = new JPanel(new FlowLayout(1, 40, 40));
/*  63 */     this.p2 = new JPanel(new FlowLayout(1, 40, 0));
/*  64 */     this.p3 = new JPanel(new FlowLayout(1, 40, 0));
/*  66 */     this.p1.add(token);
/*  67 */     this.p2.add(senha);
/*  68 */     this.p3.add(confirmar);
/*     */   }
/*     */   
/*     */   public void adicionarTextField() {
/*  72 */     this.campoToken = new JTextField(30);
/*  73 */     this.campoToken.setFont(new Font("Times new roman", 1, 16));
/*  74 */     this.campoSenha = new JPasswordField(30);
/*  75 */     this.campoSenha.setFont(new Font("Times new roman", 1, 16));
/*  76 */     this.campoConfirmar = new JPasswordField(30);
/*  77 */     this.campoConfirmar.setFont(new Font("Times new roman", 1, 16));
/*  79 */     this.p1.add(this.campoToken);
/*  80 */     this.p2.add(this.campoSenha);
/*  81 */     this.p3.add(this.campoConfirmar);
/*     */   }
/*     */   
/*     */   public class OuvinteRedefinir implements ActionListener {
/*     */     public void actionPerformed(ActionEvent arg0) {
/*  88 */       ControllerGerenciador gerenciador = new ControllerGerenciador();
/*     */       try {
/*  90 */         int token = Integer.parseInt(ViewRecuperarSenha.this.campoToken.getText());
/*  91 */         String senhaNova = new String(ViewRecuperarSenha.this.campoSenha.getPassword());
/*  92 */         String confirmarSenha = new String(ViewRecuperarSenha.this.campoConfirmar.getPassword());
/*  93 */         if (gerenciador.getAdministrador().getToken() == token) {
/*  94 */           if (senhaNova.equals(confirmarSenha) && senhaNova.length() > 4 && confirmarSenha.length() > 4) {
/*  95 */             gerenciador.getAdministrador().setSenha(senhaNova);
/*  96 */             gerenciador.getAdministrador().addToken(-1);
/*  97 */             gerenciador.atualizar();
/*  98 */             JOptionPane.showMessageDialog(null, "Senha Redefinida");
					  new ViewInicio();
/* 100 */             dispose();
/*     */           } else {
/* 102 */             JOptionPane.showMessageDialog(null, "Campos diferentes em nova senha e confirmar senha. \n Verifique se tem mais de 4 caracteres");
/* 103 */             campoSenha.setText("");
/* 104 */             campoConfirmar.setText("");
/*     */           } 
/*     */         } else {
/* 107 */           JOptionPane.showMessageDialog(null, "Token Errado");
/* 108 */           campoToken.setText("");
/*     */         } 
/* 111 */       } catch (Exception e) {
/* 112 */         JOptionPane.showMessageDialog(null, "Campo Vazio de Token ou o Formato não é um número");
/* 113 */         campoToken.setText("");
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\paulo\Desktop\Hospedagem Java\!\UI\view\ViewRecuperarSenha.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */