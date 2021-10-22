
import java.util.ArrayList;

public class positionavailable {
    public positionavailable()
    {

    }

    public boolean isPositionAvailable(ArrayList <Integer> array1, ArrayList <Integer> array2, int pos) 
    {
        for(int i = 0; i < array1.size(); i++)
        {
            if(pos == array1.get(i))
            {
                return false;
            }else ;
        }
        for(int i = 0 ; i < array2.size(); i++)
        {
            if(pos == array2.get(i))
            {
                return false;
            }else ;
        }

        return true;
    }

}
