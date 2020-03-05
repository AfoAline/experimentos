import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GeradorHash {

	public static void main(String[] args) {
	
		String hash = gerarHash("Aline Freitas Oliveira");

}

	public static String gerarHash(String nome){
		;
		try {
		    MessageDigest m = MessageDigest.getInstance("MD5");
		 
		    m.update( nome.getBytes(), 0 , nome.length());
		             
		    byte[] digest = m.digest();
		         
		    String hexa = new BigInteger(1,digest).toString(16);
		             
		    System.out.println("MD5: " + hexa);
		} catch (NoSuchAlgorithmException e) {
		    e.printStackTrace();
		}
		return nome;
	}
	}