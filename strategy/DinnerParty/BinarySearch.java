package strategy.DinnerParty;
import java.util.*;

public class BinarySearch {
    /**
     * Binary Search Tree sourced from a previous assignment
     * Searches/sorts through list of people
     * @param data
     * @param item
     * @return
     */
    public static int binarySearch(ArrayList<String> data, String item)
    {
    int begin = 0;
    int last = data.size() - 1;
    int mid = (begin + last)/2;
    if(data.get(mid) == item)
    {
        return mid;
    }
    while(begin <= last)
    {
        if(data.get(mid).compareTo(item) < 0)
        {
            begin = mid + 1;
        }
        else if(data.get(mid).compareTo(item) > 0)
        {
            last = mid - 1;
        }
    }
    return -1;

    }
	
}