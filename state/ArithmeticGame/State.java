package state.ArithmeticGame;

/**
 * Interface for the State of the game
 * @author Nathan Russell
 */
public interface State {
    public int getNum();
    public String getOperation();
    public void levelUp();
    public void levelDown();
}
