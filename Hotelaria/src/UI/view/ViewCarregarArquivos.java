/*    */ package UI.view;
/*    */ 
/*    */ import java.io.File;
/*    */ import javax.swing.JFileChooser;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.JOptionPane;
/*    */ import javax.swing.filechooser.FileNameExtensionFilter;
/*    */ 
/*    */ public class ViewCarregarArquivos {
/*    */   public static void carregarDados() {
/* 12 */     JFileChooser arquivo = new JFileChooser();
/* 13 */     FileNameExtensionFilter filtroPDF = new FileNameExtensionFilter("Arquivos .xml", new String[] { "xml" });
/* 14 */     arquivo.addChoosableFileFilter(filtroPDF);
/* 15 */     arquivo.setAcceptAllFileFilterUsed(false);
/* 16 */     if (arquivo.showOpenDialog(arquivo) == 0) {
/* 17 */       File arquivoAtual = new File(arquivo.getSelectedFile().getAbsolutePath());
/* 18 */       File arquivoDeletado = new File("C:/Documentos/Hotel");
/* 19 */       if (!arquivoDeletado.exists())
/* 20 */         arquivoDeletado.mkdirs(); 
/* 22 */       arquivoDeletado = new File("C:/Documentos/Hotel/dadosPessoa.xml");
/* 23 */       arquivoDeletado.delete();
/* 24 */       File arquivoDestino = new File("C:/Documentos/Hotel/");
/* 25 */       arquivoAtual.renameTo(new File(arquivoDestino, "dadosPessoa.xml"));
/* 26 */       JOptionPane.showMessageDialog(null, "ARQUIVO DE DADOS ADICIONADO NO SISTEMA!");
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void carregarDados(JFrame jframe) {
/* 31 */     JFileChooser arquivo = new JFileChooser();
/* 32 */     FileNameExtensionFilter filtroPDF = new FileNameExtensionFilter("Arquivos .xml", new String[] { "xml" });
/* 33 */     arquivo.addChoosableFileFilter(filtroPDF);
/* 34 */     arquivo.setAcceptAllFileFilterUsed(false);
/* 35 */     if (arquivo.showOpenDialog(arquivo) == 0) {
/* 36 */       File arquivoAtual = new File(arquivo.getSelectedFile().getAbsolutePath());
/* 38 */       File arquivoDeletado = new File("C:/Documentos/Hotel");
/* 39 */       if (!arquivoDeletado.exists())
/* 40 */         arquivoDeletado.mkdirs(); 
/* 42 */       arquivoDeletado = new File("C:/Documentos/Hotel/dadosPessoa.xml");
/* 43 */       arquivoDeletado.delete();
/* 44 */       File arquivoDestino = new File("C:/Documentos/Hotel");
/* 45 */       arquivoAtual.renameTo(new File(arquivoDestino, "dadosPessoa.xml"));
/* 46 */       JOptionPane.showMessageDialog(null, "ARQUIVO DE DADOS ADICIONADO NO SISTEMA!");
/* 48 */       jframe.dispose();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\paulo\Desktop\Hospedagem Java\!\UI\view\ViewCarregarArquivos.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */