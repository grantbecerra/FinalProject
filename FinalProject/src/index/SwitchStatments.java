package index;

import java.util.Scanner;

public class SwitchStatments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int user;

Scanner input = new Scanner(System.in);

System.out.print("Please enter your student number >>>");
user = input.nextInt();

switch(user)
{
case 137431:
	System.out.println("You have returned the Kingsman");
	break;
case 10:
	System.out.println("You have returned American Assassin");
	break;

}
	}
}
