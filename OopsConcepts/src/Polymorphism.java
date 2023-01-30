//method overridden(or)runtime poly.same method names and parameters
//subclass object and subclass methods overrides the parent class method.
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
	  super.animalSound();
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}
public class Polymorphism {
	public static void main(String[] args) {
	    Animal myAnimal = new Animal();
	    Animal myPig = new Pig();
	    Animal myDog = new Dog();
	     
		//reading data from object
	    myAnimal.animalSound();
	    myPig.animalSound();
	    myDog.animalSound();
	  }

}
