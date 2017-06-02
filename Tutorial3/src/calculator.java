import java.util.*;

public class calculator {
	public static void main(String args[]){
		
		Scanner kbd = new Scanner(System.in);
		
		double fnum, snum, answer;
		
		System.out.println("Enter first Number: ");
		
		fnum = kbd.nextDouble();
		
		System.out.println("Enter second Number: ");
		
		snum = kbd.nextDouble();
		
		answer = fnum + snum;
		
		System.out.println("Total: " + answer);
	}
}
