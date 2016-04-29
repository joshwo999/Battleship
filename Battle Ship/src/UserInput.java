import java.util.Scanner;
public class UserInput
	{
		static int row;
		static int col;
		static String attack;
public static void checkInput()
{
	
	Scanner userInput=new Scanner(System.in);
	attack=userInput.nextLine();
	Results.checkForDuplicates();
	try
		{
	String letter=attack.substring(0, 1);
	col=Integer.parseInt(attack.substring(1))-1;
	
	switch(letter)
	{
		case "a":
		case "A":
				{
					row=0;
					break;
				}
		case "b":
		case "B":
				{
					row=1;
					break;
				}
		case "c":
		case "C":
				{
					row=2;
					break;
				}
		case "d":
		case "D":
				{
					row=3;
					break;
				}
		case "e":
		case "E":
				{
					row=4;
					break;
				}
		case "f":
		case "F":
				{
					row=5;
					break;
				}
		case "g":
		case "G":
				{
					row=6;
					break;
				}
		case "h":
		case "H":
				{
					row=7;
					break;
				}
		case "i":
		case "I":
				{
					row=8;
					break;
				}
		case "j":
		case "J":
				{
					row=9;
					break;
				}
		default:
				{
					System.out.println("That is not the proper format.");
					checkInput();
				}
							
	}
		}
	catch (Exception e)
		{
			System.out.println("That is not the proper format.");
			checkInput();
		}



}
	}
