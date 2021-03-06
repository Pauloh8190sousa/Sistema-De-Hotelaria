package app;
import UI.view.ViewCadastrarEmailEmpresa;
import UI.view.ViewInicio;
import UI.view.ViewRecuperarSenha; 
import system.ControllerGerenciador;
 
 public class Programa {
   public static void main(String[] args) {
     ControllerGerenciador control = new ControllerGerenciador();
     if (control.getAdministrador() == null) {
     		new ViewCadastrarEmailEmpresa();
     } else if (control.getAdministrador().isToken()) {
     		new ViewRecuperarSenha();
     } else {
     		new ViewInicio();
     } 
   }
 }
