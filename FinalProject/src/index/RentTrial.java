package index;

import java.util.Scanner;

public class RentTrial 
{
		// TODO Auto-generated method stub
	public static void main(String[] args) 
	{
		String choiceTheKingsman2;
		String theKingsman2Info; 
		String choiceAmericanAssassin;
		String americanAssassinInfo;
		String choiceIt;
		String itInfo;
		String choiceAmericanMade;
		String americanMadeInfo;
		String movieChoice;
		Scanner input = new Scanner(System.in);
		
			System.out.println("The Kingsman 2");
			System.out.println("American Assassin");
			
			System.out.print("what Movie do you want to rent ");
			movieChoice = input.nextLine();
			if("The Kingsman 2".equalsIgnoreCase(movieChoice))
			{
				System.out.println("You chose " + movieChoice);
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
					System.out.print(""
							+ "\n Would you like to rent this movie? Yes or No ");
					choiceTheKingsman2 = input.nextLine();
						if("Yes".equalsIgnoreCase(choiceTheKingsman2))
						{
							System.out.println(""
									+"\n Thank you for renting The Kingsman 2, That will Be $3.00");
						}
						else
							System.out.print(""
									+"\n Would you like to rent another movie?");
						choiceTheKingsman2 = input.nextLine();
						
					}
			}
			if("American Assassin".equalsIgnoreCase(movieChoice))
					{
				System.out.println("You chose " + movieChoice);
				System.out.print("Would you like more Information on American Assassin Yes or No ");
				americanAssassinInfo = input.nextLine();
						if("Yes".equalsIgnoreCase(americanAssassinInfo))
							{
							System.out.println(""
									+ "\n When Cold War veteran Stan Hurley takes CIA black ops recruit Mitch "
									+ "\n Rapp under his wing, they receive an assignment to investigate a wave of"
									+ "\n random attacks on both military and civilian targets. After discovering "
									+ "\n a pattern of violence, Hurley and Rapp join forces with a lethal Turkish"
									+ "\n agent to stop a mysterious operative who wants to start a global war.");		
							System.out.print(""
									+ "\n Would you like to rent this movie? Yes or No ");
							choiceAmericanAssassin = input.nextLine();
								if("Yes".equalsIgnoreCase(choiceAmericanAssassin))
								{
									System.out.println(""
											+"/n Thank you for renting American Assassin, That will Be $3.00");
								}
								else
									System.out.print(""
											+ "/n Would you like to rent another movie? Yes or No");
							}
							}
			if("It".equalsIgnoreCase(movieChoice))
			{
				System.out.println("You chose " + movieChoice);
				System.out.print("Would you like more Information on It Yes or No ");
				itInfo = input.nextLine();
					if("Yes".equalsIgnoreCase(itInfo))
					{
					System.out.println(""
							+ "\n Seven young outcasts in Derry, Maine, are about to face their worst nightmare "
							+ "\n an ancient, shape-shifting evil that emerges from the sewer every 27 years to "
							+ "\n prey on the town's children. Banding together over the course of one horrifying"
							+ "\n summer, the friends must overcome their own personal fears to battle the "
							+ "\n murderous, bloodthirsty clown known as Pennywise.");		
					System.out.print(""
							+ "\n Would you like to rent this movie? Yes or No ");
					choiceIt = input.nextLine();
						if("Yes".equalsIgnoreCase(choiceIt))
						{
							System.out.println(""
									+"/n Thank you for renting It, That will Be $3.00");
						}
						else
							System.out.print(""
									+ "/n Would you like to rent another movie? Yes or No");				
						}
						}
			
			
			
			
			
			
			
			
				}
				}
					
	






