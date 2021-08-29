package strategy.DinnerParty;
import java.util.*;

public class LinearSearch{
    /**
     * Linear Search Tree sourced from a previous assignment
     * Searches and checks each specified item
     * @param data
     * @param item
     * @return
     */
    public static boolean linearSearch(ArrayList<String> data, String item){    
        for(int i=0;i<data.size();i++)
        {    
            if(data.get(i) == item)
            {    
                return true;    
            }
        }
        return false;       
    }    
}