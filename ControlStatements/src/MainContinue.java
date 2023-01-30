
/*continue is a pre-defined keyword in Java and therefore, 
 * it cannot be used as the name of a variable.
 */

/*The "continue" statement in Java is used when we want to control a loop such that we want to
   immediately proceed to the next iteration upon satisfying a particular condition
 */

public class MainContinue {
		
	   public static void main(String[] args)
	   {
	       int i = 0;
	       while (i < 5)
	       {
	           i++;
	           if (i == 3)
	               continue;//it can be used in all types if loops(for,do-while,while)
	           System.out.println("Executed for i = " + i);
	       }
	      
	   }
	}



