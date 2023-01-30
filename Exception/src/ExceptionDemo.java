
class SampleMath {
	
	void sum(int a,int b) {
		System.out.println("sum is: "+(a+b));
	}
}
public class ExceptionDemo {
	public static void main(String[] args) {
		
		int arr[]={10,20,30,40};
		int a=20;
		int b=0;
		
		try{
		    System.out.println("index 20 is: "+arr[20]);
		    int c=a/b;
		    System.out.println("c is: "+c);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Some exception occurred :"+e);
		}catch(ArithmeticException ae){
			System.out.println("Some exception2 occurred: "+ae);
		}finally {
			System.out.println("this will print");
		}
		System.out.println("index 3rd is "+arr[2]);
		SampleMath sm=new SampleMath();
		sm.sum(2, 3);
	}
	

}
