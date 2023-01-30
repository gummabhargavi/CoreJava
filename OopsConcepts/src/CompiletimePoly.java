/*If a class has multiple methods having same name but different in parameters*/
//it is ststic
class Add{
  int Add(int a,int b){  //compiletime poly
	return a+b;
    		
	}
  int Add(int a,int b,int c){
	return a+b+c;
	  
  }
}
public class CompiletimePoly {
	public static void main(String[] args) {
		Add a1=new Add();
		
		System.out.println(a1.Add(10, 20));
		System.out.println(a1.Add(2, 2, 2));
		
	}

}
