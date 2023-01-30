/*when there is achain of inheritance is known as multilevel inheritance*/
class Animal1{
	void eat(){
		System.out.println("eating---");
	}
}
class Dog1 extends Animal1{
	void bark(){
		System.out.println("barking");   
	}
}
class BabyDog extends Dog1{
	void weep(){
		System.out.println("Weeping");
	}
}
public class MultilevelInheritance {
	public static void main(String[] args) {
		//Animal1 b=new Animal1();
		BabyDog b=new BabyDog();
		b.weep();
		b.bark();
		b.eat();
	}

}
