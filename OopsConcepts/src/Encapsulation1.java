/*wrapping code and data together into a single unit */
class Base2{
	private int a;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
}

class Derived3 extends Base2{
	private int b;
	Derived3(){
		setA(10);
		b=20;
	}
	void sum(){ // here i can use return type boolean also
		System.out.println("Sum is:"+(getA()+b));
		
	}
	boolean sum1(){ 
		System.out.println("Sum1 is:"+(getA()+b));
		return false; 
	}
}
public class Encapsulation1 {
	public static void main(String[] args) {
		Derived3 d=new Derived3();
       // d.getA(); //if i call the getmethod here it won't print the values
        System.out.println(d.getA());
       System.out.println(d.sum1());
		d.sum();
	}
	
	

}
