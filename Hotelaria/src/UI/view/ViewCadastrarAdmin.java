/*     */ package UI.view;
/*     */ 
/*     */ import Exception.EmailInvalidoException;
/*     */ import Util.ValidacaoEmail;
/*     */ import java.awt.Color;
/*     */ import java.awt.FlowLayout;
/*     */ import java.awt.Font;
/*     */ import java.awt.GridLayout;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JPasswordField;
/*     */ import javax.swing.JTextField;
/*     */ import system.ControllerGerenciador;
/*     */ 
/*     */ public class ViewCadastrarAdmin extends ViewBase {
/*     */   private JTextField campoEmail;
/*     */   
/*     */   private JPasswordField campoSenha;
/*     */   
/*     */   private JPanel p1;
/*     */   
/*     */   private JPanel p2;
/*     */   
/*     */   private JPanel p3;
/*     */   
/*     */   private JPanel p4;
/*     */   
/*     */   private JPanel p5;
/*     */   
/*     */   public ViewCadastrarAdmin() {
/*  32 */     setLayout(new GridLayout(5, 1));
/*  33 */     Color corFundo = new Color(0, 191, 255);
/*  34 */     this.p1.setBackground(corFundo);
/*  35 */     this.p2.setBackground(corFundo);
/*  36 */     this.p3.setBackground(corFundo);
/*  37 */     this.p4.setBackground(corFundo);
/*  38 */     this.p5.setBackground(corFundo);
/*  39 */     add(this.p4);
/*  40 */     add(this.p1);
/*  41 */     add(this.p2);
/*  42 */     add(this.p3);
/*  43 */     add(this.p5);
/*     */   }
/*     */   
/*     */   public void adicionarBotoes() {
/*  46 */     this.p5 = new JPanel(new FlowLayout(1));
/*  47 */     this.p3 = new JPanel(new FlowLayout(1, 0, 30));
/*  49 */     OuvinteCadastrar ouvinte = new OuvinteCadastrar();
/*  50 */     JButton cadastrar = new JButton("Cadastrar");
/*  51 */     cadastrar.addActionListener(ouvinte);
/*  52 */     cadastrar.setFont(new Font("Arial", 1, 18));
/*  53 */     cadastrar.setBackground(Color.WHITE);
/*  54 */     cadastrar.setIcon(new ImageIcon(getClass().getResource("/icons8-adicionar-administrador-filled-28.png")));
/*  56 */     OuvinteCarregar ouvinteCarregar = new OuvinteCarregar(this);
/*  57 */     JButton carregarDados = new JButton("Carregar Dados");
/*  58 */     carregarDados.setFont(new Font("Arial", 1, 18));
/*  59 */     carregarDados.setBackground(Color.WHITE);
/*  60 */     carregarDados.addActionListener(ouvinteCarregar);
/*  61 */     carregarDados.setIcon(new ImageIcon(getClass().getResource("/icons8-restauração-de-banco-de-dados-30.png")));
/*  63 */     this.p5.add(carregarDados);
/*  64 */     this.p3.add(cadastrar);
/*     */   }
/*     */   
/*     */   public void adicionarJLabel() {
/*  69 */     this.p1 = new JPanel(new FlowLayout(1, 20, 20));
/*  70 */     this.p2 = new JPanel(new FlowLayout(1, 20, 10));
/*  71 */     this.p4 = new JPanel(new FlowLayout(1, 0, 50));
/*  72 */     JLabel email = new JLabel("E-mail");
/*  73 */     JLabel senha = new JLabel("Senha");
/*  74 */     JLabel cadastrar = new JLabel("Cadastrar Administrador");
/*  75 */     email.setFont(new Font("Arial", 1, 18));
/*  76 */     senha.setFont(new Font("Arial", 1, 18));
/*  77 */     cadastrar.setFont(new Font("Arial", 1, 24));
/*  78 */     this.p2.add(senha);
/*  79 */     this.p1.add(email);
/*  80 */     this.p4.add(cadastrar);
/*     */   }
/*     */   
/*     */   public void adicionarTextField() {
/*  85 */     this.campoEmail = new JTextField(40);
/*  86 */     this.campoEmail.setFont(new Font("Arial", 0, 18));
/*  87 */     this.campoEmail.setForeground(Color.GRAY);
/*  88 */     this.campoSenha = new JPasswordField(40);
/*  89 */     this.campoEmail.setBorder(BorderFactory.createLineBorder(Color.BLACK));
/*  90 */     this.campoSenha.setBorder(BorderFactory.createLineBorder(Color.BLACK));
/*  91 */     this.campoSenha.setFont(new Font("Arial", 0, 18));
/*  92 */     this.campoSenha.setForeground(Color.GRAY);
/*  93 */     this.p1.add(this.campoEmail);
/*  94 */     this.p2.add(this.campoSenha);
/*     */   }
/*     */   
/*     */   public class OuvinteCadastrar implements ActionListener {
/*     */     public void actionPerformed(ActionEvent arg0) {
/* 100 */       ControllerGerenciador gerenciador = new ControllerGerenciador();
/* 101 */       String senha = new String(ViewCadastrarAdmin.this.campoSenha.getPassword());
/* 102 */       if (!ViewCadastrarAdmin.this.campoEmail.getText().equals("") && !senha.equals("") && senha.length() > 4) {
/*     */         try {
/* 104 */           ValidacaoEmail.validarEmail(ViewCadastrarAdmin.this.campoEmail.getText());
/* 105 */           gerenciador.addAdmin(ViewCadastrarAdmin.this.campoEmail.getText(), senha);
/* 106 */           JOptionPane.showMessageDialog(null, "Cadastrado");
					new ViewInicio();
/* 108 */           dispose();
/* 109 */         } catch (EmailInvalidoException e) {
/* 110 */           JOptionPane.showMessageDialog(null, e.getMessage());
/*     */         } 
/*     */       } else {
/* 114 */         JOptionPane.showMessageDialog(null, "Campo vazio ou Senha menor que 4 caracteres");
/*     */       } 
/* 116 */       ViewCadastrarAdmin.this.campoEmail.setText("");
/* 117 */       ViewCadastrarAdmin.this.campoSenha.setText("");
/*     */     }
/*     */   }
/*     */   
/*     */   public class OuvinteCarregar implements ActionListener {
/*     */     private JFrame jframe;
/*     */     
/*     */     public OuvinteCarregar(JFrame jframe) {
/* 123 */       this.jframe = jframe;
/*     */     }
/*     */     
/*     */     public void actionPerformed(ActionEvent arg0) {
/* 127 */       ViewCarregarArquivos.carregarDados(this.jframe);
/*     */     }
/*     */   }
/*     */ }


