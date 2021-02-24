/*    */ package Util;
/*    */ 
/*    */ import com.itextpdf.text.BaseColor;
/*    */ import com.itextpdf.text.Document;
/*    */ import com.itextpdf.text.DocumentException;
/*    */ import com.itextpdf.text.Element;
/*    */ import com.itextpdf.text.PageSize;
/*    */ import com.itextpdf.text.Paragraph;
/*    */ import com.itextpdf.text.Rectangle;
/*    */ import com.itextpdf.text.pdf.PdfWriter;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.FileOutputStream;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Date;
/*    */ import javax.swing.filechooser.FileSystemView;
/*    */ import system.Pessoa;
/*    */ 
/*    */ public class GerarDadosEmPDF {
/*    */   public void gerarDadosDoCliente(ArrayList<Pessoa> pessoas, String arquivo) {
/* 27 */     Rectangle p = new Rectangle(PageSize.A5);
/* 28 */     p.setBackgroundColor(new BaseColor(255, 222, 173));
/* 29 */     Document document = new Document(p);
/*    */     try {
/* 31 */       FileSystemView system = FileSystemView.getFileSystemView();
/* 32 */       String path = system.getHomeDirectory().getPath() + "/" + arquivo;
/* 33 */       PdfWriter.getInstance(document, new FileOutputStream(path));
/* 34 */       document.open();
/* 36 */       Paragraph paragrafo1 = new Paragraph("NOMES DOS CLIENTES");
/* 37 */       paragrafo1.setAlignment(1);
/* 38 */       document.add(paragrafo1);
/* 39 */       document.add(new Paragraph("-------------------------------------------------------------------------------------"));
/* 40 */       long count = 0L;
/* 41 */       for (Pessoa pessoa : pessoas) {
/* 42 */         count++;
/* 43 */         document.add((Element)new Paragraph(count+ "°) \nNOME:  " + pessoa.getNome()));
/* 44 */         document.add((Element)new Paragraph("CPF:  " + pessoa.getCpf()));
/* 45 */         document.add((Element)new Paragraph("RG:  " + pessoa.getRg()));
/* 46 */         document.add((Element)new Paragraph("DATA:  " + pessoa.getDataCadastro()));
/* 47 */         document.add((Element)new Paragraph("E-MAIL:  " + pessoa.getEmail()));
/* 48 */         document.add((Element)new Paragraph("IDADE:  " + pessoa.getIdade()));
/* 49 */         document.add((Element)new Paragraph("TELEFONE:  " + pessoa.getTelefone()));
/* 50 */         document.add((Element)new Paragraph("ENDEREÃ‡O:  " + pessoa.getEndereco()));
/* 51 */         document.add((Element)new Paragraph("CHECK IN:  " + pessoa.getCheckIn() + "  -  CHECK OUT:  " + pessoa.getCheckOut()));
/* 52 */         document.add((Element)new Paragraph("-------------------------------------------------------------------------------------"));
/*    */       } 
/* 54 */       Date data = new Date();
/* 55 */       SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy - HH:mm");
/* 56 */       String dataFormate = simple.format(data);
/* 57 */       Paragraph paragrafo2 = new Paragraph("DOCUMENTO IMPRESSO NO DIA: " + dataFormate + "h");
/* 58 */       paragrafo2.setAlignment(1);
/* 59 */       document.add((Element)paragrafo2);
/* 60 */     } catch (FileNotFoundException e) {
/* 61 */       e.printStackTrace();
/* 62 */     } catch (DocumentException e) {
/* 63 */       e.printStackTrace();
/*    */     } 
/* 65 */     document.close();
/*    */   }
/*    */ }