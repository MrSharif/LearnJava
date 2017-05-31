import java.util.Scanner;

public class mathOperators {
	public static void main(String args[]){
		
		Scanner kbd = new Scanner(System.in);
		
		int men, women, people;
		
		men = 3;
		women = 5;
		people = women % men;
		
		System.out.println(people);
	}
}
