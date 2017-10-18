package index;

import java.util.Scanner;

public class Project 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String choice;
		System.out.println("Welcome to SnackBox would you like to rent a movie, return a movie, or purchase movie snacks? Or would you like "
				+ "\n a chance at a free movie?");
	    choice = input.nextLine();
		
	    if("rent a movie".equalsIgnoreCase(choice)||"rent".equalsIgnoreCase(choice)||"movie".equalsIgnoreCase(choice))
	    {
	    RentTrial.main(args);
	    }			
			
	    if("snack".equalsIgnoreCase(choice)||"snacks".equalsIgnoreCase(choice)||"movie snacks".equalsIgnoreCase(choice))
	    {
	    SnackMachine.main(args);
	    }				
		
	    if("return a movie".equalsIgnoreCase(choice)||"return".equalsIgnoreCase(choice))
	    {
	    SwitchStatments.main(args);
	    }
		
	    if("free movie".equalsIgnoreCase(choice)||"free".equalsIgnoreCase(choice))
	    {
	    Array.main(args);	
	    }
	}

}
