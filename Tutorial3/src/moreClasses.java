import java.util.*;

public class moreClasses {
	public static void main(String args[]){
		
		Scanner kbd = new Scanner(System.in);
		
		usingMethods methodsobject = new usingMethods ();
		
		System.out.println("Enter your name here: ");
		
		 String name = kbd.nextLine();
		 
		 methodsobject.simpleMessage(name);
		}
	}

