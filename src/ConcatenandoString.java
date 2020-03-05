
public class ConcatenandoString {
    
   public static void main (String[] args){
          
          
         String strFinal = "";
          
         /*
          * Vamos concatenar 65536 vezes o caractere 'a',
          * então entenda que cada vez que passarmos no laço
          * a JVM irá criar um novo objeto em memória.
          * */
         for(int i = 0; i < 10; i ++){
                strFinal += "a";                  
         }
         System.out.println(strFinal);
   }
 
}


