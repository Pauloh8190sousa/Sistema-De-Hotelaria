/*     */ package UI.view;
/*     */ 
/*     */ import UI.ouvintes.OuvinteVoltarInicio;
/*     */ import Util.Email;
/*     */ import Util.Navegador;
/*     */ import Util.TestarInternet;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.FlowLayout;
/*     */ import java.awt.Font;
/*     */ import java.awt.GridLayout;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.KeyListener;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.awt.event.MouseListener;
/*     */ import java.net.MalformedURLException;
/*     */ import java.net.URL;
/*     */ import java.util.ArrayList;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.table.DefaultTableModel;
/*     */ import system.ControllerGerenciador;
/*     */ import system.Pessoa;
/*     */ 
/*     */ public class ViewEditExclui extends ViewBase {
/*     */   private JTable tabela;
/*     */   
/*     */   private DefaultTableModel model;
/*     */   
/*     */   private ControllerGerenciador gerenciador;
/*     */   
/*     */   private JTextField campoPes;
/*     */   
/*     */   private JPanel p1;
/*     */   
/*     */   private JScrollPane painel;
/*     */   
/*     */   private JLabel esqueciSenha;
/*     */   
/*     */   public class OuvinteEsqueciSenha implements MouseListener {
/*     */     public void mouseClicked(MouseEvent arg0) {
/* 193 */       final Email email = new Email();
/* 194 */       final int token = (int)(1.0D + Math.random() * 1000.0D);
/* 195 */       boolean internet = TestarInternet.testarConexao();
/* 196 */       if (!internet) {
/* 197 */         JOptionPane.showMessageDialog(null, "Sem conexão com a internet!");
/*     */       } else {
/* 199 */         (new Thread() {
/*     */             public void run() {
/* 201 */               String destino = gerenciador.getAdministrador().getEmail();
/* 202 */               email.enviarEmail(destino, "Redefinir senha", "TOKEN PARA REDEFINIR SENHA: " + token);
/* 204 */               gerenciador.getAdministrador().addToken(token);
/* 205 */               gerenciador.atualizar();
/* 206 */               dispose();
/* 207 */               URL url = null;
/*     */               try {
/* 209 */                 url = new URL("https://mail.google.com/");
/* 210 */                 Navegador.openWebpage(url);
/* 211 */                 JOptionPane.showMessageDialog(null, "ABRINDO E-MAIL");
/* 212 */               } catch (MalformedURLException e) {
/* 213 */                 e.printStackTrace();
/*     */               } 
/*     */             }
/* 216 */           }).start();
/*     */       } 
/*     */     }
/*     */     
/*     */     public void mouseEntered(MouseEvent arg0) {
/* 222 */       ViewEditExclui.this.esqueciSenha.setFont(new Font("Arial", 2, 18));
/* 223 */       ViewEditExclui.this.esqueciSenha.setForeground(Color.blue);
/*     */     }
/*     */     
/*     */     public void mouseExited(MouseEvent arg0) {
/* 227 */       ViewEditExclui.this.esqueciSenha.setFont(new Font("Arial", 1, 18));
/* 228 */       ViewEditExclui.this.esqueciSenha.setForeground(Color.BLACK);
/*     */     }
/*     */     
/*     */     public void mousePressed(MouseEvent arg0) {}
/*     */     
/*     */     public void mouseReleased(MouseEvent arg0) {}
/*     */   }
/*     */   
/*     */   public ViewEditExclui() {
/*     */     OuvinteEsqueciSenha ouvinteEsqueci = new OuvinteEsqueciSenha();
/*     */     this.esqueciSenha = new JLabel("Esqueceu a senha?");
/*     */     this.esqueciSenha.setFont(new Font("Arial", 1, 18));
/*     */     this.esqueciSenha.addMouseListener(ouvinteEsqueci);
/*     */     setLayout(new GridLayout(2, 1));
/*     */     this.p1.setBackground(Color.LIGHT_GRAY);
/*     */     this.p1.add(this.esqueciSenha);
/*     */     add(this.p1);
/*     */     add(this.painel);
/*     */   }
/*     */   
/*     */   public void adicionarBotoes() {
/*     */     this.p1 = new JPanel(new FlowLayout(0, 30, 30));
/*     */     OuvinteVoltarInicio voltarOuvinte = new OuvinteVoltarInicio(this);
/*     */     JButton voltar = new JButton("Voltar");
/*     */     voltar.setFont(new Font("Arial", 1, 18));
/*     */     voltar.addActionListener((ActionListener)voltarOuvinte);
/*     */     voltar.setIcon(new ImageIcon(getClass().getResource("/icons8-voltar-30.png")));
/*     */     voltar.setBounds(5, 5, 80, 30);
/*     */     this.p1.add(voltar);
/*     */   }
/*     */   
/*     */   public void adicionarJLabel() {}
/*     */   
/*     */   public void adicionarTabela() {
/*     */     this.model = new DefaultTableModel();
/*     */     this.model.addColumn("Nome");
/*     */     this.model.addColumn("CPF");
/*     */     this.model.addColumn("RG");
/*     */     this.model.addColumn("Data");
/*     */     this.gerenciador = new ControllerGerenciador();
/*     */     ArrayList<Pessoa> pessoas = this.gerenciador.getPessoas();
/*     */     for (Pessoa p : pessoas) {
/*     */       this.model.addRow(new Object[] { p.getNome(), p.getCpf(), p.getRg(), p.getDataCadastro() });
/*     */     } 
/*     */     OuvinteTabela ouvinteTabela = new OuvinteTabela();
/*     */     this.tabela = new JTable(this.model);
/*     */     this.tabela.addMouseListener(ouvinteTabela);
/*     */     Color cor = new Color(135, 206, 235);
/*     */     this.tabela.setBackground(cor);
/*     */     this.tabela.setToolTipText("Clique para editar ou excluir!");
/*     */     this.tabela.setForeground(Color.BLACK);
/*     */     this.tabela.setFont(new Font("Times new roman", 0, 18));
/*     */     this.painel = new JScrollPane(this.tabela);
/*     */   }
/*     */   
/*     */   public void adicionarTextField() {
/*     */     OuvinteCampo ouvinte = new OuvinteCampo();
/*     */     this.campoPes = new JTextField(40);
/*     */     this.campoPes.addKeyListener(ouvinte);
/*     */     this.p1.add(this.campoPes);
/*     */   }
/*     */   
/*     */   public class OuvinteCampo implements KeyListener {
/*     */     public void keyPressed(KeyEvent arg0) {}
/*     */     
/*     */     public void keyReleased(KeyEvent arg0) {
/*     */       ViewEditExclui.this.model = new DefaultTableModel();
/*     */       ViewEditExclui.this.model.addColumn("Nome");
/*     */       ViewEditExclui.this.model.addColumn("CPF");
/*     */       ViewEditExclui.this.model.addColumn("RG");
/*     */       ViewEditExclui.this.model.addColumn("Data");
/*     */       String filtro = ViewEditExclui.this.campoPes.getText().toLowerCase();
/*     */       for (Pessoa p : ViewEditExclui.this.gerenciador.getPessoas()) {
/*     */         if (p.getNome().toLowerCase().contains(filtro) || p.getCpf().contains(filtro) || p.getRg().contains(filtro) || p.getDataCadastro().contains(filtro)) {
/*     */           Object[] row = { p.getNome(), p.getCpf(), p.getRg(), p.getDataCadastro() };
/*     */           ViewEditExclui.this.model.addRow(row);
/*     */         } 
/*     */       } 
/*     */       ViewEditExclui.this.tabela.setModel(ViewEditExclui.this.model);
/*     */     }
/*     */     
/*     */     public void keyTyped(KeyEvent arg0) {}
/*     */   }
/*     */   
/*     */   public class OuvinteTabela implements MouseListener {
/*     */     public void mouseClicked(MouseEvent arg0) {
/*     */       Object obj = ViewEditExclui.this.model.getValueAt(ViewEditExclui.this.tabela.getSelectedRow(), 1);
/*     */       String cpfPessoa = String.valueOf(obj);
/*     */       Object[] lista = { "Excluir", "Editar", "Dados Do Cadastro" };
/*     */       int opcao = JOptionPane.showOptionDialog(null, "O QUE DESEJA FAZER?", "Atenção", -1, 3, null, lista, lista[0]);
/*     */       if (opcao == 1) {
/*     */         ViewEditExclui.this.dispose();
/*     */       } else if (opcao == 2) {
/*     */         ViewEditExclui.this.dispose();
/*     */       } else if (opcao == 0) {
/*     */         int sair = 10;
/*     */         while (sair != -1) {
/*     */           String senha = JOptionPane.showInputDialog((Component)null, "Senha:");
/*     */           if (senha == null) {
/*     */             sair = -1;
/*     */             continue;
/*     */           } 
/*     */           if (senha.equals(ViewEditExclui.this.gerenciador.getAdministrador().getSenha())) {
/*     */             ViewEditExclui.this.gerenciador.removePessoa(cpfPessoa);
/*     */             ViewEditExclui.this.model = new DefaultTableModel();
/*     */             ViewEditExclui.this.model.addColumn("Nome");
/*     */             ViewEditExclui.this.model.addColumn("CPF");
/*     */             ViewEditExclui.this.model.addColumn("RG");
/*     */             for (Pessoa p : ViewEditExclui.this.gerenciador.getPessoas()) {
/*     */               Object[] row = { p.getNome(), p.getCpf(), p.getRg() };
/*     */               ViewEditExclui.this.model.addRow(row);
/*     */             } 
/*     */             ViewEditExclui.this.tabela.setModel(ViewEditExclui.this.model);
/*     */             JOptionPane.showMessageDialog(null, "Pessoa excluida");
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*     */     public void mouseEntered(MouseEvent arg0) {}
/*     */     
/*     */     public void mouseExited(MouseEvent arg0) {}
/*     */     
/*     */     public void mousePressed(MouseEvent arg0) {}
/*     */     
/*     */     public void mouseReleased(MouseEvent arg0) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\paulo\Desktop\Hospedagem Java\!\UI\view\ViewEditExclui.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */