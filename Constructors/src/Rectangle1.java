
public class Rectangle1 {
	
	double length;
	double breadth;
	
    Rectangle1(double l,double b) {
     length=l;
     breadth=b;
   }
//    public Rectangle1() {
//		// TODO Auto-generated constructor stub
//	}
	double area(){
      return length*breadth;
    }
    public static void main(String[] args) {
	// Rectangle1 o=new Rectangle1();	 
       Rectangle1 obj1=new Rectangle1(5,2);
       Rectangle1 obj2=new Rectangle1(2,4);
       System.out.println("Area of obj1 is:" + obj1.area());
       System.out.println("Area of obj2 is:" + obj2.area());
	}


}
