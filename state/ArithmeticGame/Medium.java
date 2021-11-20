package state.ArithmeticGame;

import java.util.Random;

/**
 * The Medium State for the Game
 * @author Nathan Russell
 */
public class Medium implements State {
    private ArithmeticGame game;
    public static Random rand = new Random();

    /**
     * Initializes the game
     * @param game the arithmetic game
     */
    public Medium(ArithmeticGame game) {
        this.game = game;
    }
    
    /**
     * Gets a number 0-50 for the question
     */
    public int getNum() {
        int number = rand.nextInt(50) + 1;
        return number;
    }

    /**
     * Gets an addition, subtraction, or multiplication operator for the question
     */
    public String getOperation() {
        String[] operation = {"+", "-", "*"};
        int randomIndex = rand.nextInt(operation.length);
        return operation[randomIndex];
    }

    /**
     * Levels up the user the hard difficulty
     */
    public void levelUp() {
        game.setState(game.getHardState());
        System.out.println("You've been advanced to the hardest mode.");
    }

    /**
     * Levels down the user to easy difficulty
     */
    public void levelDown() {
        game.setState(game.getEasyState());
        System.out.println("You seem to be struggling, let's go to easy mode.");
    }
}
