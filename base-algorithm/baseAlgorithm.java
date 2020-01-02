///********************************************************************
// Algorithm1.java Author: Trevor Raynak
//
// 
//********************************************************************

package Algorithm;

import java.util.Scanner;

public class Algorithm1
{
	///********************************************************************
	// Converts a base 10 number to a 4 digit number in another base
	// 
	//********************************************************************
	public static void main (String[] args)
	{
	int base, maximumnumber, convertsto, Number1, Number2, Number3, Number4;
		
	Scanner scan = new Scanner (System.in);//Scanner reads the keyboard input
	
	//choose a new base from 2 to 9 here
	System.out.print("Please enter a base 2-9):");
	base=scan.nextInt();
	
	//calculates the largest 4 digit number that can fit in the base 10
	maximumnumber=(int) (Math.pow(base,4)-1);
	
	//choose a base 10 number here
	System.out.println("The maximum 4-digit number in base"+ base +" " + "is" + (maximumnumber));
	
	System.out.print("Please enter a base 10 number in the range 0 to " + " " + maximumnumber + " to convert: ");
		
	convertsto= scan.nextInt();
	
	//uses the Algorithm to divide the base until you get zero for the quotient
	Number1=((convertsto/base/base/base) % base);
	Number2=((convertsto/base/base) % base);
	Number3=((convertsto/base) % base);
	Number4=(convertsto % base);
	
	//This strings adds together the sequence
	String newBase = "" + Number1 + Number2 + Number3 + Number4;
	
	System.out.println ( convertsto + " (base 10) = " + newBase + " (base "+ base +")");
	     	        
	}
	    
}
///********************************************************************
// Algorithm1.java Author: Trevor Raynak
//
// 
//********************************************************************

package Algorithm;

import java.util.Scanner;

public class Algorithm1
{
	///********************************************************************
	// Converts a base 10 number to a 4 digit number in another base
	// 
	//********************************************************************
	public static void main (String[] args)
	{
	int base, maximumnumber, convertsto, Number1, Number2, Number3, Number4;
		
	Scanner scan = new Scanner (System.in);//Scanner reads the keyboard input
	
	//choose a new base from 2 to 9 here
	System.out.print("Please enter a base 2-9):");
	base=scan.nextInt();
	
	//calculates the largest 4 digit number that can fit in the base 10
	maximumnumber=(int) (Math.pow(base,4)-1);
	
	//choose a base 10 number here
	System.out.println("The maximum 4-digit number in base"+ base +" " + "is" + (maximumnumber));
	
	System.out.print("Please enter a base 10 number in the range 0 to " + " " + maximumnumber + " to convert: ");
		
	convertsto= scan.nextInt();
	
	//uses the Algorithm to divide the base until you get zero for the quotient
	Number1=((convertsto/base/base/base) % base);
	Number2=((convertsto/base/base) % base);
	Number3=((convertsto/base) % base);
	Number4=(convertsto % base);
	
	//This strings adds together the sequence
	String newBase = "" + Number1 + Number2 + Number3 + Number4;
	
	System.out.println ( convertsto + " (base 10) = " + newBase + " (base "+ base +")");
	     	        
	}
	    
}
