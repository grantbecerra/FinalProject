package index;

import java.util.Scanner;

public class SwitchStatments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int user;

Scanner input = new Scanner(System.in);

System.out.println("Would you like to return a movie?");
System.out.print("Please scan movie.");
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
	System.out.println("You have returned My Little Pony: The Movie");
	break;
case 40:
	System.out.println("You have returned Blade Runner 2049");
	break;
case 50:
	System.out.println("You have returned American Made");
	break;
case 60:
	System.out.println("You have returned The Mountain Between Us");
	break;
case 70:
	System.out.println("You have returned Happy Death Day");
	break;
case 80:
	System.out.println("You have returned Brave");
	break;
case 90:
	System.out.println("You have returned Spider-Man: Homecoming");
	break;
case 100:
	System.out.println("You have returned ");
	break;
}
	}
}
