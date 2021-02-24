package backup;
 
import BancoDeDados.BancoXML;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;
import system.GerenciadorDeDados;
 
 public class UparData {
   public static void uparData() {
     GerenciadorDeDados gerenciador = BancoXML.load("C:/Documentos/Hotel/dadosPessoa");
     FileSystemView system = FileSystemView.getFileSystemView();
     String path = String.valueOf(system.getHomeDirectory().getPath()) + "/" + "dadosPessoaBackup";
     BancoXML.save(path, gerenciador);
     JOptionPane.showMessageDialog(null, "Uploading de Dados concluida.\n Confira a Área de Trabalho.");
   }
 }

