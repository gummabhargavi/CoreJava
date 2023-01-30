/*wrapping code and data together into a single unit */
class Person {
  private String name; // declare class variable as private

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
}

public class Encapsulation {
	public static void main(String[] args) {
	    Person myObj = new Person();
	    myObj.setName("John"); // Set the value of the name variable to "John"
	    System.out.println(myObj.getName());
	  }

}
