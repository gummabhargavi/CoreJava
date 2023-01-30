interface A1{
	
	void m1();
	void m2();
}
interface B1 extends A1{
	
	void m3();
}
class C1 implements B1{
	
	public void m1(){
	System.out.println("Interface A1 m1()");
	}
	public void m2(){
		System.out.println("Interface A1 m2()");
	}
	public void m3(){
		System.out.println("Interface B1 m3()");
	}
}
public class Main {
	
	public static void main(String[] args) {
//		C1 obj=new C1();
//		obj.m1();
//		obj.m2();
//		obj.m3();
		
		C1 obj1 =new C1();
		A1 ref=new C1();
		 ref.m1();
		 ref.m2();
		 
		B1 ref1=new C1(); 
		// B1 ref1;
		 ref1=obj1;
		 ref1.m3();
	}

}
