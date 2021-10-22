import java.util.*;
public class main
{
static char gameBoard[][] =
{
    {' ','|',' ','|',' '},
    {'-','+','-','+','-'},
    {' ','|',' ','|',' '},
    {'-','+','-','+','-'},
    {' ','|',' ','|',' '}
    
};
static Scanner s = new Scanner(System.in);
static Random r = new Random();
//static Integer play = 1;
static Integer player, cpu;
static ArrayList<Integer> playerarr = new ArrayList<Integer>();
static ArrayList<Integer> cpuarr = new ArrayList<Integer>();

static board pb = new board();
static playerinput pin = new playerinput();
static printnewgameBoard updateBoard = new printnewgameBoard();
static checkWin cw = new checkWin();

public static void main(String[] args)
    {
        while(true)
        {
        pb.gameBoard(gameBoard);
        int pos = pin.returnPlayerPlay(playerarr, cpuarr);
        updateBoard.updateGameBoard(gameBoard, pos, "player");
        if(checkWin.PlayerWin(playerarr)) 
        {
            System.out.println("Player wins!");
            break;
        }
       int cos = pin.returnCPUPlay(playerarr, cpuarr, r);
        updateBoard.updateGameBoard(gameBoard, cos, "cpu");
        if(checkWin.PlayerWin(cpuarr))
        {
            System.out.println("CPU wins!");
            break;
        }
        }
    }
}