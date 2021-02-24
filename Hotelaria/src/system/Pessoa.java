 package system;
 
 import java.text.SimpleDateFormat;
 import java.util.Date;
 
 public class Pessoa {
   private String nome;
   private String telefone;
   private int idade;
   private String email;
   private String endereco;
   private String cpf;
   private String rg;
   private String dataCadastro;
   private String checkIn;
   private String checkOut;
   
  public Pessoa(String nome, int idade, String email, String endereco, String cpf, String rg, String telefone, String checkin, String checkOut) {
     this.nome = nome;
     this.idade = idade;
     this.email = email;
     this.endereco = endereco;
     this.cpf = cpf;
     this.rg = rg;
     this.telefone = telefone;
     this.checkIn = checkin;
     this.checkOut = checkOut;
     Date data = new Date();
     SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy - HH:mm");
     this.dataCadastro = formato.format(data);
     this.dataCadastro = String.valueOf(this.dataCadastro) + "h";
   }
   
  public String getNome() {
     return this.nome;
   }
   
  public void setNome(String nome) {
     this.nome = nome;
   }
   
  public int getIdade() {
     return this.idade;
   }
   
  public void setIdade(int idade) {
     this.idade = idade;
   }
   
  public String getEmail() {
     return this.email;
   }
   
  public void setEmail(String email) {
     this.email = email;
   }
   
  public String getEndereco() {
     return this.endereco;
   }
   
  public void setEndereco(String endereco) {
     this.endereco = endereco;
   }
   
  public String getCpf() {
     return this.cpf;
   }
   
  public void setCpf(String cpf) {
     this.cpf = cpf;
   }
   
  public String getRg() {
     return this.rg;
   }
   
  public void setRg(String rg) {
     this.rg = rg;
   }
   
  public String getTelefone() {
     return this.telefone;
   }
   
  public void setTelefone(String telefone) {
     this.telefone = telefone;
   }
   
  public String getDataCadastro() {
     return this.dataCadastro;
   }
   
  public String getCheckIn() {
     return this.checkIn;
   }
   
  public void setCheckIn(String checkIn) {
     this.checkIn = checkIn;
   }
   
  public String getCheckOut() {
     return this.checkOut;
   }
   
  public void setCheckOut(String checkOut) {
     this.checkOut = checkOut;
   }
 }
