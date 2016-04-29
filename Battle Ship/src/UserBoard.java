import java.util.Scanner;
public class UserBoard
	{
		static String[][] userBoard= new String[10][10];
		static String choice;
public static void pickUserBoard()
{
	System.out.println("The first thing you need to do is place you ships. You place your ships on the board by typing where you wwant the ship to start and where you want it to end. Example: saying A1 and A3 will place a ship of three in length form A1-A3.");
	System.out.println("Here are the ships you can place: ");
	System.out.println("(1) Aircraft carrier: occupies 5 spaces.");
	System.out.println("(2) Battleship: occupies 4 spaces.");
	System.out.println("(3) Submarine: occupies 3 spaces.");
	System.out.println("(4) Destroyer: occupies 3 spaces.");
	System.out.println("(5) Patrol boat: occupies 2 spaces.");
	System.out.println("");
	System.out.println("Now tell me where you want to place you ships.");
	placeShips();

}
public static void placeShips()
{	
	System.out.println("Tell me where you want your aircraft carrier to start.  (Remember the aircraft carrier has a length of 5.)");
	UserInput.checkInput();
	userBoard[UserInput.row][UserInput.col]="  X  ";
	System.out.println("Ok now tell me where you want it to end.  (Remember the aircraft carrier has a length of 5.)");
	UserInput.checkInput();
	userBoard[UserInput.row][UserInput.col]="  X  ";
	for(int i=0; i<3; i++)
		{
			
		}
	displayUserBoard();
			

}
public static void displayUserBoard()
{

	System.out.println("			   YOUR BOARD");
	System.out.println("");
	System.out.println("    1     2     3     4     5     6     7     8     9    10");
	System.out.println("  -----------------------------------------------------------");
	System.out.println("A|"+userBoard[0][0]+"|"+userBoard[0][1]+"|"+userBoard[0][2]+"|"+userBoard[0][3]+"|"+userBoard[0][4]+"|"+userBoard[0][5]+"|"+userBoard[0][6]+"|"+userBoard[0][7]+"|"+userBoard[0][8]+"|"+userBoard[0][9]+"|");
	System.out.println("  -----------------------------------------------------------");
	System.out.println("B|"+userBoard[1][0]+"|"+userBoard[1][1]+"|"+userBoard[1][2]+"|"+userBoard[1][3]+"|"+userBoard[1][4]+"|"+userBoard[1][5]+"|"+userBoard[1][6]+"|"+userBoard[1][7]+"|"+userBoard[1][8]+"|"+userBoard[1][9]+"|");
	System.out.println("  -----------------------------------------------------------");
	System.out.println("C|"+userBoard[2][0]+"|"+userBoard[2][1]+"|"+userBoard[2][2]+"|"+userBoard[2][3]+"|"+userBoard[2][4]+"|"+userBoard[2][5]+"|"+userBoard[2][6]+"|"+userBoard[2][7]+"|"+userBoard[2][8]+"|"+userBoard[2][9]+"|");
	System.out.println("  -----------------------------------------------------------");
	System.out.println("D|"+userBoard[3][0]+"|"+userBoard[3][1]+"|"+userBoard[3][2]+"|"+userBoard[3][3]+"|"+userBoard[3][4]+"|"+userBoard[3][5]+"|"+userBoard[3][6]+"|"+userBoard[3][7]+"|"+userBoard[3][8]+"|"+userBoard[3][9]+"|");
	System.out.println("  -----------------------------------------------------------");
	System.out.println("E|"+userBoard[4][0]+"|"+userBoard[4][1]+"|"+userBoard[4][2]+"|"+userBoard[4][3]+"|"+userBoard[4][4]+"|"+userBoard[4][5]+"|"+userBoard[4][6]+"|"+userBoard[4][7]+"|"+userBoard[4][8]+"|"+userBoard[4][9]+"|");
	System.out.println("  -----------------------------------------------------------");
	System.out.println("F|"+userBoard[5][0]+"|"+userBoard[5][1]+"|"+userBoard[5][2]+"|"+userBoard[5][3]+"|"+userBoard[5][4]+"|"+userBoard[5][5]+"|"+userBoard[5][6]+"|"+userBoard[5][7]+"|"+userBoard[5][8]+"|"+userBoard[5][9]+"|");
	System.out.println("  -----------------------------------------------------------");
	System.out.println("G|"+userBoard[6][0]+"|"+userBoard[6][1]+"|"+userBoard[6][2]+"|"+userBoard[6][3]+"|"+userBoard[6][4]+"|"+userBoard[6][5]+"|"+userBoard[6][6]+"|"+userBoard[6][7]+"|"+userBoard[6][8]+"|"+userBoard[6][9]+"|");
	System.out.println("  -----------------------------------------------------------");
	System.out.println("H|"+userBoard[7][0]+"|"+userBoard[7][1]+"|"+userBoard[7][2]+"|"+userBoard[7][3]+"|"+userBoard[7][4]+"|"+userBoard[7][5]+"|"+userBoard[7][6]+"|"+userBoard[7][7]+"|"+userBoard[7][8]+"|"+userBoard[7][9]+"|");
	System.out.println("  -----------------------------------------------------------");
	System.out.println("I|"+userBoard[8][0]+"|"+userBoard[8][1]+"|"+userBoard[8][2]+"|"+userBoard[8][3]+"|"+userBoard[8][4]+"|"+userBoard[8][5]+"|"+userBoard[8][6]+"|"+userBoard[8][7]+"|"+userBoard[8][8]+"|"+userBoard[8][9]+"|");
	System.out.println("  -----------------------------------------------------------");
	System.out.println("J|"+userBoard[9][0]+"|"+userBoard[9][1]+"|"+userBoard[9][2]+"|"+userBoard[9][3]+"|"+userBoard[9][4]+"|"+userBoard[9][5]+"|"+userBoard[9][6]+"|"+userBoard[9][7]+"|"+userBoard[9][8]+"|"+userBoard[9][9]+"|");
	System.out.println("  -----------------------------------------------------------");
	
}
public static void fillUserBoard()
{
	for(int row=0; row<10; row++)
		{
			for(int col=0; col<10; col++)
				{
					userBoard[row][col]="     ";
				}
		}
}
	}
