package strategy.DinnerParty;
import java.util.*;

public class SearchBehavior{
    /**
     * Sets if Binary Search is used or if Linear Search is used
     * @param data
     * @param item
     * @return
     */
    public boolean setSearchBehavior(ArrayList<String> data, String item){
        if(data.equals(item))
        {
            return true;
        }
        else
            return false;

    }

}