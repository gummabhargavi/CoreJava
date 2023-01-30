
public class Arth {
	
	int a=10;
	int b=5;
	int c=5;
	int d=a/b;
	int result=a/(b-c);
	
//	static void valid(int result)throws ArthTest {
//		if(result == 0){
//		    throw new ArthTest("a/(b-c) is zero");
//	 }
//	}
	
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public static void main(){
		System.out.println("pandhi gumma");
	}
	
	@Override
	public String toString() {
		return "Arth [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", result=" + result + "]";
	}
	public static void main(String[] args) {
//		Arth obj=new Arth();
		//System.out.println(obj.toString());
	    //System.out.println(obj.getResult());
		main();
	    
	}

}
