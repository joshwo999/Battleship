
public class EnemyBoard
	{
static String[][] enemyBoard =new String[10][10];
public static void pickBoard()
{
	int randomNumber=(int)(Math.random()*3)+1;
	
	if(randomNumber==1)
		{
	for(int row=0; row<10; row++)
		{
			for(int col=0; col<10; col++)
				{
					enemyBoard[row][col]="     ";
				}
		}
	enemyBoard[0][0]="X";
	enemyBoard[0][1]="X";
	
	enemyBoard[4][0]="X";
	enemyBoard[4][1]="X";
	enemyBoard[4][2]="X";
	
	enemyBoard[6][6]="X";
	enemyBoard[6][7]="X";
	enemyBoard[6][8]="X";
	
	enemyBoard[0][4]="X";
	enemyBoard[1][4]="X";
	enemyBoard[2][4]="X";
	enemyBoard[3][4]="X";
	
	enemyBoard[2][5]="X";
	enemyBoard[3][5]="X";
	enemyBoard[4][5]="X";
	enemyBoard[5][5]="X";
	enemyBoard[6][5]="X";
		}
	else if(randomNumber==2)
		{
			for(int row=0; row<10; row++)
				{
					for(int col=0; col<10; col++)
						{
							enemyBoard[row][col]="     ";
						}
				}
			enemyBoard[0][4]="X";
			enemyBoard[0][5]="X";
			
			enemyBoard[5][0]="X";
			enemyBoard[6][0]="X";
			enemyBoard[7][0]="X";
			
			enemyBoard[6][6]="X";
			enemyBoard[6][7]="X";
			enemyBoard[6][8]="X";
			
			enemyBoard[6][9]="X";
			enemyBoard[7][9]="X";
			enemyBoard[8][9]="X";
			enemyBoard[9][9]="X";
			
			enemyBoard[9][0]="X";
			enemyBoard[9][1]="X";
			enemyBoard[9][2]="X";
			enemyBoard[9][3]="X";
			enemyBoard[9][4]="X";
					
		}
	else
		{
			for(int row=0; row<10; row++)
				{
					for(int col=0; col<10; col++)
						{
							enemyBoard[row][col]="     ";
						}
					
				}
			enemyBoard[4][6]="X";
			enemyBoard[5][6]="X";
			
			enemyBoard[9][6]="X";
			enemyBoard[9][7]="X";
			enemyBoard[9][8]="X";
			
			enemyBoard[0][9]="X";
			enemyBoard[1][9]="X";
			enemyBoard[2][9]="X";
			
			enemyBoard[0][0]="X";
			enemyBoard[1][0]="X";
			enemyBoard[2][0]="X";
			enemyBoard[3][0]="X";
			
			enemyBoard[7][0]="X";
			enemyBoard[7][1]="X";
			enemyBoard[7][2]="X";
			enemyBoard[7][3]="X";
			enemyBoard[7][4]="X";
}
	}}
