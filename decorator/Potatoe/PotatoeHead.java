package decorator.Potatoe;

/**
 * A Potato Head
 * @author Nathan Russell
 */
public class PotatoeHead extends Character{

    /**
     * Creates a blank potato head
     */
    public PotatoeHead() {
        sections.add("");
        sections.add("    ____  ");
        sections.add("  /      \\");
        sections.add(" |        |");
        sections.add(" |        |");
        sections.add("  \\      /");
        sections.add("   \\____/");
    }
    
}
