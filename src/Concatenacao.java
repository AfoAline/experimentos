
public class Concatenacao {

	public static void main(String[] args) {
		int loop = 100000;

		StringBuffer sb = new StringBuffer();
		long time = System.currentTimeMillis();
		for( int i = 0; i < loop; i++ )
		    sb.append( "a" );

		System.out.println( "Tempo total de excecução com StringBuffer: " + ( System.currentTimeMillis() - time ) + "ms." );

		String s = "";
		time = System.currentTimeMillis();
		for( int i = 0; i < loop; i++ )
		    s += "a";

		System.out.println( "Tempo total de excecução concatenando strings: " + ( System.currentTimeMillis() - time ) + "ms." );

	}

}
