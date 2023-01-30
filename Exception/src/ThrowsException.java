/*here the calling function will handle the exception*/
public class ThrowsException {
	
	public int test(int a,int b)throws Exception{
		int c=a/b;
		return c;
	}
	public static void main(String[] args) {
		try{
			ThrowsException te=new ThrowsException();
			//te.test(10, 0);
			System.out.println("division is: "+te.test(10, 0));
		}catch(Exception e){
			System.out.println("Exception :"+e);
		}
	}

}
