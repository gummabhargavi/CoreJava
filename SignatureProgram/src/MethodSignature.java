
public class MethodSignature {
	
	public String bhargavi(String name,String designation){
		
		return name+designation;

	}
          /* **A class cannot have two method with the same signature**  */
	
//   public String bhargavi(String name,String designation){
//		
//		return name+designation;
//
//	 }
	public static void main(String[] args) {
		
		MethodSignature obj=new MethodSignature();
		String result=obj.bhargavi("Bhargavi, ", "ASE ");
		String result1=obj.bhargavi("sunitha, ", "ASE");
		System.out.println(result);
		System.out.println(result1);

		
	}

}
