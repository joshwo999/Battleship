import java.util.ArrayList;
public class Results
	{
static int win=0;
static int turns=0;
static ArrayList <String> previousAttacks= new ArrayList<String> ();
public static void checkAttack()
{
	try
		{
			
	if(EnemyBoard.enemyBoard[UserInput.row][UserInput.col].equals("X"))
		{
			System.out.println("You got a hit!");
			Board.board[UserInput.row][UserInput.col]="  X  ";
			win=win+1;
			turns=turns+1;
		}
	else
		{
			System.out.println("You missed.");
			Board.board[UserInput.row][UserInput.col]="  O  ";
			turns=turns+1;
		}
		}
	catch (Exception e)
		{
			System.out.println("That is not the proper format.");
			checkAttack();
		}
	
	}

public static void checkForDuplicates()
{
	if(previousAttacks.contains(UserInput.attack))
		{
			System.out.println("You've already guessed that.");
			UserInput.checkInput();
		}
	previousAttacks.add(UserInput.attack);
				
}
	}
