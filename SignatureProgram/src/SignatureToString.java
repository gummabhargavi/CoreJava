import java.security.NoSuchAlgorithmException;
import java.security.Signature;

/* The method toString() is used to obtain the string representation 
 * for the signature object.
Then this string representation is displayed */

public class SignatureToString {
	
	public static void main(String[] argv) {
	      try {
	         Signature signature = Signature.getInstance("SHA256withRSA");
	         String str = signature.toString();
	         System.out.println(str);
	      } catch (NoSuchAlgorithmException e) {
	         System.out.println("Error!!! NoSuchAlgorithmException");
	      }
	   }

}
