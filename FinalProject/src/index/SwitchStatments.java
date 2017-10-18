package index;

import java.util.Scanner;

public class SwitchStatments 
{

	public static void main(String[] args)
	{
		
	int user;
	String choice;
	do {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Please scan the movie you would like to return.");
	user = input.nextInt();
	
			switch(user)
			{
			case 10:
				System.out.println("You have returned the Kingsman");
				break;
			case 20:
				System.out.println("You have returned American Assassin");
				break;
			case 30:
				System.out.println("You have returned IT 2017");
				break;
			case 40:
				System.out.println("You have returned My Little Pony: The Movie");
				break;
			case 50:
				System.out.println("You have returned Blade Runner 2049");
				break;
			case 60:
				System.out.println("You have returned American Made");
				break;
			case 70:
				System.out.println("You have returned The Mountain Between Us");
				break;
			case 80:
				System.out.println("You have returned Happy Death Day");
				break;
			case 90:
				System.out.println("You have returned Brave");
				break;
			case 100:
				System.out.println("You have returned Spider-Man: Homecoming");
				break;
			
			}
			System.out.println("Do you want to return another movie? Y or N >>>");
			choice = input.next();
		}while("Yes".equalsIgnoreCase(choice) || "Y".equalsIgnoreCase(choice) );
	


	}
}

