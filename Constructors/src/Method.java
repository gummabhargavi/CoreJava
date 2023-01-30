public class Method {
	public static void main(String[] args) {
		
		welcome();
		multiply(5,2);
		multiply(2,3);
		divide(10,2);
		add(10,2);
//      int a=2;
//	    int b=3;
//	    System.out.println(a*b);
//	    
//		int a1=2;
//	    int b1=5;
//	    System.out.println(a1*b1);
	}
	public static void welcome(){
		System.out.println("Wlcome to calculator!");
	}
	
	public static void multiply(int a, int b){
		System.out.println(a*b);
	}
	public static void divide(int c,int d){
		System.out.println(c/d);
	}
	public static void add(int a,int b){
		System.out.println(a+b);
	}
}
