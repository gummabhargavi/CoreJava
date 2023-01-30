class Super {
   void sample(int a, int b) {
      System.out.println("Method of the Super class");
	return;
   }
   int sample(){
	     int a = 3;
	     int b = 2;
	     int c = a+b;
	   return c ;
	   
   }
}
public class MethodOverridingSignature extends Super {
   void sample(int a, float b) {
      System.out.println("Method of the Sub class");
   }
   public static void main(String args[]) {
      MethodOverridingSignature obj = new MethodOverridingSignature();
      obj.sample(20, 20);
      //obj.sample();
      System.out.println(obj.sample());
   }
}
/*while overriding a method of the super class we need to make
   sure that both methods have same name, same parameters and, 
  same return type else they both will be treated as different methods.
  */
 