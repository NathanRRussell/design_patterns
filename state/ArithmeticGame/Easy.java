package state.ArithmeticGame;

import java.util.Random;

/**
 * The Easy State for the Game
 * @author Nathan Russell
 */
public class Easy implements State{
    private ArithmeticGame game;
    public static Random rand = new Random();

    /**
     * Initializes the game
     * @param game the arithmetic game
     */
    public Easy(ArithmeticGame game) {
        this.game = game;
    }
    
    /**
     * Gets a number 0-10 for the question
     */
    public int getNum() {
        int number = rand.nextInt(10) + 1;
        return number;
    }

    /**
     * Gets an addition or subtraction operator for the question
     */
    public String getOperation() {
        String[] operation = {"+", "-"};
        int randomIndex = rand.nextInt(operation.length);
        return operation[randomIndex];
    }

    /**
     * Levels up the user the medium difficulty
     */
    public void levelUp() {
        game.setState(game.getMediumState());
        System.out.println("You've been advanced to medium mode.");
    }

    /**
     * Notifies the user to try harder
     */
    public void levelDown() {
        System.out.println("You seem to be struggling, you may want to study");
    }
}
