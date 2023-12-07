package simple_programs;

public class DemonstrationOfQuestionMarkOperator {

	public static void main(String[] args) {
		int i,k;
		i=10;
		k=i<0 ? -i: i; //Take the absolute value of i
		System.out.println("The absolute value of " + i + "is" + k);
		i=-10;
		k=i<0 ? -i: i; //Take the absolute value of i
		System.out.println("The absolute value of " + i + "is" + k);
	}

}
