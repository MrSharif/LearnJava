import java.util.*;

public class switchStatement {
	public static void main(String args[]){
		
		int age = 0;
		while (age <=4){
			
			age++;
		switch (age) {
		case 1:
				System.out.println("You can crawl");
				break;
		case 2:
			System.out.println("You can talk");
			break;
		case 3:
			System.out.println("You can get in trouble");
			break;
		default:
			System.out.println("I don't know how old you are");
		}
			
		}
	}
}
