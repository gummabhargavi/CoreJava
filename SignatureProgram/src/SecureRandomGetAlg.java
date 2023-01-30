import java.security.*;
import java.util.*;

/*  AlgorithmParameterGenerator. This method requires no parameters and 
  it returns the algorithm name in string form.*/



public class SecureRandomGetAlg {
	
	public static void main(String[] argv) {
		try {
	         SecureRandom sRandom = SecureRandom.getInstance("SHA1PRNG");
	        // KeyPairGenerator kpGenerator = KeyPairGenerator.getInstance("DSA");
	        // KeyFactory kf = KeyFactory.getInstance("RSA");
	        /* AlgorithmParameterGenerator apGenerator = AlgorithmParameterGenerator.getInstance("DiffieHellman");
	             apGenerator.init(1024);*/
	         
	         String algorithmName = sRandom.getAlgorithm();
	         System.out.println("The Algorithm is: " + algorithmName);
	      } catch (NoSuchAlgorithmException e) {
	         System.out.println("Error!!! NoSuchAlgorithmException");
	      } catch (ProviderException e) {
	          System.out.println("Error!!! ProviderException");
	       }
	   }

}
