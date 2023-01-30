import java.util.Scanner;

public class NestedTry {
	public static void main(String[] args) {
		try{
			try{
				System.out.println("going to divide");
				int a=100/0;
			}catch(ArithmeticException e){
				System.out.println("going to divide again");
				Scanner sc=new Scanner(System.in);
			    System.out.println("Enter a value");
			    int num=100/sc.nextInt();
			}
		}catch(Exception e){
			System.out.println("overall exception handled "+e);
		}
		System.out.println("normal flow");
	}

}
