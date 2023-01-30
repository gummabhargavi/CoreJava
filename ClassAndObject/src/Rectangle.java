
public class Rectangle {
	
	int l;
	int b;
	// area() is a method
	int area() {
		
		return l*b;
	}
	public static void main(String[] args) {
		
		Rectangle rect1=new Rectangle();
		Rectangle rect2=new Rectangle();
		rect1.l=10;
		rect1.b=20;
		rect2.l=5;
		rect2.b=10;
		System.out.println("area of rectangle is :" + rect1.area());
		System.out.println("area of rectangle2 is :" + rect2.area());
	}

}
