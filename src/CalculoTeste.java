import junit.framework.TestCase;

public class CalculoTeste extends TestCase{
	public void testExecutaCalculo() {
		float PassaValor1 = 10;
		float PassaValor2 = 10;
		float RetornoEsperado = 20;
		float RetornoFeito = Calculo.ExecutaCalculo(PassaValor1, PassaValor2);
		assertEquals(RetornoEsperado, RetornoFeito, 0);
		
	}
	

}
