package UI.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Exception.EmailInvalidoException;
import Util.ValidacaoEmail;
import system.ControllerGerenciador;

public class ViewCadastrarEmailEmpresa extends ViewBase{

	   private JTextField campoEmail;
	   
	   private JPasswordField campoSenha;
	   
	   private JPanel p1;
	   
	   private JPanel p2;
	  
	   private JPanel p3;
	   
	   private JPanel p4;
	  
	   private JPanel p5;
	   
	   public ViewCadastrarEmailEmpresa() {
	     setLayout(new GridLayout(5, 1));
	     Color corFundo = new Color(0, 255, 121);
	     this.p1.setBackground(corFundo);
	     this.p2.setBackground(corFundo);
	     this.p3.setBackground(corFundo);
	     this.p4.setBackground(corFundo);
	     this.p5.setBackground(corFundo);
	     add(this.p4);
	     add(this.p1);
	     add(this.p2);
	     add(this.p3);
	     add(this.p5);
	   }
	   
	   public void adicionarBotoes() {
	     this.p5 = new JPanel(new FlowLayout(1));
	     this.p3 = new JPanel(new FlowLayout(1, 0, 30));
	     OuvinteCadastrar ouvinte = new OuvinteCadastrar();
	     JButton cadastrar = new JButton("Cadastrar E-mail no Sistema");
	     cadastrar.addActionListener(ouvinte);
	     cadastrar.setFont(new Font("Arial", 1, 18));
	     cadastrar.setBackground(Color.WHITE);
	     cadastrar.setIcon(new ImageIcon(getClass().getResource("/icons8-adicionar-administrador-filled-28.png")));
	     OuvinteCarregar ouvinteCarregar = new OuvinteCarregar(this);
	     JButton carregarDados = new JButton("Carregar Dados");
	     carregarDados.setFont(new Font("Arial", 1, 18));
	     carregarDados.setBackground(Color.WHITE);
	     carregarDados.addActionListener(ouvinteCarregar);
	     carregarDados.setIcon(new ImageIcon(getClass().getResource("/icons8-restauração-de-banco-de-dados-30.png")));
	     this.p5.add(carregarDados);
	     this.p3.add(cadastrar);
	   }
	   
	   public void adicionarJLabel() {
	     this.p1 = new JPanel(new FlowLayout(1, 20, 20));
	     this.p2 = new JPanel(new FlowLayout(1, 20, 10));
	     this.p4 = new JPanel(new FlowLayout(1, 0, 50));
	     JLabel email = new JLabel("E-mail");
	     JLabel senha = new JLabel("Senha do email");
	     JLabel cadastrar = new JLabel("Cadastrar E-mail da Empresa");
	     email.setFont(new Font("Arial", 1, 18));
	     senha.setFont(new Font("Arial", 1, 18));
	     cadastrar.setFont(new Font("Arial", 1, 24));
	     this.p2.add(senha);
	     this.p1.add(email);
	     this.p4.add(cadastrar);
	   }
	  
	   public void adicionarTextField() {
	     this.campoEmail = new JTextField(40);
	     this.campoEmail.setFont(new Font("Arial", 0, 18));
	     this.campoEmail.setForeground(Color.GRAY);
	     this.campoSenha = new JPasswordField(40);
	     this.campoEmail.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	     this.campoSenha.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	     this.campoSenha.setFont(new Font("Arial", 0, 18));
	     this.campoSenha.setForeground(Color.GRAY);
	     this.p1.add(this.campoEmail);
	     this.p2.add(this.campoSenha);
	   }
	   
	   public class OuvinteCadastrar implements ActionListener {
	     public void actionPerformed(ActionEvent arg0) {
	       ControllerGerenciador gerenciador = new ControllerGerenciador();
	       String senha = new String(campoSenha.getPassword());
	       if (!campoEmail.getText().equals("") && !senha.equals("") && senha.length() > 4) {
	         try {
	           ValidacaoEmail.validarEmail(campoEmail.getText());
	           gerenciador.adicionarEmpresa(campoEmail.getText(), senha);
	           JOptionPane.showMessageDialog(null, "E-mail da empresa Cadastrado!");
			   new ViewCadastrarAdmin();
	           dispose();
	         } catch (EmailInvalidoException e) {
	           JOptionPane.showMessageDialog(null, e.getMessage());
	         } 
	       } else {
	         JOptionPane.showMessageDialog(null, "Campo vazio ou Senha menor que 4 caracteres");
	       } 
	       campoEmail.setText("");
	       campoSenha.setText("");
	     }
	   }
	   
	   public class OuvinteCarregar implements ActionListener {
	     private JFrame jframe;
	     
	     public OuvinteCarregar(JFrame jframe) {
	       this.jframe = jframe;
	     }
	     
	     public void actionPerformed(ActionEvent arg0) {
	       ViewCarregarArquivos.carregarDados(this.jframe);
	     }
	   }
}
