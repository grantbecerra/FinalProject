package index;

		import java.util.Scanner;

		public class RentSecondary {
				// TODO Auto-generated method stub
			public static void main(String[] args) 
			{
				String choiceTheKingsman2;
				String theKingsman2Info; 
				Double kingsman2Cost = 3.00;
				String choiceAmericanAssassin;
				String americanAssassinInfo;
				Double americanAssassinCost = 3.00;
				String choiceIt;
				String itInfo;
				Double itCost = 3.00;
				String choiceAmericanMade;
				String americanMadeInfo;
				Double americanMadeCost = 3.00;
				String myLittlePonyInfo;
				String choiceMyLittlePony;
				Double myLittlePonyCost = 2.00;
				String bladeRunnerInfo;
				String choiceBladeRunner;
				Double bladeRunnerCost = 3.00;
				String theMountainBetweenUsInfo;
				String choiceTheMountainBetweenUs;
				Double theMountainBetweenUsCost = 2.00;
				String happyDeathDayInfo;
				String choiceHappyDeathDay;
				Double happyDeathDayCost = 3.00;
				String braveInfo;
				String choiceBrave;
				Double braveCost = 3.00;
				String spidermanHomecomingInfo;
				String choiceSpidermanHomecoming;
				Double spidermanHomecomingCost = 3.00;
				String movieChoice;
				String again;
				Scanner input = new Scanner(System.in);
				Double total = 0.00;
				
					System.out.println("The Kingsman 2");
					System.out.println("American Assassin");
					System.out.println("It");
					System.out.println("My Little Pony");
					System.out.println("Blade Runner 2049");
					System.out.println("American Made");
					System.out.println("The Mountain Between Us");
					System.out.println("Happy Death Day");
					System.out.println("Brave");
					System.out.println("Spiderman Homecoming");
					
			do {	
					System.out.print("what Movie do you want to rent ");
					movieChoice = input.nextLine();
					if("The Kingsman 2".equalsIgnoreCase(movieChoice))
					{
						System.out.println("You chose " + movieChoice + " this movie cost 3.00");
						System.out.print("Would you like more Information on The Kingsman 2? Yes or No ");
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
									total = (total + kingsman2Cost);
									System.out.println(""
											+"\n Thank you for renting The Kingsman 2.");
//									System.out.print(""
//											+"\n If you would like to rent another movie please enter the movie title");	
//									
//									movieChoice = input.nextLine();
								}
//								else
//									System.out.print(""
//											+"\n If you would like to rent another movie please enter the movie title");	
//									movieChoice = input.nextLine();
							}
					}
					if("American Assassin".equalsIgnoreCase(movieChoice))
							{
						System.out.println("You chose " + movieChoice + " this movie cost 3.00");
						System.out.print("Would you like more Information on American Assassin? Yes or No ");
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
											total = (total + americanAssassinCost);
											System.out.println(""
													+"\n Thank you for renting American Assassin.");
										
										}
									
								}
								}
					if("It".equalsIgnoreCase(movieChoice))
					{
						System.out.println("You chose " + movieChoice + " this movie cost 3.00");
						System.out.print("Would you like more Information on It? Yes or No ");
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
									total = (total + itCost);
									System.out.println(""
											+"\n Thank you for renting It.");
										
								}
								}
					if("My Little Pony".equalsIgnoreCase(movieChoice))
					{
						System.out.println("You chose " + movieChoice + " this movie cost 2.00");
						System.out.print("Would you like more Information on My Little Pony? Yes or No ");
						myLittlePonyInfo = input.nextLine();
							if("Yes".equalsIgnoreCase(myLittlePonyInfo))
							{
							System.out.println(""
									+ "\n Twilight Sparkle, Applejack, Rainbow Dash, Pinkie Pie, Fluttershy and"
									+ "\n Rarity embark on an epic journey to save Ponyville from a dark force.");		
							System.out.print(""
									+ "\n Would you like to rent this movie? Yes or No ");
							choiceMyLittlePony = input.nextLine();
								if("Yes".equalsIgnoreCase(choiceMyLittlePony))
								{
									total = (total + myLittlePonyCost);
									System.out.println(""
											+"\n Thank you for renting My Little Pony.");
									
								}
								}
					if("Blade Runner 2049".equalsIgnoreCase(movieChoice))
					{
						System.out.println("You chose " + movieChoice + " this movie cost 3.00");
						System.out.print("Would you like more Information on Blade Runner 2049? Yes or No ");
						bladeRunnerInfo = input.nextLine();
							if("Yes".equalsIgnoreCase(bladeRunnerInfo))
							{
							System.out.println(""
									+ "\n Officer K (Ryan Gosling), a new blade runner for the Los Angeles Police" 
									+ "\n Department, unearths a long-buried secret that has the potential to plunge"
									+ "\n what's left of society into chaos. His discovery leads him on a quest to"
									+ "\n find Rick Deckard (Harrison Ford), a former blade runner who's been missing"
									+ "\n for 30 years.");
							System.out.print(""
									+ "\n Would you like to rent this movie? Yes or No ");
							choiceBladeRunner = input.nextLine();
								if("Yes".equalsIgnoreCase(choiceBladeRunner))
								{
									total = (total + bladeRunnerCost);
									System.out.println(""
											+"\n Thank you for renting Blade Runner 2049.");
									
								}
								}
					if("American Made".equalsIgnoreCase(movieChoice))
					{
						System.out.println("You chose " + movieChoice + " this movie cost 3.00");
						System.out.print("Would you like more Information on American Made? Yes or No ");
						americanMadeInfo = input.nextLine();
							if("Yes".equalsIgnoreCase(americanMadeInfo))
							{
							System.out.println(""
									+ "\n Barry Seal, a TWA pilot, is recruited by the CIA to provide "
									+ "\n reconnaissance on the burgeoning communist threat in Central America"
									+ "\n and soon finds himself in charge of one of the biggest covert CIA "
									+ "\n operations in the history of the United States. The operation spawns "
									+ "\n the birth of the Medellin cartel and almost brings down the Reagan "
									+ "\n White House.");		
							System.out.print(""
									+ "\n Would you like to rent this movie? Yes or No ");
							choiceAmericanMade = input.nextLine();
								if("Yes".equalsIgnoreCase(choiceAmericanMade))
								{
									total = (total + americanMadeCost);
									System.out.println(""
											+"\n Thank you for renting American Made.");
									
								}
								}
					if("The Mountain Betwween Us".equalsIgnoreCase(movieChoice))
					{
						System.out.println("You chose " + movieChoice + " this movie cost 2.00");
						System.out.print("Would you like more Information on The Mountain Betwween Us? Yes or No ");
						choiceTheMountainBetweenUs = input.nextLine();
							if("Yes".equalsIgnoreCase(choiceTheMountainBetweenUs))
							{
							System.out.println(""
									+ "\n Stranded on a mountain after a tragic plane crash, two strangers must"
									+ "\n work together to endure the extreme elements of the remote, snow-covered"
									+ "\n terrain. Realizing that help is not on the way, they embark on a perilous"
									+ "\n journey across hundreds of miles of wilderness, pushing each other to "
									+ "\n survive and discovering their inner strength.");		
							System.out.print(""
									+ "\n Would you like to rent this movie? Yes or No ");
							choiceTheMountainBetweenUs = input.nextLine();
								if("Yes".equalsIgnoreCase(choiceTheMountainBetweenUs))
								{
									total = (total + theMountainBetweenUsCost);
									System.out.println(""
											+"\n Thank you for renting The Mountain Betwween Us.");
									
								}
								}
					if("Happy Death Day".equalsIgnoreCase(movieChoice))
					{
						System.out.println("You chose " + movieChoice + " this movie cost 3.00");
						System.out.print("Would you like more Information on Happy Death Day? Yes or No ");
						happyDeathDayInfo = input.nextLine();
							if("Yes".equalsIgnoreCase(happyDeathDayInfo))
							{
							System.out.println(""
									+ "\n Tree Gelbman is a blissfully self-centered collegian who wakes up on her birthday "
									+ "\n in the bed of a student named Carter. As the morning goes on, Tree gets the eerie"
									+ "\n feeling that she's experienced the events of this day before. When a masked killer"
									+ "\n suddenly takes her life in a brutal attack, she once again magically wakes up in"
									+ "\n Carter's dorm room unharmed. Now, the frightened young woman must relive the same"
									+ "\n day over and over until she figures out who murdered her.");		
							System.out.print(""
									+ "\n Would you like to rent this movie? Yes or No ");
							choiceHappyDeathDay = input.nextLine();
								if("Yes".equalsIgnoreCase(choiceHappyDeathDay))
								{
									total = (total + happyDeathDayCost);
									System.out.println(""
											+"\n Thank you for renting Happy Death Day.");		
								}
								}
					if("Brave".equalsIgnoreCase(movieChoice))
					{
						System.out.println("You chose " + movieChoice + " this movie cost 3.00");
						System.out.print("Would you like more Information on Brave? Yes or No ");
						braveInfo = input.nextLine();
							if("Yes".equalsIgnoreCase(braveInfo))
							{
							System.out.println(""
									+ "\n Merida (Kelly Macdonald), the impetuous but courageous daughter of Scottish King"
									+ "\n Fergus (Billy Connolly) and Queen Elinor (Emma Thompson), is a skilled archer who"
									+ "\n wants to carve out her own path in life. Her defiance of an age-old tradition angers"
									+ "\n the Highland lords and leads to chaos in the kingdom. Merida seeks help from an"
									+ "\n eccentric witch (Julie Walters), who grants her an ill-fated wish. Now, Merida"
									+ "\n must discover the true meaning of courage and undo a beastly curse before it's too "
									+ "\n late.");		
							System.out.print(""
									+ "\n Would you like to rent this movie? Yes or No ");
							choiceBrave = input.nextLine();
								if("Yes".equalsIgnoreCase(choiceBrave))
								{
									total = (total + braveCost);
									System.out.println(""
											+"\n Thank you for renting Brave.");	
								}
								}
					if("Spiderman Homecomming".equalsIgnoreCase(movieChoice))
					{
						System.out.println("You chose " + movieChoice + " this movie cost 3.00");
						System.out.print("Would you like more Information on Spideman Homecoming? Yes or No ");
						spidermanHomecomingInfo = input.nextLine();
							if("Yes".equalsIgnoreCase(spidermanHomecomingInfo))
							{
							System.out.println(""
									+ "\n Thrilled by his experience with the Avengers, young Peter Parker returns home to "
									+ "\n live with his Aunt May. Under the watchful eye of mentor Tony Stark, Parker starts"
									+ "\n to embrace his newfound identity as Spider-Man. He also tries to return to his"
									+ "\n normal daily routine -- distracted by thoughts of proving himself to be more than"
									+ "\n just a friendly neighborhood superhero. Peter must soon put his powers to the"
									+ "\n test when the evil Vulture emerges to threaten everything that he holds dear.");		
							System.out.print(""
									+ "\n Would you like to rent this movie? Yes or No ");
							choiceSpidermanHomecoming = input.nextLine();
								if("Yes".equalsIgnoreCase(choiceSpidermanHomecoming))
								{
									total = (total + spidermanHomecomingCost);
									System.out.println(""
											+"\n Thank you for renting Spiderman Homecoming.");	
								}
								}
				
					 System.out.println("Your total was $" + total);
					 System.out.print(""
								+"\n If you would like to rent another movie please enter the movie title");	

						again = input.nextLine();
					}while ("Yes".equalsIgnoreCase(again));
			
			
						
				
	


