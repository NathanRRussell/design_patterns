package decorator.Potatoe;

/**
 * Adds features to the potato head
 * @author Nathan Russell
 */
public abstract class CharacterDecorator extends Character {
    protected Character character;

    /**
     * Takes strings from "sections" array and put them in "this.sections" array
     * Calls customize
     * @param character A potato character
     */
    public CharacterDecorator(Character character) {
        this.character = character;
        for(int i = 0;i<character.sections.size();i++) {
            this.sections.add(character.sections.get(i));
        }
        customize();
    }

    abstract void customize();
}
