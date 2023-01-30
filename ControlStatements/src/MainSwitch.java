/* insted of using many if-else statements we can use switch statement to check
multiple conditions at time.*/
public class MainSwitch {
	
		  public static void main(String[] args) {
			 int day = 4;
			  for(day=3; day<=5; day++){
				  
		    switch (day) {
		      case 1:
		        System.out.println("Monday");
		        break;
//break is used to break the condition to stop if the condition is true.it won't print next statement
		      case 2:
		        System.out.println("Tuesday");
		        break;
		      case 3:
		        System.out.println("Wednesday");
		        break;
		      case 4:
		        System.out.println("Thursday");
		        break;
		      case 5:
		        System.out.println("Friday");
		        break;
		      case 6:
		        System.out.println("Saturday");
		        break;
		      case 7:
		        System.out.println("Sunday");
		        break;
		    }
		  }
		  }

}
