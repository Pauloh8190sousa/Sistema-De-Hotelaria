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
/*     */ import javax.swing.JPanel;
/*     */ import system.Pessoa;
/*     */ 
/*     */ public class ViewMostarDados extends ViewBase {
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
/*     */   private JPanel p6;
/*     */   
/*     */   private JPanel p7;
/*     */   
/*     */   private JPanel p8;
/*     */   
/*     */   private JPanel p9;
/*     */   
/*     */   public ViewMostarDados(Pessoa pessoa) {
/*  26 */     setLayout(new GridLayout(9, 1));
/*  27 */     adicionarJLabel(pessoa);
/*  28 */     add(this.p1);
/*  29 */     add(this.p2);
/*  30 */     add(this.p3);
/*  31 */     add(this.p4);
/*  32 */     add(this.p5);
/*  33 */     add(this.p6);
/*  34 */     add(this.p7);
/*  35 */     add(this.p8);
/*  36 */     add(this.p9);
/*     */   }
/*     */   
/*     */   public void adicionarBotoes() {
/*  39 */     this.p1 = new JPanel(new FlowLayout(0));
/*  40 */     OuvinteVoltarMostarDados ovuinte = new OuvinteVoltarMostarDados();
/*  41 */     JButton voltar = new JButton("Voltar");
/*  42 */     voltar.setFont(new Font("Arial", 1, 18));
/*  43 */     voltar.setIcon(new ImageIcon(getClass().getResource("/icons8-voltar-30.png")));
/*  44 */     voltar.addActionListener(ovuinte);
/*  45 */     Color cor = new Color(0, 191, 255);
/*  46 */     this.p1.setBackground(cor);
/*  47 */     this.p1.add(voltar);
/*     */   }
/*     */   
/*     */   public void adicionarJLabel() {}
/*     */   
/*     */   public void adicionarJLabel(Pessoa pessoa) {
/*  53 */     JLabel idade = null;
/*  54 */     JLabel email = null;
/*  55 */     JLabel endereco = null;
/*  56 */     JLabel checkIn = null;
/*  57 */     JLabel checkOut = null;
/*  58 */     if (pessoa.getIdade() == 0) {
/*  59 */       idade = new JLabel("Idade: Dado não fornecido");
/*     */     } else {
/*  61 */       idade = new JLabel("Idade: " + pessoa.getIdade());
/*     */     } 
/*  63 */     if (pessoa.getEmail().equals("")) {
/*  64 */       email = new JLabel("E-mail: Dado não fornecido");
/*     */     } else {
/*  66 */       email = new JLabel("E-mail: " + pessoa.getEmail());
/*     */     } 
/*  68 */     if (pessoa.getEndereco().equals("")) {
/*  69 */       endereco = new JLabel("Endereço: Dado não fornecido");
/*     */     } else {
/*  71 */       endereco = new JLabel("Endereço: " + pessoa.getEndereco());
/*     */     } 
/*  72 */     if (pessoa.getCheckIn().equals("//")) {
/*  73 */       checkIn = new JLabel("Check in: Dado não fornecido /");
/*     */     } else {
/*  75 */       checkIn = new JLabel("Check in: " + pessoa.getCheckIn() + " /");
/*     */     } 
/*  76 */     if (pessoa.getCheckOut().equals("//")) {
/*  77 */       checkOut = new JLabel("Check out: Dado não fornecido");
/*     */     } else {
/*  79 */       checkOut = new JLabel("Check out: " + pessoa.getCheckOut());
/*     */     } 
/*  81 */     JLabel nome = new JLabel("Nome: " + pessoa.getNome());
/*  82 */     JLabel telefone = new JLabel("Telefone: " + pessoa.getTelefone());
/*  83 */     JLabel CPF = new JLabel("Cpf: " + pessoa.getCpf());
/*  84 */     JLabel RG = new JLabel("RG: " + pessoa.getRg());
/*  86 */     nome.setFont(new Font("Arial", 1, 20));
/*  87 */     idade.setFont(new Font("Arial", 1, 20));
/*  88 */     email.setFont(new Font("Arial", 1, 20));
/*  89 */     endereco.setFont(new Font("Arial", 1, 20));
/*  90 */     telefone.setFont(new Font("Arial", 1, 20));
/*  91 */     CPF.setFont(new Font("Arial", 1, 20));
/*  92 */     RG.setFont(new Font("Arial", 1, 20));
/*  93 */     checkIn.setFont(new Font("Arial", 1, 20));
/*  94 */     checkOut.setFont(new Font("Arial", 1, 20));
/*  96 */     nome.setForeground(Color.WHITE);
/*  97 */     idade.setForeground(Color.WHITE);
/*  98 */     email.setForeground(Color.WHITE);
/*  99 */     endereco.setForeground(Color.WHITE);
/* 100 */     telefone.setForeground(Color.WHITE);
/* 101 */     CPF.setForeground(Color.WHITE);
/* 102 */     RG.setForeground(Color.WHITE);
/* 103 */     checkIn.setForeground(Color.WHITE);
/* 104 */     checkOut.setForeground(Color.WHITE);
/* 106 */     this.p2 = new JPanel(new FlowLayout());
/* 107 */     this.p3 = new JPanel(new FlowLayout());
/* 108 */     this.p4 = new JPanel(new FlowLayout());
/* 109 */     this.p5 = new JPanel(new FlowLayout());
/* 110 */     this.p6 = new JPanel(new FlowLayout());
/* 111 */     this.p7 = new JPanel(new FlowLayout());
/* 112 */     this.p8 = new JPanel(new FlowLayout());
/* 113 */     this.p9 = new JPanel(new FlowLayout());
/* 115 */     Color cor = new Color(0, 191, 255);
/* 117 */     this.p2.setBackground(cor);
/* 118 */     this.p3.setBackground(cor);
/* 119 */     this.p4.setBackground(cor);
/* 120 */     this.p5.setBackground(cor);
/* 121 */     this.p6.setBackground(cor);
/* 122 */     this.p7.setBackground(cor);
/* 123 */     this.p8.setBackground(cor);
/* 124 */     this.p9.setBackground(cor);
/* 126 */     this.p2.add(nome);
/* 127 */     this.p3.add(idade);
/* 128 */     this.p4.add(email);
/* 129 */     this.p5.add(endereco);
/* 130 */     this.p6.add(telefone);
/* 131 */     this.p7.add(CPF);
/* 132 */     this.p8.add(RG);
/* 133 */     this.p9.add(checkIn);
/* 134 */     this.p9.add(checkOut);
/*     */   }
/*     */   
/*     */   public class OuvinteVoltarMostarDados implements ActionListener {
/*     */     public void actionPerformed(ActionEvent arg0) {
/* 140 */       ViewMostarDados.this.dispose();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\paulo\Desktop\Hospedagem Java\!\UI\view\ViewMostarDados.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */