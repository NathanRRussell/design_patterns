package decorator.Potatoe;

/**
 * A nose for a potato head
 * @author Nathan Russell
 */
public class Nose extends CharacterDecorator {

    /**
     * Adds a nose to the potato
     * @param character A potato character
     */
    public Nose(Character character) {
        super(character);
     }
 
    /**
     * Replaces the fourth index of a potato head to add a nose
     */
     public void customize() {
         this.sections.set(4," |   >    |");
     }
    
}
