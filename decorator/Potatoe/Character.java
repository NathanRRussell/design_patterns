package decorator.Potatoe;
import java.util.*;

/**
 * A Character
 * @author Nathan Russell
 */
public abstract class Character {
    protected ArrayList<String> sections;

    /**
     * Initializes an array list for a character
     */
    public Character() {
        sections = new ArrayList<>();
    }

    /**
     * Prints each instance in the array list
     */
    public void draw() {
        for(int i = 0;i<sections.size();i++) {
            System.out.println(sections.get(i));
        }
    }
    
}
