package creatingClass_assigning_cassobjects;

public class DemonstrationOfThisKeyWord {

	int speed = 0;
    int weight = 0;
 
    // constructors
    DemonstrationOfThisKeyWord() {                        // default constructor.
         
    }
    DemonstrationOfThisKeyWord(int speed) {              // takes only one arg.
        this.speed = speed;
    }
    DemonstrationOfThisKeyWord(int weight, int speed) {  // takes two args.
        this.weight = weight;
        this.speed = speed;
    }
         
    public static void main(String[] args) {
         
    	DemonstrationOfThisKeyWord obj1 = new DemonstrationOfThisKeyWord(5, 6);
    	DemonstrationOfThisKeyWord obj2 = new DemonstrationOfThisKeyWord(10);
 
        System.out.println(obj1.weight);
        System.out.println(obj2.speed);
 
    }
 
	
		

	

}
