
public class Rectangle {
	
	double l;
	double b;
	
    Rectangle() {
     l=10;
     b=20;
   }
    double area(){
    	
      return l*b;
    }
    public static void main(String[] args) {
		 
       Rectangle obj1=new Rectangle();
       Rectangle obj2=new Rectangle();
       System.out.println("Area of obj1 is:" + obj1.area());
       System.out.println("Area of obj2 is:" + obj2.area());
	}
    
}
