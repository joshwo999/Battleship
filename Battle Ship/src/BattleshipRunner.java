
public class BattleshipRunner
	{

		public static void main(String[] args)
			{
				//UserBoard.fillUserBoard();
				//UserBoard.pickUserBoard();
				Greeting.greetUser();
				Board.fillBoard();
				Board.display();
				EnemyBoard.pickBoard();
			while(Results.win!=17)
				{
				UserInput.checkInput();
				Results.checkAttack();
				Board.display();
				}
			Board.display();
			System.out.println("You win!");
			System.out.println("It took you "+Results.turns+" tries.");
			}

	}
