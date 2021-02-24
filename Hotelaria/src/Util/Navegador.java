/*    */ package Util;
/*    */ 
/*    */ import java.awt.Desktop;
/*    */ import java.net.URI;
/*    */ import java.net.URISyntaxException;
/*    */ import java.net.URL;
/*    */ 
/*    */ public class Navegador {
/*    */   public static void openWebpage(URI uri) {
/* 11 */     Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
/* 12 */     if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE))
/*    */       try {
/* 14 */         desktop.browse(uri);
/* 15 */       } catch (Exception e) {
/* 16 */         e.printStackTrace();
/*    */       }  
/*    */   }
/*    */   
/*    */   public static void openWebpage(URL url) {
/*    */     try {
/* 22 */       openWebpage(url.toURI());
/* 23 */     } catch (URISyntaxException e) {
/* 24 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }