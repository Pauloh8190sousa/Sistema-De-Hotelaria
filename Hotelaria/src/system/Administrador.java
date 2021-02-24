 package system;
 
 public class Administrador {
   private String email;
   private String senha;
   private int token;
   
   public Administrador(String email, String senha) {
     this.email = email;
     this.senha = senha;
     this.token = -1;
   }
   
   public String getEmail() {
     return this.email;
   }
   
   public void setEmail(String email) {
     this.email = email;
   }
   
   public String getSenha() {
     return this.senha;
   }
   
   public void setSenha(String senha) {
     this.senha = senha;
   }
   
   public void addToken(int token) {
     this.token = token;
   }
   
   public boolean isToken() {
     if (this.token != -1)
       return true; 
     return false;
   }
   
   public int getToken() {
     return this.token;
   }
 }