
public class MainForLoop {
	public static void main(String[] args) {
//	    for (int i = 0; i < 5; i++) {  // for loop
//	      System.out.println(i);
//	    }  
		      /*It is also possible to place a loop inside another loop.
		       *  This is called a nested loop.*/
		
			    // Outer loop.
			    for (int i = 1; i <= 2; i++) {
			      System.out.println("Outer: " + i); // Executes 2 times
			      
			      // Inner loop
			      for (int j = 1; j <= 3; j++) {
			        System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
			      }
			    } 
			  
	  }

}
