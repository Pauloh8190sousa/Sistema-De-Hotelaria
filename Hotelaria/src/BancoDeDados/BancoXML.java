package BancoDeDados;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import system.GerenciadorDeDados;

 public class BancoXML {
   private static XStream xstream = new XStream((HierarchicalStreamDriver)new DomDriver("ISO-8859-1"));
   
   private static File arquivo;
   
   public static void save(String gerenciadorArquivo, GerenciadorDeDados gerenciador) {
     File arquivo = new File("C:/Documentos/Hotel");
     if (!arquivo.exists())
       arquivo.mkdirs(); 
     arquivo = new File(String.valueOf(gerenciadorArquivo) + ".xml");
     String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?>\n";
     xml = String.valueOf(xml) + xstream.toXML(gerenciador);
     try {
       arquivo.createNewFile();
       PrintWriter gravar = new PrintWriter(arquivo);
       gravar.print(xml);
       gravar.close();
     } catch (IOException e) {
       e.printStackTrace();
     } 
   }
   
   public static GerenciadorDeDados load(String gerenciadorArquivo) {
     arquivo = new File(String.valueOf(gerenciadorArquivo) + ".xml");
     try {
       if (arquivo.exists()) {
         FileInputStream fis = new FileInputStream(arquivo);
         return (GerenciadorDeDados)xstream.fromXML(fis);
       } 
     } catch (FileNotFoundException e) {
       e.printStackTrace();
     } 
     return GerenciadorDeDados.getInstance();
   }
 }
