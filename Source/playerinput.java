
import java.util.*;
public class playerinput
{
    ArrayList <Integer> arr, arr2;
    int pos;
    positionavailable pa = new positionavailable();
    Scanner s = new Scanner(System.in);

public playerinput()
{
        
}

    
public int returnPlayerPlay(ArrayList <Integer> array, ArrayList<Integer> array2)
{
    while(true)
    {
        System.out.println("Play (1-9): ");
        pos =  s.nextInt();
        if(pos > 9) System.out.println("Plese play an integer less than 9: ");
        
        else if(pa.isPositionAvailable(array, array2, pos) ) break;
        else if(!pa.isPositionAvailable(array, array2, pos)) System.out.println("Position isn't available, try again: ");
        
    }
    array.add(pos);
   // System.out.printf("Player played: %d\n", pos);
    return pos;

}

public int returnCPUPlay(ArrayList<Integer> arr, ArrayList<Integer> arr2, Random rand)
    {
        int cos;
        while(true)
        {
            cos = rand.nextInt(9)+1;
            if(cos > 9)/*System.out.println("cos is more than 9\n")*/; //cos will never be more than 9 but oh well.
            else if(!pa.isPositionAvailable(arr, arr2, cos)) /*System.out.println("cos is not available\n")*/;
            else if(pa.isPositionAvailable(arr, arr2, cos)) break;
            
        }
        arr2.add(cos);
        //System.out.printf("CPU played: %d\n", cos); 
        return cos;
    }
    
}