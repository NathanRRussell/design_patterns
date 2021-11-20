package state.ArithmeticGame;

import java.util.Random;

/**
 * The Hard State for the Game
 * @author Nathan Russell
 */
public class Hard implements State {
    public ArithmeticGame game;
    public static Random rand = new Random();

    /**
     * Initializes the game
     * @param game the arithmetic game
     */
    public Hard(ArithmeticGame game) {
        this.game = game;
    }
    
    /**
     * Gets a number 0-100 for the question
     */
    public int getNum() {
        int number = rand.nextInt(100) + 1;
        return number;
    }

    /**
     * Gets an addition, subtraction, multiplication, or division operator for the question
     */
    public String getOperation() {
        String[] operation = {"+", "-", "*", "/"};
        int randomIndex = rand.nextInt(operation.length);
        return operation[randomIndex];
    }

    /**
     * Notifies the user how well they are doing
     */
    public void levelUp() {
        System.out.println("You are doing so well!!!");
    }

    /**
     * Levels down the user the medium difficulty
     */
    public void levelDown() {
        game.setState(game.getMediumState());
        System.out.println("You seem to be struggling, let's go to medium mode.");
    }
}
