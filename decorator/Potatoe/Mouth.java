package decorator.Potatoe;

/**
 * A mouth for a potato head
 * @author Nathan Russell
 */
public class Mouth extends CharacterDecorator {

    /**
     * Adds a mouth to the potato
     * @param character A potato character
     */
    public Mouth(Character character) {
        super(character);
     }
 
    /**
     * Replaces the fifth index of a potato head to add a mouth
     */
     public void customize() {
         this.sections.set(5,"  \\ ---- /");
     }
    
}
