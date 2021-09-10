package decorator.Potatoe;

/**
 * A hat for a potato head
 * @author Nathan Russell
 */
public class Hat extends CharacterDecorator {

    /**
     * Adds a hat to the potato
     * @param character A potato character
     */
    public Hat(Character character) {
        super(character);
     }
 
    /**
     * Replaces the 0 and first indexes of a potato head to add a hat
     */
     public void customize() {
         this.sections.set(0,"    ____");
         this.sections.set(1,"___|____|___");
     }
    
}
