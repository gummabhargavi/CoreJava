import java.io.IOException;

public class ExceptionProgram {
	
	int a=20;
	int b=10;
	
	void main(){
		int result=a/(b-b);
	}
	void n(){
//		IOException io=new IOException();
//		throw io;
		try{
			main();
		}catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		ExceptionProgram obj=new ExceptionProgram();
		obj.n();
		System.out.println(obj.b);
		
	}

}
