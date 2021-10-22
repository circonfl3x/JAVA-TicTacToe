
import java.util.ArrayList;

public class checkWin {
    public checkWin()
    {

    }

    public static boolean PlayerWin(ArrayList<Integer> arr)
    {
        /*
        Horizontal → (1,2,3) (4,5,6) (7,8,9)
        Vertical → (1,4,7) (2,5,8) (3,6,9)
        Diagonal → (3,5,7) (1,5,9)
        */
        if(arr.contains(1) && arr.contains(2) && arr.contains(3) ||
        
            arr.contains(4) && arr.contains(5) && arr.contains(6) ||
            
            arr.contains(7) && arr.contains(8) && arr.contains(9) ||
            
            arr.contains(1) && arr.contains(4) && arr.contains(7) ||
            
            arr.contains(2) && arr.contains(5) && arr.contains(8) ||
            
            arr.contains(3) && arr.contains(6) && arr.contains(9) ||
            
            arr.contains(3) && arr.contains(5) && arr.contains(7) ||

            arr.contains(1) && arr.contains(5) && arr.contains(9) )
        {
            return true;
        }

        return false;
    }
}
