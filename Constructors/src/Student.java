
public class Student {
	
	String degree;
	String name;
	int age;
	
	Student(){
		degree="CSE";
		name="Bhargavi";
		age=22;
		
		}
	Student(String a,String b){
		 degree=a;
		 name=b;
	}
	Student(String d,String n,int a1){
		degree=d;
		name=n;
		age=a1;
	}
//	void display(){
//		System.out.println(degree +" "+name+" "+age);
//	}
	
	public static void main(String[] args) {
		Student obj1=new Student();
		Student obj2=new Student("CSE","Sunitha");
		Student obj3=new Student("CSE","Sandhya",22);
		System.out.println("Degree is :" + obj1.degree + ", Name is: " +obj1.name + ", Age is : " +obj1.age);
		System.out.println("Degree is :" + obj2.degree + ", Name is: " +obj2.name + ", Age is : " +obj2.age);
		System.out.println("Degree is :" + obj3.degree + ", Name is: " +obj3.name + ", Age is : " +obj3.age);
//		obj1.display();
//		obj2.display();
//		obj3.display();

	}

}
