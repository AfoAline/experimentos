
public class ConcatenandoString {
    
   public static void main (String[] args){
          
          
         String strFinal = "";
          
         /*
          * Vamos concatenar 65536 vezes o caractere 'a',
          * ent�o entenda que cada vez que passarmos no la�o
          * a JVM ir� criar um novo objeto em mem�ria.
          * */
         for(int i = 0; i < 10; i ++){
                strFinal += "a";                  
         }
         System.out.println(strFinal);
   }
 
}


