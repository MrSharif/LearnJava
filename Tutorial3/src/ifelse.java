import java.util.*;

public class ifelse {
	public static void main(String args[]){
		
		int age = 45; 
		
		if (age > 60){
			System.out.println("you are a Senior Citizen");
		}
		else if (age >= 50){
			System.out.println("you are in your 50s");
		}
		else if (age >= 40){
			System.out.println("you are in your 40s");
		}else {
			System.out.println("you are a young buck");
		}
	}
}
