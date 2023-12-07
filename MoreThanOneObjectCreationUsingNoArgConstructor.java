package creatingClass_assigning_cassobjects;

public class MoreThanOneObjectCreationUsingNoArgConstructor {
	int speed = 0;
    int weight = 0;
 
    // constructors
    MoreThanOneObjectCreationUsingNoArgConstructor() {                        // default constructor.
         
    }
    MoreThanOneObjectCreationUsingNoArgConstructor(int speed) {              // takes only one arg.
        this.speed = speed;
    }
    MoreThanOneObjectCreationUsingNoArgConstructor(int weight, int speed) {  // takes two args.
        this.weight = weight;
        this.speed = speed;
    }
         
    public static void main(String[] args) {
         
    	MoreThanOneObjectCreationUsingNoArgConstructor obj1 = new MoreThanOneObjectCreationUsingNoArgConstructor(5, 6);
    	MoreThanOneObjectCreationUsingNoArgConstructor obj2 = new MoreThanOneObjectCreationUsingNoArgConstructor(10);
 
        System.out.println(obj1.weight);
        System.out.println(obj1.speed);
 
    }
 
	
		

	

}
