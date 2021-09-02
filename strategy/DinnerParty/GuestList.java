package strategy.DinnerParty;
import java.util.*;

public class GuestList extends SearchBehavior {
    /**
     * Creating variables
     */
    private String title;
    private ArrayList<String> people;
    private LinearSearch searchBehavior;
    /**
     * Accessors
     * @param person
     */
     public GuestList(String person) {
         this.people = new ArrayList<>();
         this.searchBehavior = new LinearSearch();
         
     }
     public String getTitle() {
         return title;
     }
     public ArrayList<String> getList() {
         return this.people;
     }
     /**
      * Adding people to the list
      * @param person
      * @return
      */
     public boolean add(String person) {
         if(person.toLowerCase().contains(person))
         {
             return false;
         }
         else
            return true;
     }
     /**
      * Removing people from the list
      * @param person
      * @return
      */
     public boolean remove(String person) {
         if(person.toLowerCase().contains(person))
         {
             return false;
         }
         else
            return true;
     }
     /**
      * Setting if Linear or Binary Search is used
      * @param bSearch
      */
     public void setSearchBehavior(BinarySearch bSearch){
         searchBehavior = new LinearSearch();
     }


}