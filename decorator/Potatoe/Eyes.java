package decorator.Potatoe;

/**
 * Eyes for a potato head
 * @author Nathan Russell
 */
public class Eyes extends CharacterDecorator {

    /**
     * Adds eyes to the potato
     * @param character A potato character
     */
    public Eyes(Character character) {
       super(character);
    }

    /**
     * Replaces the third index of a potato head to add eyes
     */
    public void customize() {
        this.sections.set(3," |  o  o  |");
    }
    
}
