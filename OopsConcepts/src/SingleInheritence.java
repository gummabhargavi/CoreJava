/*it enables a derived class to inherit properties and behaviour from a single parent class*/
//base class variable can be accessible derived class.
class Base{
	protected int a;
	//static int a;
	
}

class Derived extends Base{
	private int b;
	Derived(int a1){
		a=a1;
		b=20;
	}
	void sum(){
		System.out.println("Sum is:"+(a+b)); 
	}
}
public class SingleInheritence {
	public static void main(String[] args) {
		//Base b=new Base();
		Derived d=new Derived(10);
		d.sum();
		//b.equals(b);
	}

}
