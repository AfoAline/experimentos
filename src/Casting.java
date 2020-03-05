
public class Casting {
		  public static void main(String[] args) {
		    
			  /* Casting feito implicitamente, pois o valor possui um
		       tamanho menor que o tipo da variavel que irá recebe-lo. */
			  
		    char a = 'a';
		    int b = 'a';
		    float c = 100;

		    System.out.println(a); //Imprime a
		    System.out.println(b); //Imprime 98
		    System.out.println(c); //Imprime 100.0
		    
		    /* Casting feito explicitamente, pois o valor possui um tamanho
		       maior que o tipo da variavel que irá recebe-lo. */
		    
		    int d = (int) 5.1987;//d
		    float e  = (float) 5;//e
		    int f = (char) (a + 5);//f
		    char g = (char) 97.5;//g

		    System.out.println("d: "+ d); //Imprime 5
		    System.out.println("e: "+ e); //Imprime 5.0
		    System.out.println("f: "+ f); //Imprime 102
		    System.out.println("g: "+ g); //Imprime a
		  }
		}


