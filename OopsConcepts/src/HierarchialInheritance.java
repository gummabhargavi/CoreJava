/*the process of deriving several classes from a single base class is called hierarchial inheritance*/
class Base1{
	int a;

}
class Derived1 extends Base1{
	int b;
	Derived1(){
		a=10;
		b=20;
	}
	void sum(){
		System.out.println("SUM is :"+(a+b));
	}
}
class Derived2 extends Base1{
	int c;
	Derived2(int a1){
		a=a1; //here derived class is confused to take a value.
		c=2;
	}
 
	void mul(){
		System.out.println("Mul is:"+(a*c));
	}
	public class HierarchialInheritance {
            public void main(String[] args) {
				Derived1 obj1=new Derived1();
				obj1.sum();
				Derived2 obj2=new Derived2(2);
				obj2.mul();
			}
	}
}
