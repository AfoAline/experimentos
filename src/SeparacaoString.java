import java.util.Arrays;

public class SeparacaoString {

	public static void main(String[] args) {
		String alunoRecebido = "Aline Freitas Oliveira";
		Aluno aluno = new Aluno();
		aluno.setNome(alunoRecebido.substring(0, 5));
		String[] nomes = alunoRecebido.split(" ");
		System.out.println(nomes[0]);
		System.out.println(nomes[1]);
		System.out.println(nomes[2]);
	}
}
