public class printnewgameBoard {

    public printnewgameBoard()
    {

    }

    public void updateGameBoard(char g[][], int pos, String player)
    {
        char symbol = ' ';
        if(player.equals("cpu")) symbol = '0';
        else if(player.equals("player")) symbol = 'X';

        switch(pos)
        {
            case 1:
            g[0][0] = symbol;
            break;

            case 2:
            g[0][2] = symbol;
            break;


            case 3:
            g[0][4] = symbol;
            break;


            case 4:
            g[2][0] = symbol;
            break;


            case 5:
            g[2][2] = symbol;
            break;

            case 6:
            g[2][4] = symbol;
            break;

            case 7:
            g[4][0] = symbol;
            break;

            case 8:
            g[4][2] = symbol;
            break;

            case 9:
            g[4][4] = symbol;
            break;

            default:

            break;
        }
    }
    
}
