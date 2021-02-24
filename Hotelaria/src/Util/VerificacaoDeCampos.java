/*    */ package Util;
/*    */ 
/*    */ public class VerificacaoDeCampos {
/*    */   private static VerificacaoDeCampos verificacao;
/*    */   
/*    */   public static synchronized VerificacaoDeCampos getInstance() {
/* 11 */     if (verificacao == null)
/* 12 */       return new VerificacaoDeCampos(); 
/* 14 */     return verificacao;
/*    */   }
/*    */   
/*    */   public static void verificar(String campo) throws Exception {
/* 17 */     if (campo.equals(""))
/* 18 */       throw new Exception(); 
/*    */   }
/*    */ }
