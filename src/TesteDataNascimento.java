import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;	

public class TesteDataNascimento {

		public static void main(String[] args) {
			Calendar cal = GregorianCalendar.getInstance();
			int anoAtual = cal.get(Calendar.YEAR);
			Scanner in = new Scanner(System.in);
			System.out.println("Ano em que voc� nasceu: ");
			int anoNasc = in.nextInt();
			System.out.println("Voce tem:" +   (anoAtual - anoNasc)  +"anos.");
			}

		}