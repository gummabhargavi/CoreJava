import java.security.NoSuchAlgorithmException;
import java.security.Signature;

public class SignatureGetAlgorithm {
	
	 public static void main(String[] args) {
	      try {
				Signature signature = Signature.getInstance("SHA256withRSA");
				String algorithm = signature.getAlgorithm();
				System.out.println("The Algorithm is: " + algorithm);
			} catch (NoSuchAlgorithmException e) {
				System.out.println("Error!!! NoSuchAlgorithmException");
			}
	   }
}
