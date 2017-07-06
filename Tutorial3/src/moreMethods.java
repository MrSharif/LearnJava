import java.util.*;

public class moreMethods {
	public static void main(String args[]){
		
		Scanner kbd = new Scanner(System.in);
		usingMoreMethods usingInstance = new usingMoreMethods();
		
		 System.out.println("Enter name of your wife: ");
		 
		 String temp = kbd.nextLine();
		 
		 usingInstance.setName(temp);
		 usingInstance.saying();
	}
}
