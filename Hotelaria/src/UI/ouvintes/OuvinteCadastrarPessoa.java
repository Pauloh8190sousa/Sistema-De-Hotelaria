/*    */ package UI.ouvintes;
/*    */ 
/*    */ import Exception.EmailInvalidoException;
/*    */ import UI.view.ViewCadastrarPessoa;
/*    */ import Util.ValidacaoEmail;
/*    */ import Util.VerificacaoDeCampos;
/*    */ import java.awt.Component;
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import javax.swing.JOptionPane;
/*    */ import system.ControllerGerenciador;
/*    */ 
/*    */ public class OuvinteCadastrarPessoa implements ActionListener {
/*    */   private ViewCadastrarPessoa viewCadastrar;
/*    */   
/*    */   public OuvinteCadastrarPessoa(ViewCadastrarPessoa viewCadastrar) {
/* 17 */     this.viewCadastrar = viewCadastrar;
/*    */   }
/*    */   
/*    */   public void actionPerformed(ActionEvent arg0) {
/* 20 */     ControllerGerenciador control = new ControllerGerenciador();
/* 22 */     String nome = this.viewCadastrar.getCampoNome().getText();
/* 23 */     int idade = control.reveterFormatacaoIdade(this.viewCadastrar.getCampoIdade().getText());
/* 24 */     String endereco = this.viewCadastrar.getCampoEndereco().getText();
/* 25 */     String checkIn = control.reverterFormatacaoCheck(this.viewCadastrar.getCampoCheckIn().getText());
/* 26 */     String checkOut = control.reverterFormatacaoCheck(this.viewCadastrar.getCampoCheckOut().getText());
/*    */     try {
/* 28 */       String email = this.viewCadastrar.getCampoEmail().getText();
/* 29 */       if (!email.equals(""))
/* 30 */         ValidacaoEmail.validarEmail(email); 
/* 32 */       String telefone = control.reveterFormatacaoTelefone(this.viewCadastrar.getCampoTelefone().getText());
/* 33 */       String cpf = control.reveterFormatacaoCPF(this.viewCadastrar.getCampoCPF().getText());
/* 34 */       String rg = this.viewCadastrar.getCampoRG().getText();
/* 35 */       control.confirirRG(rg);
/* 36 */       VerificacaoDeCampos.verificar(nome);
/* 38 */       boolean ok = control.addPessoa(nome, idade, email, endereco, cpf, rg, telefone, checkIn, checkOut);
/* 39 */       if (ok) {
/* 40 */         JOptionPane.showMessageDialog(viewCadastrar, "PESSOA CADASTRADA!");
/* 41 */         this.viewCadastrar.getCampoEmail().setText("");
/* 42 */         this.viewCadastrar.getCampoEndereco().setText("");
/* 43 */         this.viewCadastrar.getCampoIdade().setText("");
/* 44 */         this.viewCadastrar.getCampoCPF().setText("");
/* 45 */         this.viewCadastrar.getCampoNome().setText("");
/* 46 */         this.viewCadastrar.getCampoRG().setText("");
/* 47 */         this.viewCadastrar.getCampoTelefone().setText("");
/* 48 */         this.viewCadastrar.getCampoCheckIn().setText("");
/* 49 */         this.viewCadastrar.getCampoCheckOut().setText("");
/*    */       } else {
/* 51 */         JOptionPane.showMessageDialog((Component)this.viewCadastrar, "O CLIENTE JÁ EXISTE NO SISTEMA\n CHEQUE O (CPF) E (RG)!");
/*    */       } 
/* 53 */     } catch (EmailInvalidoException emailInvalido) {
/* 54 */       JOptionPane.showMessageDialog(null, emailInvalido.getMessage());
/* 55 */       this.viewCadastrar.getCampoEmail().setText("");
/* 57 */     } catch (Exception e) {
/* 58 */       JOptionPane.showMessageDialog(null, "Preencha os campos obrigatorios!");
/* 59 */       this.viewCadastrar.getCampoCPF().setText("");
/* 60 */       this.viewCadastrar.getCampoNome().setText("");
/* 61 */       this.viewCadastrar.getCampoRG().setText("");
/* 62 */       this.viewCadastrar.getCampoTelefone().setText("");
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\paulo\Desktop\Hospedagem Java\!\UI\ouvintes\OuvinteCadastrarPessoa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */