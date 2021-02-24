/*     */ package UI.view;
/*     */ 
/*     */ import Exception.EmailInvalidoException;
/*     */ import UI.ouvintes.OuvinteVoltarInicio;
/*     */ import Util.ValidacaoEmail;
/*     */ import java.awt.Component;
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
/*     */ public class ViewEditarAdmin extends ViewBase {
/*     */   private JPanel p0;
/*     */   
/*     */   private JPanel p1;
/*     */   
/*     */   private JPanel p2;
/*     */   
/*     */   private JPanel p3;
/*     */   
/*     */   private JPanel p4;
/*     */   
/*     */   private JTextField campoEmail;
/*     */   
/*     */   private JPasswordField campoSenha;
/*     */   
/*     */   private JPasswordField campoSenhaNova;
/*     */   
/*     */   public ViewEditarAdmin() {
/*  37 */     setLayout(new GridLayout(5, 1));
/*  38 */     add(this.p0);
/*  39 */     add(this.p1);
/*  40 */     add(this.p2);
/*  41 */     add(this.p4);
/*  42 */     add(this.p3);
/*  44 */     ControllerGerenciador gerenciador = new ControllerGerenciador();
/*  45 */     int sair = 10;
/*  46 */     while (sair != JOptionPane.CANCEL_OPTION) {
/*  47 */       String senha = JOptionPane.showInputDialog(null, "Senha:");
/*  48 */       if (senha == null) {
/*  49 */         sair = JOptionPane.CANCEL_OPTION;
/*     */       } 
/*  50 */   else if (senha.equals(gerenciador.getAdministrador().getSenha()))
/*     */         	break; 
/*     */     } 
/*  54 */     if (sair == JOptionPane.CANCEL_OPTION){
					new ViewInicio();
/*  56 */       	dispose(); 
				}
/*     */   }
/*     */   
/*     */   public void adicionarBotoes() {
/*  61 */     this.p0 = new JPanel(new FlowLayout(0, 10, 10));
/*  62 */     this.p3 = new JPanel(new FlowLayout(1));
/*  64 */     OuvinteEditar ouvinteEditar = new OuvinteEditar();
/*  65 */     JButton editar = new JButton("Editar");
/*  66 */     editar.setFont(new Font("Arial", 1, 18));
/*  67 */     editar.setIcon(new ImageIcon(getClass().getResource("/icons8-editar-usuário-masculino-30.png")));
/*  68 */     editar.addActionListener(ouvinteEditar);
/*  70 */     OuvinteVoltarInicio ouvinteVoltar = new OuvinteVoltarInicio(this);
/*  71 */     JButton voltar = new JButton("Voltar");
/*  72 */     voltar.setFont(new Font("Arial", 1, 18));
/*  73 */     voltar.setIcon(new ImageIcon(getClass().getResource("/icons8-voltar-30.png")));
/*  74 */     voltar.addActionListener((ActionListener)ouvinteVoltar);
/*  76 */     this.p0.add(voltar);
/*  77 */     this.p3.add(editar);
/*     */   }
/*     */   
/*     */   public void adicionarJLabel() {
/*  82 */     this.p1 = new JPanel(new FlowLayout(1));
/*  83 */     this.p2 = new JPanel(new FlowLayout(1));
/*  84 */     this.p4 = new JPanel(new FlowLayout(1));
/*  86 */     JLabel email = new JLabel("E-mail");
/*  87 */     email.setFont(new Font("Arial", 1, 18));
/*  89 */     JLabel senhaAtual = new JLabel("Senha Atual");
/*  90 */     senhaAtual.setFont(new Font("Arial", 1, 18));
/*  92 */     JLabel senhaNova = new JLabel("Senha Nova");
/*  93 */     senhaNova.setFont(new Font("Arial", 1, 18));
/*  95 */     this.p1.add(email);
/*  96 */     this.p2.add(senhaAtual);
/*  97 */     this.p4.add(senhaNova);
/*     */   }
/*     */   
/*     */   public void adicionarTextField() {
/* 101 */     this.campoEmail = new JTextField(20);
/* 102 */     this.campoSenha = new JPasswordField(20);
/* 103 */     this.campoSenhaNova = new JPasswordField(20);
/* 105 */     this.p1.add(this.campoEmail);
/* 106 */     this.p2.add(this.campoSenha);
/* 107 */     this.p4.add(this.campoSenhaNova);
/*     */   }
/*     */   
/*     */   public class OuvinteEditar implements ActionListener {
/*     */     public void actionPerformed(ActionEvent arg0) {
/* 114 */       ControllerGerenciador gerenciador = new ControllerGerenciador();
/* 115 */       String email = ViewEditarAdmin.this.campoEmail.getText();
/* 116 */       String senha = new String(ViewEditarAdmin.this.campoSenha.getPassword());
/* 117 */       String senhaNova = new String(ViewEditarAdmin.this.campoSenhaNova.getPassword());
/* 119 */       if (email.equals("") || senha.equals("") || senhaNova.equals("")) {
/* 120 */         JOptionPane.showMessageDialog(null, "Campos vázio!");
/* 123 */       } else if (senha.equals(gerenciador.getAdministrador().getSenha())) {
/*     */         try {
/* 125 */           ValidacaoEmail.validarEmail(email);
/* 126 */           gerenciador.getAdministrador().setEmail(email);
/* 127 */           gerenciador.getAdministrador().setSenha(senhaNova);
/* 128 */           gerenciador.atualizar();
/* 129 */           JOptionPane.showMessageDialog(null, "Dados do Administrador editado");
					new ViewInicio();
/* 131 */           dispose();
/* 132 */         } catch (EmailInvalidoException e) {
/* 133 */           JOptionPane.showMessageDialog(null, e.getMessage());
/* 134 */           ViewEditarAdmin.this.campoEmail.setText("");
/*     */         } 
/* 136 */       } else if (senhaNova.length() < 4) {
/* 137 */         JOptionPane.showMessageDialog(null, "Senha Nova com menos de 4 caracteres!");
/* 138 */         campoSenhaNova.setText("");
/*     */       } else {
/* 140 */         JOptionPane.showMessageDialog(null, "Senha Atual errada!");
/* 141 */         campoSenha.setText("");
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\paulo\Desktop\Hospedagem Java\!\UI\view\ViewEditarAdmin.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */