
public class board
{
public board()
{



}
public void gameBoard(char[][] gameBoard)
{
	for(char t[] : gameBoard)
	{
		for(char y:t)
		{
			System.out.print(y);
		}
		System.out.println();
	}
}
}