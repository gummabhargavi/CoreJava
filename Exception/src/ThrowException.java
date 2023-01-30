/*throw is a key word which is used to throw an exception*/
public class ThrowException {
	
	public static void main(String[] args) {
		try{
			int a=200,b=0;
			if(b == 0)
				throw new Exception("Divide by zero will occu...");
			int c=a/b;
			System.out.println("c is : "+c);
		}catch(Exception e){
			System.out.println("Exception is: "+e);
		}
	}

}
