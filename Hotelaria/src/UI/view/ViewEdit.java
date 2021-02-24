/*     */ package UI.view;
/*     */ 
/*     */ import Exception.EmailInvalidoException;
/*     */ import Util.ValidacaoEmail;
/*     */ import Util.VerificacaoDeCampos;
/*     */ import java.awt.Color;
/*     */ import java.awt.FlowLayout;
/*     */ import java.awt.Font;
/*     */ import java.awt.GridLayout;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.text.ParseException;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFormattedTextField;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.text.MaskFormatter;
/*     */ import system.ControllerGerenciador;
/*     */ import system.Pessoa;
/*     */ 
/*     */ public class ViewEdit extends ViewBase {
/*     */   private String cpf;
/*     */   
/*     */   private JTextField campoNome;
/*     */   
/*     */   private JTextField campoIdade;
/*     */   
/*     */   private JTextField campoEmail;
/*     */   
/*     */   private JTextField campoEndereco;
/*     */   
/*     */   private JTextField campoCPF;
/*     */   
/*     */   private JTextField campoRG;
/*     */   
/*     */   private JTextField campoTelefone;
/*     */   
/*     */   private JTextField campoCheckIn;
/*     */   
/*     */   private JTextField campoCheckOut;
/*     */   
/*     */   private ControllerGerenciador gerenciador;
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
/*     */   public ViewEdit(String cpf) {
/*  51 */     this.cpf = cpf;
/*  52 */     adicionarTextField(cpf);
/*  53 */     setLayout(new GridLayout(11, 1));
/*  54 */     JLabel obrigatorio = new JLabel("*obrigatório");
/*  55 */     JLabel opcional = new JLabel("(opcional)");
/*  56 */     obrigatorio.setForeground(Color.RED);
/*  57 */     this.p2.add(obrigatorio);
/*  58 */     this.p3.add(opcional);
/*  59 */     this.p4.add(new JLabel("(opcional)"));
/*  60 */     this.p5.add(new JLabel("(opcional)"));
/*  61 */     obrigatorio = new JLabel("*obrigatório");
/*  62 */     obrigatorio.setForeground(Color.RED);
/*  63 */     this.p6.add(obrigatorio);
/*  64 */     obrigatorio = new JLabel("*obrigatório");
/*  65 */     obrigatorio.setForeground(Color.RED);
/*  66 */     this.p7.add(obrigatorio);
/*  67 */     obrigatorio = new JLabel("*obrigatório");
/*  68 */     obrigatorio.setForeground(Color.RED);
/*  69 */     this.p9.add(obrigatorio);
/*  70 */     this.p10.add(new JLabel("(opcional)"));
/*  71 */     add(this.p0);
/*  72 */     add(this.p1);
/*  73 */     add(this.p2);
/*  74 */     add(this.p3);
/*  75 */     add(this.p4);
/*  76 */     add(this.p5);
/*  77 */     add(this.p9);
/*  78 */     add(this.p6);
/*  79 */     add(this.p7);
/*  80 */     add(this.p10);
/*  81 */     add(this.p8);
/*     */   }
/*     */   
/*     */   public void adicionarBotoes() {
/*  85 */     this.p0 = new JPanel(new FlowLayout(0, 10, 10));
/*  86 */     this.p8 = new JPanel(new FlowLayout(1));
/*  87 */     OuvinteEdit ouvinteEdit = new OuvinteEdit();
/*  88 */     JButton editar = new JButton("Editar");
/*  89 */     editar.addActionListener(ouvinteEdit);
/*  90 */     editar.setFont(new Font("Arial", 1, 18));
/*  91 */     editar.setIcon(new ImageIcon(getClass().getResource("/icons8-editar-usuário-masculino-30.png")));
/*  93 */     OuvinteVoltarView ouvinte = new OuvinteVoltarView();
/*  94 */     JButton voltar = new JButton("Voltar");
/*  95 */     voltar.addActionListener(ouvinte);
/*  96 */     voltar.setFont(new Font("Arial", 1, 18));
/*  97 */     voltar.setIcon(new ImageIcon(getClass().getResource("/icons8-voltar-30.png")));
/*  99 */     this.p0.add(voltar);
/* 100 */     this.p8.add(editar);
/*     */   }
/*     */   
/*     */   public void adicionarJLabel() {
/* 105 */     this.p1 = new JPanel(new FlowLayout(1));
/* 106 */     this.p2 = new JPanel(new FlowLayout(1, 10, 0));
/* 107 */     this.p3 = new JPanel(new FlowLayout(1, 10, 0));
/* 108 */     this.p4 = new JPanel(new FlowLayout(1, 10, 0));
/* 109 */     this.p5 = new JPanel(new FlowLayout(1, 10, 0));
/* 110 */     this.p6 = new JPanel(new FlowLayout(1, 10, 0));
/* 111 */     this.p7 = new JPanel(new FlowLayout(1, 10, 0));
/* 112 */     this.p9 = new JPanel(new FlowLayout(1, 10, 0));
/* 113 */     this.p10 = new JPanel(new FlowLayout(1, 10, 0));
/* 115 */     JLabel cadastrar = new JLabel("Editar Dados");
/* 116 */     cadastrar.setFont(new Font("Arial", 1, 26));
/* 117 */     JLabel nome = new JLabel("Nome:");
/* 118 */     nome.setFont(new Font("Arial", 1, 18));
/* 119 */     JLabel idade = new JLabel("Idade:");
/* 120 */     idade.setFont(new Font("Arial", 1, 18));
/* 121 */     JLabel email = new JLabel("E-mail:");
/* 122 */     email.setFont(new Font("Arial", 1, 18));
/* 123 */     JLabel endereco = new JLabel("Endereço:");
/* 124 */     endereco.setFont(new Font("Arial", 1, 18));
/* 125 */     JLabel cpf = new JLabel("CPF:");
/* 126 */     cpf.setFont(new Font("Arial", 1, 18));
/* 127 */     JLabel rg = new JLabel("RG:");
/* 128 */     rg.setFont(new Font("Arial", 1, 18));
/* 129 */     JLabel telefone = new JLabel("Telefone:");
/* 130 */     telefone.setFont(new Font("Arial", 1, 18));
/* 131 */     JLabel check = new JLabel("Check in/Check out");
/* 132 */     check.setFont(new Font("Arial", 1, 18));
/* 134 */     this.p4.add(email);
/* 135 */     this.p5.add(endereco);
/* 136 */     this.p6.add(cpf);
/* 137 */     this.p7.add(rg);
/* 138 */     this.p1.add(cadastrar);
/* 139 */     this.p2.add(nome);
/* 140 */     this.p3.add(idade);
/* 141 */     this.p9.add(telefone);
/* 142 */     this.p10.add(check);
/*     */   }
/*     */   
/*     */   public void adicionarTextField(String cpf) {
/* 146 */     JLabel espaco = new JLabel("                                                       ");
/* 147 */     this.campoNome = new JTextField(20);
/* 148 */     this.campoNome.setFont(new Font("Times new roman", 1, 16));
/* 149 */     this.campoEmail = new JTextField(20);
/* 150 */     this.campoEmail.setFont(new Font("Times new roman", 1, 16));
/* 151 */     this.campoEndereco = new JTextField(20);
/* 152 */     this.campoEndereco.setFont(new Font("Times new roman", 1, 16));
/* 153 */     MaskFormatter mascaraCPF = null;
/* 154 */     MaskFormatter mascaraTelefone = null;
/* 155 */     MaskFormatter mascaraIdade = null;
/* 156 */     MaskFormatter mascaraCheckIn = null;
/* 157 */     MaskFormatter mascaraCheckOut = null;
/*     */     try {
/* 159 */       mascaraCPF = new MaskFormatter("###.###.###-##                                 ");
/* 160 */       mascaraTelefone = new MaskFormatter("(##) # ####-####                                 ");
/* 161 */       mascaraIdade = new MaskFormatter("##   ");
/* 162 */       mascaraCheckIn = new MaskFormatter("##/##/####          ");
/* 163 */       mascaraCheckOut = new MaskFormatter("##/##/####          ");
/* 164 */     } catch (ParseException e) {
/* 165 */       e.printStackTrace();
/*     */     } 
/* 167 */     this.campoIdade = new JFormattedTextField(mascaraIdade);
/* 168 */     this.campoIdade.setFont(new Font("Times new roman", 1, 16));
/* 169 */     this.campoCPF = new JFormattedTextField(mascaraCPF);
/* 170 */     this.campoCPF.setFont(new Font("Times new roman", 1, 16));
/* 171 */     this.campoRG = new JTextField(15);
/* 172 */     this.campoRG.setFont(new Font("Times new roman", 1, 16));
/* 173 */     this.campoTelefone = new JFormattedTextField(mascaraTelefone);
/* 174 */     this.campoTelefone.setFont(new Font("Times new roman", 1, 16));
/* 175 */     this.campoCheckIn = new JFormattedTextField(mascaraCheckIn);
/* 176 */     this.campoCheckIn.setFont(new Font("Times new roman", 1, 16));
/* 177 */     this.campoCheckOut = new JFormattedTextField(mascaraCheckOut);
/* 178 */     this.campoCheckOut.setFont(new Font("Times new roman", 1, 16));
/* 180 */     this.gerenciador = new ControllerGerenciador();
/* 181 */     Pessoa pessoaDados = this.gerenciador.pesquisa(cpf);
/* 183 */     this.campoNome.setText(pessoaDados.getNome());
/* 184 */     this.campoIdade.setText(pessoaDados.getIdade()+"");
/* 185 */     this.campoEmail.setText(pessoaDados.getEmail());
/* 186 */     this.campoEndereco.setText(pessoaDados.getEndereco());
/* 187 */     this.campoTelefone.setText(pessoaDados.getTelefone());
/* 188 */     this.campoCPF.setText(pessoaDados.getCpf());
/* 189 */     this.campoRG.setText(pessoaDados.getRg());
/* 190 */     this.campoCheckIn.setText(pessoaDados.getCheckIn());
/* 191 */     this.campoCheckOut.setText(pessoaDados.getCheckOut());
/* 193 */     this.p4.add(this.campoEmail);
/* 194 */     this.p5.add(this.campoEndereco);
/* 195 */     this.p6.add(this.campoCPF);
/* 196 */     this.p7.add(this.campoRG);
/* 197 */     this.p2.add(this.campoNome);
/* 198 */     this.p3.add(this.campoIdade);
/* 199 */     this.p3.add(espaco);
/* 200 */     this.p9.add(this.campoTelefone);
/* 201 */     this.p10.add(this.campoCheckIn);
/* 202 */     this.p10.add(this.campoCheckOut);
/*     */   }
/*     */   
/*     */   public class OuvinteEdit implements ActionListener {
/*     */     public void actionPerformed(ActionEvent arg0) {
/* 208 */       Pessoa pessoa = ViewEdit.this.gerenciador.pesquisa(ViewEdit.this.cpf);
/*     */       try {
/* 210 */         String cpf = ViewEdit.this.gerenciador.reveterFormatacaoCPF(ViewEdit.this.campoCPF.getText());
/* 211 */         String rg = ViewEdit.this.campoRG.getText();
/* 212 */         ViewEdit.this.gerenciador.compararCPFeRG(cpf, rg);
/* 213 */         pessoa.setCpf(cpf);
/* 214 */         VerificacaoDeCampos.verificar(ViewEdit.this.campoNome.getText());
/* 215 */         pessoa.setNome(ViewEdit.this.campoNome.getText());
/* 216 */         ViewEdit.this.gerenciador.confirirRG(rg);
/* 217 */         pessoa.setRg(rg);
/* 218 */         pessoa.setTelefone(ViewEdit.this.gerenciador.reveterFormatacaoTelefone(ViewEdit.this.campoTelefone.getText()));
/* 219 */         pessoa.setCheckIn(ViewEdit.this.gerenciador.reverterFormatacaoCheck(ViewEdit.this.campoCheckIn.getText()));
/* 220 */         pessoa.setCheckOut(ViewEdit.this.gerenciador.reverterFormatacaoCheck(ViewEdit.this.campoCheckOut.getText()));
/* 221 */         if (!ViewEdit.this.campoEmail.getText().equals(""))
/* 222 */           ValidacaoEmail.validarEmail(ViewEdit.this.campoEmail.getText()); 
/* 224 */         pessoa.setEmail(ViewEdit.this.campoEmail.getText());
/* 225 */         pessoa.setEndereco(ViewEdit.this.campoEndereco.getText());
/* 226 */         pessoa.setIdade(ViewEdit.this.gerenciador.reveterFormatacaoIdade(ViewEdit.this.campoIdade.getText()));
/* 227 */         ViewEdit.this.gerenciador.atualizar();
/* 229 */         ViewEdit.this.campoCPF.setText("");
/* 230 */         ViewEdit.this.campoTelefone.setText("");
/* 231 */         ViewEdit.this.campoEmail.setText("");
/* 232 */         ViewEdit.this.campoEndereco.setText("");
/* 233 */         ViewEdit.this.campoIdade.setText("");
/* 234 */         ViewEdit.this.campoNome.setText("");
/* 235 */         ViewEdit.this.campoRG.setText("");
/* 236 */         ViewEdit.this.campoCheckIn.setText("");
/* 237 */         ViewEdit.this.campoCheckOut.setText("");
/* 239 */         JOptionPane.showMessageDialog(null, "Dados Atualizados!");
/* 241 */         ViewEdit.this.dispose();
/* 242 */       } catch (EmailInvalidoException emailInvalido) {
/* 243 */         JOptionPane.showMessageDialog(null, emailInvalido.getMessage());
/* 244 */         ViewEdit.this.campoEmail.setText("");
/* 246 */       } catch (Exception e) {
/* 247 */         JOptionPane.showMessageDialog(null, "Verifique os campos obrigatorios!");
/*     */       } 
/* 250 */       ViewEdit.this.campoCPF.setText("");
/* 251 */       ViewEdit.this.campoTelefone.setText("");
/* 252 */       ViewEdit.this.campoNome.setText("");
/* 253 */       ViewEdit.this.campoRG.setText("");
/*     */     }
/*     */   }
/*     */   
/*     */   public class OuvinteVoltarView implements ActionListener {
/*     */     public void actionPerformed(ActionEvent arg0) {
/* 262 */       ViewEdit.this.dispose();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\paulo\Desktop\Hospedagem Java\!\UI\view\ViewEdit.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */