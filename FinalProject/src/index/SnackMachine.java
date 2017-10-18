package index;

import java.util.Scanner;

public class SnackMachine 
{

	public static void main(String[] args) 
	{
		
		double snickers = 1.00;
		double starburst = 1.00;
		double muskateers = 1.00;
		double doritos = 1.00;
		double airheads = 1.00;
		double lays = 1.00;
		double sunchips = 1.00;
		double payday = 1.00;
		double twix = 1.00;
		double skittles = 1.00;
		
		Scanner keyboard = new Scanner (System.in);
        displayMenu();
        
        System.out.println("How many Snickers do you wanna buy?");
        int snickersOrdered = keyboard.nextInt();
        
        System.out.println("How much Starburst do you wanna buy?");
        int starburstOrdered = keyboard.nextInt();
        
        System.out.println("How many Three Muskateers do you wanna buy?");
        int muskateersOrdered = keyboard.nextInt();
        
        System.out.println("How much Doritos do you wanna buy?");
        int doritosOrdered = keyboard.nextInt();
        
        System.out.println("How many Airheads do you wanna buy?");
        int airheadsOrdered = keyboard.nextInt();
        
        System.out.println("How much Lays do you wanna buy?");
        int laysOrdered = keyboard.nextInt();
        
        System.out.println("How much Sunchips do you wanna buy?");
        int sunchipsOrdered = keyboard.nextInt();
        
        System.out.println("How many Paydays do you wanna buy?");
        int paydaysOrdered = keyboard.nextInt();
        
        System.out.println("How much Twix do you wanna buy?");
        int twixsOrdered = keyboard.nextInt();
        
        System.out.println("How much Skittles do you wanna buy?");
        int skittlesOrdered = keyboard.nextInt();
        
        
        double total = (snickers * snickersOrdered) + (starburst * starburstOrdered) + 
        		(muskateers * muskateersOrdered) + (doritos * doritosOrdered) + 
        		(airheads * airheadsOrdered) + (lays * laysOrdered) + (sunchips * sunchipsOrdered) + 
        		(payday * paydaysOrdered) + (twix * twixsOrdered) + (skittles * skittlesOrdered);
        
        System.out.println("Your total is " + total);
        	displayVendor();
	}
	public static void displayMenu()
	{
		
		System.out.println("Snickers = $1.00");
		System.out.println("Starburst = $1.00");
		System.out.println("Muskateers = $1.00");
		System.out.println("Doritos = $1.00");
		System.out.println("Airheads = $1.00");
		System.out.println("Lays = $1.00");
		System.out.println("Sunchips = $1.00");
		System.out.println("Payday = $1.00");
		System.out.println("Twix = $1.00");
		System.out.println("Skittles = $1.00");
	
		
	}	
	public static void displayVendor()
	{

	System.out.println("__________________");
    System.out.println("|________________|");
    System.out.println("|  @  @  @  @  @ |");
    System.out.println("|                |");
    System.out.println("|  @  @  @  @  @ |");
    System.out.println("|                |");
    System.out.println("|  @  @  @  @  @ |");
    System.out.println("|________________|");
    System.out.println("|A B C D 1 2 3 4 |");
    System.out.println("|E F G H 5 6 7 8 |");
    System.out.println("|I_J_K_L____9_0__|");
	
	
	
	
  }
	
}

	