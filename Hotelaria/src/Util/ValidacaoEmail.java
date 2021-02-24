/*    */ package Util;
/*    */ 
/*    */ import Exception.EmailInvalidoException;
/*    */ 
/*    */ public class ValidacaoEmail {
/*    */   public static void validarEmail(String entradaParaValidar) throws EmailInvalidoException {
/*  8 */     String regex = "[A-Za-z0-9\\._-]+@[A-Za-z]+\\.[A-Za-z]+";
/*  9 */     String regex2 = "[A-Za-z0-9\\._-]+@[A-Za-z]+\\.[A-Za-z]+\\.[A-Za-z]+";
/* 10 */     String rege3 = "[A-Za-z0-9\\._-]+@[A-Za-z]+\\.[A-Za-z]+\\.[A-Za-z]+\\.[A-Za-z]+";
/* 11 */     String rege4 = "[A-Za-z0-9\\._-]+@[A-Za-z]+\\.[A-Za-z]+\\.[A-Za-z]+\\.[A-Za-z]+\\.[A-Za-z]+";
/* 12 */     if (!entradaParaValidar.matches(regex) && 
/* 13 */       !entradaParaValidar.matches(regex2) && 
/* 14 */       !entradaParaValidar.matches(rege3) && 
/* 15 */       !entradaParaValidar.matches(rege4))
/* 16 */       throw new EmailInvalidoException(); 
/*    */   }
/*    */ }
