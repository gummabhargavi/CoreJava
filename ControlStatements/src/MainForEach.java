/*Instead of declaring and initializing a loop counter variable, 
  you declare a variable that is the same type as the base type of the array,
   followed by a colon, which is then followed by the array name.*/
public class MainForEach {
	
	 public static void main(String[] args) {
		    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		    for (String i : cars) {
		     // System.out.println(i.length());
		    //System.out.println(i.charAt(0));
		    // System.out.println(i.codePointAt(0));
		    	System.out.println(i.replace("Ball", "Food"));
		    	/*For-each loops are not appropriate when you want to modify the array:*/
		    }    
		  }

}
