
public class ArthTest1 {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=5;
		int c=5;
		String s="abc";
		int a1[]=new int[5];
		
//		//ArithmeticException
//		try{   
//			int result=a/(b-c);
//		}catch(Exception e){
//			System.out.println(e);
//		}
//		System.out.println(a/b);
//		
		
		//NumberFormateException
		try{    
			int i=Integer.parseInt(s);
			System.out.println("i value is: "+i);
		}catch(NumberFormatException e1){
			System.out.println(e1);
		}
		
		
		 //an array exceeds to it's size, the ArrayIndexOutOfBoundsException occurs
		try{  
			 a1[10]=50;
			 int result=a/(b-c);
			 System.out.println("indext 1 is: "+a1[10]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}catch (ArithmeticException e2) {
			System.out.println(e2);
		}
		System.out.println("division of a/b is: "+a/b);
		
		
		//multipul try blocks
		try{  //outer
			
		 try{ //inner 1
			 int arr[]={8,6,4,7};
			 System.out.println("array index is: "+arr[1]);
			 
		 }catch(ArrayIndexOutOfBoundsException e3){
			System.out.println(e3); 
		 }
		try{ //inner 2
			int data=50/0;
			
		}catch(ArithmeticException ae){
			System.out.println(ae);
		}
			
		}catch(Exception ee){
			System.out.println(ee);
		} 
		
		//finally block is always executed whether an exception is handled or not.
		finally {  
	        System.out.println("finally block is always executed");  
	      }    
	  
	      System.out.println("rest of the code...");    
	          
					
	}

}
