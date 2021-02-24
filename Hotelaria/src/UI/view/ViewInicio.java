/*     */ package UI.view;
/*     */ 
/*     */ import UI.ouvintes.OuvinteViewCadastrarPessoa;
/*     */ import UI.ouvintes.OuvinteViewEditExclui;
/*     */ import Util.GerarDadosEmPDF;
/*     */ import backup.UparData;
/*     */ import java.awt.Color;
/*     */ import java.awt.FlowLayout;
/*     */ import java.awt.Font;
/*     */ import java.awt.GridLayout;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.util.ArrayList;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import system.ControllerGerenciador;
/*     */ import system.Pessoa;
/*     */ 
/*     */ public class ViewInicio extends ViewBase {
/*     */   private JPanel p0;
/*     */   
/*     */   private JPanel p1;
/*     */   
/*     */   private JPanel p4;
/*     */   
/*     */   private JPanel p5;
/*     */   
/*     */   private JPanel p7;
/*     */   
/*     */   public ViewInicio() {
/*  29 */     setLayout(new GridLayout(5, 1));
/*  30 */     add(this.p0);
/*  31 */     add(this.p4);
/*  32 */     add(this.p1);
/*  33 */     add(this.p5);
/*  34 */     add(this.p7);
/*     */   }
/*     */   
/*     */   public void adicionarBotoes() {
/*  37 */     OuvinteEditarAdmin ouvinteAdmin = new OuvinteEditarAdmin();
/*  38 */     JButton editarAdmin = new JButton("Editar Administrador");
/*  39 */     editarAdmin.setFont(new Font("Arial", 1, 18));
/*  40 */     editarAdmin.setBackground(Color.WHITE);
/*  41 */     editarAdmin.setIcon(new ImageIcon(getClass().getResource("/icons8-editar-usuário-masculino-30.png")));
/*  42 */     editarAdmin.addActionListener(ouvinteAdmin);
/*  44 */     OuvinteSair ouvinteSair = new OuvinteSair();
/*  45 */     JButton sair = new JButton("Sair");
/*  46 */     sair.setFont(new Font("Arial", 1, 24));
/*  47 */     sair.setBackground(Color.WHITE);
/*  48 */     sair.setIcon(new ImageIcon(getClass().getResource("/icons8-sair-30.png")));
/*  49 */     sair.addActionListener(ouvinteSair);
/*  51 */     OuvinteGerarPDF ouvintePDF = new OuvinteGerarPDF();
/*  52 */     JButton gerarPDF = new JButton("Gerar Dados Em PDF");
/*  53 */     gerarPDF.setFont(new Font("Arial", 1, 18));
/*  54 */     gerarPDF.setBackground(Color.WHITE);
/*  55 */     gerarPDF.setIcon(new ImageIcon(getClass().getResource("/icons8-impressão-20.png")));
/*  56 */     gerarPDF.addActionListener(ouvintePDF);
/*  58 */     OuvinteViewCadastrarPessoa ouvinteCadastrar = new OuvinteViewCadastrarPessoa(this);
/*  59 */     JButton cadastrar = new JButton("Cadastrar");
/*  60 */     cadastrar.setFont(new Font("Arial", 1, 18));
/*  61 */     cadastrar.setBackground(Color.WHITE);
/*  62 */     cadastrar.setIcon(new ImageIcon(getClass().getResource("/icons8-adicionar-administrador-filled-28.png")));
/*  63 */     cadastrar.addActionListener(ouvinteCadastrar);
/*  65 */     OuvinteViewEditExclui ouvinteEditExclui = new OuvinteViewEditExclui(this);
/*  66 */     JButton editExcluir = new JButton("Editar/Pesquisar");
/*  67 */     editExcluir.setFont(new Font("Arial", 1, 18));
/*  68 */     editExcluir.setBackground(Color.WHITE);
/*  69 */     editExcluir.setIcon(new ImageIcon(getClass().getResource("/icons8-excluir-25.png")));
/*  70 */     editExcluir.addActionListener((ActionListener)ouvinteEditExclui);
/*  72 */     OuvinteCarregar ouvinteCarregar = new OuvinteCarregar();
/*  73 */     JButton carregarDados = new JButton("Carregar Dados");
/*  74 */     carregarDados.setFont(new Font("Arial", 1, 18));
/*  75 */     carregarDados.setBackground(Color.WHITE);
/*  76 */     carregarDados.setIcon(new ImageIcon(getClass().getResource("/icons8-restauração-de-banco-de-dados-30.png")));
/*  77 */     carregarDados.addActionListener(ouvinteCarregar);
/*  79 */     OuvinteUpar ouvinteUpar = new OuvinteUpar();
/*  80 */     JButton uparDados = new JButton("Uploading de Dados");
/*  81 */     uparDados.setFont(new Font("Arial", 1, 18));
/*  82 */     uparDados.setBackground(Color.WHITE);
/*  83 */     uparDados.setIcon(new ImageIcon(getClass().getResource("/icons8-upload-para-nuvem-30.png")));
/*  84 */     uparDados.addActionListener(ouvinteUpar);
/*  86 */     this.p0 = new ViewFundo();
/*  87 */     this.p0.setLayout(new FlowLayout(0, 40, 20));
/*  88 */     this.p1 = new ViewFundo();
/*  89 */     this.p1.setLayout(new FlowLayout(1));
/*  90 */     this.p4 = new ViewFundo();
/*  91 */     this.p4.setLayout(new FlowLayout(1));
/*  92 */     this.p5 = new ViewFundo();
/*  93 */     this.p5.setLayout(new FlowLayout(1));
/*  94 */     this.p7 = new ViewFundo();
/*  95 */     this.p7.setLayout(new FlowLayout(1));
/*  97 */     this.p0.add(sair);
/*  98 */     this.p1.add(cadastrar);
/*  99 */     this.p1.add(editExcluir);
/* 100 */     this.p5.add(gerarPDF);
/* 101 */     this.p5.add(editarAdmin);
/* 102 */     this.p7.add(carregarDados);
/* 103 */     this.p7.add(uparDados);
/*     */   }
/*     */   
/*     */   public void adicionarJLabel() {
/* 108 */     JLabel nomeDoHotel = new JLabel("Sistema de Hotelaria");
/* 109 */     nomeDoHotel.setFont(new Font("Arial", 1, 40));
/* 110 */     nomeDoHotel.setForeground(Color.WHITE);
/* 111 */     this.p4.add(nomeDoHotel);
/*     */   }
/*     */   
/*     */   public class OuvinteSair implements ActionListener {
/*     */     public void actionPerformed(ActionEvent e) {
/* 118 */       int opcao = JOptionPane.showConfirmDialog(null, "Você dezeja sair?", "ATENÇÃO!", JOptionPane.YES_NO_OPTION);
/* 119 */       if (opcao == JOptionPane.YES_OPTION) {
/* 120 */         dispose();
/* 121 */       } else if (opcao == JOptionPane.NO_OPTION) {
/* 122 */         JOptionPane.showMessageDialog(null, "Obrigado(a) por ficar!");
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public class OuvinteGerarPDF implements ActionListener {
/*     */     public void actionPerformed(ActionEvent arg0) {
/* 129 */       ControllerGerenciador gerenciador = new ControllerGerenciador();
/* 130 */       ArrayList<Pessoa> pessoas = gerenciador.getPessoas();
/* 132 */       GerarDadosEmPDF gerador = new GerarDadosEmPDF();
/* 133 */       gerador.gerarDadosDoCliente(pessoas, "DadosDoHotel.pdf");
/* 134 */       JOptionPane.showMessageDialog(null, "PDF gerado com sucesso, confira a ÀREA DE TRABALHO!");
/*     */     }
/*     */   }
/*     */   
/*     */   public class OuvinteEditarAdmin implements ActionListener {
/*     */     public void actionPerformed(ActionEvent arg0) {
					new ViewEditarAdmin();
/* 143 */       	dispose();
/*     */     }
/*     */   }
/*     */   
/*     */   public class OuvinteCarregar implements ActionListener {
/*     */     public void actionPerformed(ActionEvent arg0) {
/* 151 */       ViewCarregarArquivos.carregarDados();
/*     */     }
/*     */   }
/*     */   
/*     */   public class OuvinteUpar implements ActionListener {
/*     */     public void actionPerformed(ActionEvent arg0) {
/* 158 */       UparData.uparData();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\paulo\Desktop\Hospedagem Java\!\UI\view\ViewInicio.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */