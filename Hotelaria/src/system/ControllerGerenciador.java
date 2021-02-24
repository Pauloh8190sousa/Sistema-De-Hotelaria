 package system;
 
 import BancoDeDados.BancoXML;
 import java.util.ArrayList;
 
 public class ControllerGerenciador {
   private GerenciadorDeDados gerenciador = BancoXML.load("C:/Documentos/Hotel/dadosPessoa");
   
   public boolean addPessoa(String nome, int idade, String email, String endereco, String cpf, String rg, String telefone, String checkIn, String checkOut) {
     boolean teste = this.gerenciador.adicionarPessoa(nome, idade, email, endereco, cpf, rg, telefone, checkIn, checkOut);
     BancoXML.save("C:/Documentos/Hotel/dadosPessoa", this.gerenciador);
     return teste;
   }
   
   public void addAdmin(String email, String senha) {
     this.gerenciador.adicionarAdmin(email, senha);
     BancoXML.save("C:/Documentos/Hotel/dadosPessoa", this.gerenciador);
   }
   
   public void removeAdmin() {
     this.gerenciador.removerAdmin();
     BancoXML.save("C:/Documentos/Hotel/dadosPessoa", this.gerenciador);
   }
   
   public Administrador getAdministrador() {
     return this.gerenciador.getAdmin();
   }
   
   public boolean removePessoa(String cpf) {
     Pessoa pessoa = pesquisa(cpf);
     boolean teste = this.gerenciador.removerPessoa(pessoa);
     BancoXML.save("C:/Documentos/Hotel/dadosPessoa", this.gerenciador);
     return teste;
   }
   
   public String reveterFormatacaoCPF(String text) {
     String cpfCompleto = "";
     for (int i = 0; i < text.length(); ) {
       String caractere = "";
       caractere = String.valueOf(caractere) + text.charAt(i);
       if (!caractere.equals(" ")) {
         if (!caractere.equals(".") && !caractere.equals("-"))
           cpfCompleto = String.valueOf(cpfCompleto) + caractere; 
         i++;
       } 
       break;
     } 
     long test = Long.parseLong(cpfCompleto);
     return cpfCompleto;
   }
   
   public int reveterFormatacaoIdade(String text) {
     String[] idade = text.split(" ");
     if (idade.length == 0)
       return 0; 
     return Integer.parseInt(idade[0]);
   }
   
   public void confirirRG(String rg) {
     long teste = Long.parseLong(rg);
   }
   
   public String reveterFormatacaoTelefone(String text) {
     String[] textoCompleto = text.split(" ");
     int teste = Integer.parseInt(textoCompleto[1]);
     String telefone = "";
     byte b;
     int i;
     String[] arrayOfString1;
     for (i = (arrayOfString1 = textoCompleto).length, b = 0; b < i; ) {
       String t = arrayOfString1[b];
       telefone = String.valueOf(telefone) + t;
       b++;
     } 
     return telefone;
   }
   
   public String reverterFormatacaoCheck(String check) {
     String checkCompleto = "";
     for (int cont = 0; cont < check.length(); cont++) {
       String caract = "";
       caract = caract + check.charAt(cont);
       if (!caract.equals(" "))
         checkCompleto = checkCompleto + caract; 
     } 
     return checkCompleto;
   }
   
   public Pessoa pesquisa(String cpf) {
     return this.gerenciador.pesquisarPessoa(cpf);
   }
   
   public ArrayList<Pessoa> getPessoas() {
     return this.gerenciador.getPessoas();
   }
   
   public void atualizar() {
     BancoXML.save("C:/Documentos/Hotel/dadosPessoa", this.gerenciador);
   }
   
   public void addVersion(long versao) {
     this.gerenciador.setVersion(versao);
     BancoXML.save("C:/Documentos/Hotel/dadosPessoa", this.gerenciador);
   }
   
   public long versionAtual() {
     return this.gerenciador.getVersion();
   }
   
   public void compararCPFeRG(String cpf, String rg) throws Exception {
     int cont = 0;
     int cont2 = 0;
     for (Pessoa p : this.gerenciador.getPessoas()) {
       if (p.getCpf().equals(cpf) || p.getRg().equals(rg)) {
         cont++;
         cont2++;
       } 
     } 
     if (cont > 1 && cont2 > 1)
       throw new Exception(); 
   }
 }
