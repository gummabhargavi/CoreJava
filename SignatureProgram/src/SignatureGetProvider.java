import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;

/* The method getProvider()is used to obtain the provider for the signature object. 
      Then this provider name is displayed.
 */

public class SignatureGetProvider {
        
	 public static void main(String[] argv) {
	      try {
	         Signature signature = Signature.getInstance("SHA256withRSA");
	         Provider provider = signature.getProvider();
	         System.out.println("The Provider is: " + provider);
	      } catch (NoSuchAlgorithmException e) {
	         System.out.println("Error!!! NoSuchAlgorithmException");
	      }
	   }
}
