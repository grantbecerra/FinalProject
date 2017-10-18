package index;

import java.util.Scanner;

public class Array {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		

		int numbers [] = {277347, 6788585, 47785412, 87824654};
		int total;
		int count;
		String choice;
		System.out.print("Please enter a number to win a free movie");
		 choice = input.nextLine();
		 
		 if("277347".equals(choice))
		 {
			System.out.println("Congratulations you have won a free movie");
		    FreeMovie.main(args);
		 }
		 if("6788585".equals(choice))
		 {
			System.out.println("Congratulations you have won a free movie");
		    FreeMovie.main(args);
		 }if("47785412".equals(choice))
		 {
			System.out.println("Congratulations you have won a free movie");
		    FreeMovie.main(args);
		 }if("87824654".equals(choice))
		 {
			System.out.println("Congratulations you have won a free movie");
		    FreeMovie.main(args);
		 }
		 else 
		 {
			 System.out.println("Sorry You did not win a free Movie");
		 }
		
	}
		
	
		
}


