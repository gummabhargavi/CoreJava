interface A{
	int a=10;
	void show();
 }
interface B{
	int a=20;
	void show();
}
class C implements A,B{
	int c;
	public void show(){
		c=A.a+B.a;
		System.out.println("A.a: "+A.a);
		System.out.println("B.a: "+B.a);
		System.out.println("c: "+c);
	}
}
public class Test {
	
	public static void main(String[] args) {
		C obj=new C();
		A ref1;
		ref1=obj;
		ref1.show();
		
		B ref2;
		ref2=obj;
		ref2.show();
	}
}
