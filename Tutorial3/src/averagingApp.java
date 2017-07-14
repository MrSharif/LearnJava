import java.util.*;

public class averagingApp {
	public static void main(String args[]){
		
		Scanner kbd = new Scanner(System.in);
		
		int total = 0;
		
		int grade;
		int avg;
		int counter = 0;
		
		while (counter < 10){
			
			grade = kbd.nextInt();
			
			total = total + grade;
			
			counter ++;
		}
		
		avg = total/10;
		
		System.out.println("Your averge Grade is " + avg);
	}
}
