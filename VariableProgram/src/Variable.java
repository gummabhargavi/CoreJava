/* Variables are containers for storing data values. */

public class Variable {
	//Creating a variable
	//The equal sign is used to assign values to the variable
	
	String name="Bhargavi";
	int a=20;
	final int b=2;
	 char var=23;
     	      
	public static void main(String[] args) {
		int no=90;
		//if you assign a new value to an existing variable, it will overwrite the previous value
		no=30;
		
		final String name1="sunitha";
		 // name="sandhya";  // will generate an error: cannot assign a value to a final variable
		Variable obj1=new Variable();
		System.out.println(obj1.a  +  obj1.name +obj1.b);
		System.out.println(no);
		System.out.println(name1);
		System.out.println(obj1.var);

	}

}
