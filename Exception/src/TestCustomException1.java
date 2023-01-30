
public class TestCustomException1 {
	      
	    // method to check the age  
	     static void validate (int age) throws InvalidAgeException {    
	       if(age < 18){  
	  
	        //specify the exception object which is to be thrown.
	        throw new InvalidAgeException("age is not valid to vote");    
	    }  
	       else {   
	        System.out.println("welcome to vote");   
	        }   
	     }    
	  
	    
	    public static void main(String args[])  
	    {  
	        try  
	        {  
	               
	            validate(13);  
	        }  
	        catch (InvalidAgeException ex)  
	        {  
	            System.out.println("Caught the exception");  
	    
	             
	            System.out.println("Exception occured: " + ex);  
	        }  
	  
	        System.out.println("rest of the code...");    
	    }  
	}  


