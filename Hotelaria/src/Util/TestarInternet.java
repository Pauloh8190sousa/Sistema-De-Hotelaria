/*    */ package Util;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.net.URL;
/*    */ import java.net.URLConnection;
/*    */ 
/*    */ public class TestarInternet {
/*    */   public static boolean testarConexao() {
/*    */     try {
/* 11 */       URLConnection connection = (new URL("http://www.google.com.br")).openConnection();
/* 12 */       connection.connect();
/* 13 */       return true;
/* 14 */     } catch (IOException e) {
/* 15 */       return false;
/*    */     } 
/*    */   }
/*    */ }
