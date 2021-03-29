 package system;
 
 import java.util.ArrayList;
 
 public class GerenciadorDeDados {
   private ArrayList<Pessoa> pessoas = new ArrayList<>();
   private static GerenciadorDeDados gerenciador;
   private Administrador administrador;
   private Empresa empresa;
   private long version;
   
   public static synchronized GerenciadorDeDados getInstance() {
     if (gerenciador == null)
       gerenciador = new GerenciadorDeDados(); 
     return gerenciador;
   }
   
   public void adicionarAdmin(String email, String senha) {
     this.administrador = new Administrador(email, senha);
   }
   
   public void adicionarEmpresa(String email, String senha){
	   this.empresa = new Empresa();
	   this.empresa.setEmail(email);
	   this.empresa.setSenha(senha);
   }
   public Empresa getEmpresa(){
	   return this.empresa;
   }
   public void removerAdmin() {
     this.administrador = null;
   }
   
   public Administrador getAdmin() {
     return this.administrador;
   }
   
   public boolean adicionarPessoa(String nome, int idade, String email, String endereco, String cpf, String rg, String telefone, String checkIn, String checkOut) {
     Pessoa pessoa = new Pessoa(nome, idade, email, endereco, cpf, rg, telefone, checkIn, checkOut);
     for (Pessoa p : this.pessoas) {
       if (p.getCpf().equals(pessoa.getCpf()) || p.getRg().equals(pessoa.getRg()))
         return false; 
     } 
     this.pessoas.add(pessoa);
     return true;
   }
   
   public boolean removerPessoa(Pessoa pessoa) {
     for (Pessoa p : this.pessoas) {
       if (p.getCpf() == pessoa.getCpf()) {
         this.pessoas.remove(p);
         return true;
       } 
     } 
     return false;
   }
   
   public Pessoa pesquisarPessoa(String cpf) {
     for (Pessoa p : this.pessoas) {
       if (p.getCpf().equals(cpf))
         return p; 
     } 
     return null;
   }
   
   public ArrayList<Pessoa> getPessoas() {
     return this.pessoas;
   }
   
   public void setVersion(long versao) {
     this.version = versao;
   }
   
   public long getVersion() {
     return this.version;
   }
 }