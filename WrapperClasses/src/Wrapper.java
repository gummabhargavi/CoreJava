import java.util.ArrayList;

public class Wrapper {
	 
		  public static void main(String[] args) { 
		    Integer myInt = 5; 
		    Double myDouble = 5.99; 
		    Character myChar = 'A'; 
//		    System.out.println(myInt);
//		    System.out.println(myDouble);
//		    System.out.println(myChar);
		    
		    // wrapper objects.  unboxing
		    System.out.println(myInt.intValue());
		    System.out.println(myDouble.doubleValue());
		    System.out.println(myChar.charValue());
		    
		    /*we convert an Integer to a String, and use the length()
		    method of the String class to output the length of the "string":*/
		    Integer myInt1 = 100;
		    String myString = myInt1.toString();
		    System.out.println(myString.length());
		    
		    
		    //autoboxing
		    int a=20;  
		    Integer i1=Integer.valueOf(a);//converting int into Integer explicitly  
		    Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
		    System.out.println(a+" "+i1+" "+j);  
		    
		    //unboxing
		    Integer a2=new Integer(3);    
		    int i2=a2.intValue();//converting Integer to int explicitly  
		    int j2=a2;//unboxing, now compiler will write a.intValue() internally      
		    System.out.println(a2+" "+i2+" "+j2);    
		    
		   
		  
		  }
		

}
