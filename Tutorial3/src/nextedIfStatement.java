import java.util.*;
public class nextedIfStatement {
	public static void main(String args[]){
		
		int age = 60;
		
		if (age < 50){
			System.out.println("You are pretty young");
		}else {
			System.out.println("You are old");
			
			if (age > 75){
				System.out.println("You are really old");
				
			} else {
				System.out.println("You aren't really that old");
			}
		}
	}
}