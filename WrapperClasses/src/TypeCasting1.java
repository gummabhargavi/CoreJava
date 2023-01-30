/*Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte*/
public class TypeCasting1 {
	 public static void main(String[] args) {
		    int myInt = 9;
		    double myDouble = myInt; // Automatic casting: int to double
		    System.out.println(myInt);
		    System.out.println(myDouble);
		    
		    
		    double myDouble1 = 9.78d;
		    int myInt1 = (int) myDouble; // Explicit casting: double to int
		    System.out.println(myDouble1);
		    System.out.println(myInt1);
		    
		    int i=10; //we can't change int to char
		    char c=(char) i;
		   System.out.println(i);
		   System.out.println(c);
		   
		   //automatic casting
		   byte b=2;
		   short s=b;
		   char c1=(char) s;
		   int i1=c1;
		   System.out.println("before byte :"+b);
		   System.out.println("After short :"+s);
		   System.out.println("After char :"+c1);
		   System.out.println("After int :"+i1);
		   
		   //explicit
		   double d = 166.66;  
		 //converting double data type into long data type  
		 long l = (long)d;  
		 //converting long data type into int data type  
		 int i2 = (int)l; 
		 short s2=(short)i2;
		 byte b2=(byte)s2;  //1 byte (8 bits) :  -128 to 127
		
		 System.out.println("Before conversion: "+d);  
		 //fractional part lost  
		 System.out.println("After conversion into long type: "+l);  
		 //fractional part lost  
		 System.out.println("After conversion into int type: "+i2);  
		 System.out.println("After short :"+s2);
		 System.out.println("After byte :"+b2);
		  
		   
		   
		  }
		  

}
