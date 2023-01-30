//Nested if-statement here we can check more than one condition.
public class Main2 {
	
	public static void main(String[] args) {    
		String address = "Delhi, India";    
		  // here any one of the condition is false the next condition it won't check .  
		if(address.endsWith("India")) {    
		if(address.contains("Meerut")) {    
		System.out.println("Your city is Meerut");    
		}else if(address.contains("Noida")) {    
		System.out.println("Your city is Noida");    
		}else {    
		System.out.println(address.split(",")[0]);    
		}    
		}else {    
		System.out.println("You are not living in India");    
		}    
		}    

}
