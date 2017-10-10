package index;

import java.util.Scanner;

public class RentTrial {
		// TODO Auto-generated method stub
	public static void main(String[] args) 
	{
		String choiceTheKingsman2;
		String theKingsman2Info; 
		Double americanAssassin;
		Scanner input = new Scanner(System.in);
		
			System.out.println("The Kingsman 2");
			System.out.println("American Assassin");
			
			System.out.print("what Movie do you want to rent ");
			choiceTheKingsman2 = input.nextLine();
			if("The Kingsman 2".equalsIgnoreCase(choiceTheKingsman2))
			{
				System.out.println("You chose " + choiceTheKingsman2);
				System.out.print("Would you like more Information on The Kingsman 2 Yes or No ");
				theKingsman2Info = input.nextLine();
				if("Yes".equalsIgnoreCase(theKingsman2Info))
					{
					System.out.println(""
							+ "\n With their headquarters destroyed and the world held hostage, "
							+ "\n members of Kingsman find new allies when they discover a spy organization"
							+ "\n in the United States known as Statesman. In an adventure that tests their"
							+ "\n strength and wits, the elite secret agents from both sides of the pond "
							+ "\n band together to battle a ruthless enemy and save the day, something "
							+ "\n that's becoming a bit of a habit for Eggsy.");
					
					}
					
	}

}
}
