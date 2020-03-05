import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TesteDataCompleta {

	public static void main(String[] args) throws Throwable {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dataNascimento = sdf.parse("02/10/1990");
		int idade = calculaIdade(dataNascimento);
		// A idade é:
		System.out.println(idade);

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		String minhaData = "03/03/1996";

		Date minhaDataEmDate = sdf1.parse(minhaData);
		System.out.println(minhaDataEmDate);
		System.out.println(sdf.format(minhaDataEmDate));

	}

	public static int calculaIdade(java.util.Date dataNasc) {

		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(dataNasc);
		Calendar hoje = Calendar.getInstance();

		int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);

		if (hoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
			idade--;
		} else {
			if (hoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH)
					&& hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
				idade--;
			}
		}

		return idade;
	}

	public static String formataData(String data) throws Throwable {

		return data;
	}
}