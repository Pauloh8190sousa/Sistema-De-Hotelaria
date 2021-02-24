/*     */ package UI.view;
/*     */ 
/*     */ import UI.ouvintes.OuvinteCadastrarPessoa;
/*     */ import UI.ouvintes.OuvinteVoltarInicio;
/*     */ import java.awt.Color;
/*     */ import java.awt.FlowLayout;
/*     */ import java.awt.Font;
/*     */ import java.awt.GridLayout;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.text.ParseException;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFormattedTextField;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.text.MaskFormatter;
/*     */ 
/*     */ public class ViewCadastrarPessoa extends ViewBase {
/*     */   private JTextField campoNome;
/*     */   
/*     */   private JTextField campoIdade;
/*     */   
/*     */   private JTextField campoEmail;
/*     */   
/*     */   private JTextField campoEndereco;
/*     */   
/*     */   private JTextField campoTelefone;
/*     */   
/*     */   private JTextField campoCPF;
/*     */   
/*     */   private JTextField campoRG;
/*     */   
/*     */   private JTextField campoCheckIn;
/*     */   
/*     */   private JTextField campoCheckOut;
/*     */   
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
/*     */   private JPanel p10;
/*     */   
/*     */   public ViewCadastrarPessoa() {
/*  43 */     setLayout(new GridLayout(11, 1));
/*  44 */     JLabel obrigatorio = new JLabel("*obrigatório");
/*  45 */     JLabel opcional = new JLabel("(opcional)");
/*  46 */     obrigatorio.setForeground(Color.RED);
/*  47 */     this.p2.add(obrigatorio);
/*  48 */     this.p3.add(opcional);
/*  49 */     this.p4.add(new JLabel("(opcional)"));
/*  50 */     this.p5.add(new JLabel("(opcional)"));
/*  51 */     obrigatorio = new JLabel("*obrigatório");
/*  52 */     obrigatorio.setForeground(Color.RED);
/*  53 */     this.p6.add(obrigatorio);
/*  54 */     obrigatorio = new JLabel("*obrigatório");
/*  55 */     obrigatorio.setForeground(Color.RED);
/*  56 */     this.p7.add(obrigatorio);
/*  57 */     obrigatorio = new JLabel("*obrigatório");
/*  58 */     obrigatorio.setForeground(Color.RED);
/*  59 */     this.p9.add(obrigatorio);
/*  60 */     this.p10.add(new JLabel("(opcional)"));
/*  61 */     add(this.p0);
/*  62 */     add(this.p1);
/*  63 */     add(this.p2);
/*  64 */     add(this.p3);
/*  65 */     add(this.p4);
/*  66 */     add(this.p5);
/*  67 */     add(this.p9);
/*  68 */     add(this.p6);
/*  69 */     add(this.p7);
/*  70 */     add(this.p10);
/*  71 */     add(this.p8);
/*     */   }
/*     */   
/*     */   public void adicionarBotoes() {
/*  75 */     this.p0 = new JPanel(new FlowLayout(0, 10, 10));
/*  76 */     this.p8 = new JPanel(new FlowLayout(1));
/*  77 */     OuvinteCadastrarPessoa ouvinteCadastrar = new OuvinteCadastrarPessoa(this);
/*  78 */     JButton adicionar = new JButton("Cadastrar");
/*  79 */     adicionar.addActionListener((ActionListener)ouvinteCadastrar);
/*  80 */     adicionar.setFont(new Font("Arial", 1, 18));
/*  81 */     adicionar.setIcon(new ImageIcon(getClass().getResource("/icons8-adicionar-administrador-filled-28.png")));
/*  83 */     OuvinteVoltarInicio voltarOuvinte = new OuvinteVoltarInicio(this);
/*  84 */     JButton voltar = new JButton("Voltar");
/*  85 */     voltar.addActionListener(voltarOuvinte);
/*  86 */     voltar.setFont(new Font("Arial", 1, 18));
/*  87 */     voltar.setIcon(new ImageIcon(getClass().getResource("/icons8-voltar-30.png")));
/*  88 */     this.p0.add(voltar);
/*  89 */     this.p8.add(adicionar);
/*     */   }
/*     */   
/*     */   public void adicionarJLabel() {
/*  94 */     this.p1 = new JPanel(new FlowLayout(1));
/*  95 */     this.p2 = new JPanel(new FlowLayout(1, 10, 0));
/*  96 */     this.p3 = new JPanel(new FlowLayout(1, 10, 0));
/*  97 */     this.p4 = new JPanel(new FlowLayout(1, 10, 0));
/*  98 */     this.p5 = new JPanel(new FlowLayout(1, 10, 0));
/*  99 */     this.p6 = new JPanel(new FlowLayout(1, 10, 0));
/* 100 */     this.p7 = new JPanel(new FlowLayout(1, 10, 0));
/* 101 */     this.p9 = new JPanel(new FlowLayout(1, 10, 0));
/* 102 */     this.p10 = new JPanel(new FlowLayout(1, 10, 0));
/* 104 */     JLabel cadastrar = new JLabel("Cadastrar");
/* 105 */     cadastrar.setFont(new Font("Arial", 1, 26));
/* 106 */     JLabel nome = new JLabel("Nome:");
/* 107 */     nome.setFont(new Font("Arial", 1, 18));
/* 108 */     JLabel idade = new JLabel("Idade:");
/* 109 */     idade.setFont(new Font("Arial", 1, 18));
/* 110 */     JLabel email = new JLabel("E-mail:");
/* 111 */     email.setFont(new Font("Arial", 1, 18));
/* 112 */     JLabel endereco = new JLabel("Endereço:");
/* 113 */     endereco.setFont(new Font("Arial", 1, 18));
/* 114 */     JLabel cpf = new JLabel("CPF:");
/* 115 */     cpf.setFont(new Font("Arial", 1, 18));
/* 116 */     JLabel rg = new JLabel("RG:");
/* 117 */     rg.setFont(new Font("Arial", 1, 18));
/* 118 */     JLabel telefone = new JLabel("Telefone:");
/* 119 */     telefone.setFont(new Font("Arial", 1, 18));
/* 120 */     JLabel check = new JLabel("Check in/Check out");
/* 121 */     check.setFont(new Font("Arial", 1, 18));
/* 123 */     this.p4.add(email);
/* 124 */     this.p5.add(endereco);
/* 125 */     this.p6.add(cpf);
/* 126 */     this.p7.add(rg);
/* 127 */     this.p1.add(cadastrar);
/* 128 */     this.p2.add(nome);
/* 129 */     this.p3.add(idade);
/* 130 */     this.p9.add(telefone);
/* 131 */     this.p10.add(check);
/*     */   }
/*     */   
/*     */   public void adicionarTextField() {
/* 136 */     JLabel espaco = new JLabel("                                                       ");
/* 137 */     this.campoNome = new JTextField(20);
/* 138 */     this.campoNome.setFont(new Font("Times new roman", 1, 16));
/* 139 */     this.campoEmail = new JTextField(20);
/* 140 */     this.campoEmail.setFont(new Font("Times new roman", 1, 16));
/* 141 */     this.campoEndereco = new JTextField(20);
/* 142 */     this.campoEndereco.setFont(new Font("Times new roman", 1, 16));
/* 143 */     MaskFormatter mascaraCPF = null;
/* 144 */     MaskFormatter mascaraTelefone = null;
/* 145 */     MaskFormatter mascaraIdade = null;
/* 146 */     MaskFormatter mascaraCheckIn = null;
/* 147 */     MaskFormatter mascaraCheckOut = null;
/*     */     try {
/* 149 */       mascaraCPF = new MaskFormatter("###.###.###-##                                 ");
/* 150 */       mascaraTelefone = new MaskFormatter("(##) # ####-####                                 ");
/* 151 */       mascaraIdade = new MaskFormatter("##   ");
/* 152 */       mascaraCheckIn = new MaskFormatter("##/##/####          ");
/* 153 */       mascaraCheckOut = new MaskFormatter("##/##/####          ");
/* 154 */     } catch (ParseException e) {
/* 155 */       e.printStackTrace();
/*     */     } 
/* 158 */     this.campoIdade = new JFormattedTextField(mascaraIdade);
/* 159 */     this.campoIdade.setFont(new Font("Times new roman", 1, 16));
/* 160 */     this.campoCPF = new JFormattedTextField(mascaraCPF);
/* 161 */     this.campoCPF.setFont(new Font("Times new roman", 1, 16));
/* 162 */     this.campoRG = new JTextField(15);
/* 163 */     this.campoRG.setFont(new Font("Times new roman", 1, 16));
/* 164 */     this.campoTelefone = new JFormattedTextField(mascaraTelefone);
/* 165 */     this.campoTelefone.setFont(new Font("Times new roman", 1, 16));
/* 166 */     this.campoCheckIn = new JFormattedTextField(mascaraCheckIn);
/* 167 */     this.campoCheckIn.setFont(new Font("Times new roman", 1, 16));
/* 168 */     this.campoCheckOut = new JFormattedTextField(mascaraCheckOut);
/* 169 */     this.campoCheckOut.setFont(new Font("Times new roman", 1, 16));
/* 171 */     this.p4.add(this.campoEmail);
/* 172 */     this.p5.add(this.campoEndereco);
/* 173 */     this.p6.add(this.campoCPF);
/* 174 */     this.p7.add(this.campoRG);
/* 175 */     this.p2.add(this.campoNome);
/* 176 */     this.p3.add(this.campoIdade);
/* 177 */     this.p3.add(espaco);
/* 178 */     this.p9.add(this.campoTelefone);
/* 179 */     this.p10.add(this.campoCheckIn);
/* 180 */     this.p10.add(this.campoCheckOut);
/*     */   }
/*     */   
/*     */   public JTextField getCampoNome() {
/* 184 */     return this.campoNome;
/*     */   }
/*     */   
/*     */   public JTextField getCampoIdade() {
/* 188 */     return this.campoIdade;
/*     */   }
/*     */   
/*     */   public JTextField getCampoEmail() {
/* 192 */     return this.campoEmail;
/*     */   }
/*     */   
/*     */   public JTextField getCampoEndereco() {
/* 196 */     return this.campoEndereco;
/*     */   }
/*     */   
/*     */   public JTextField getCampoCPF() {
/* 200 */     return this.campoCPF;
/*     */   }
/*     */   
/*     */   public JTextField getCampoRG() {
/* 204 */     return this.campoRG;
/*     */   }
/*     */   
/*     */   public JTextField getCampoTelefone() {
/* 207 */     return this.campoTelefone;
/*     */   }
/*     */   
/*     */   public JTextField getCampoCheckIn() {
/* 210 */     return this.campoCheckIn;
/*     */   }
/*     */   
/*     */   public JTextField getCampoCheckOut() {
/* 213 */     return this.campoCheckOut;
/*     */   }
/*     */ }


/* Location:              C:\Users\paulo\Desktop\Hospedagem Java\!\UI\view\ViewCadastrarPessoa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */