package state.ArithmeticGame;

import java.util.Scanner;

/**
 * An Arithmetic Game
 * @author Nathan Russell
 */
public class ArithmeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score = 0;
    private Scanner reader;

    /**
     * Initializes states
     */
    public ArithmeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        reader = new Scanner(System.in);
        state = easyState;
    }

    /**
     * Displays the question and tracks score
     */
    public void pressQuestionButton() {
        int number1 = state.getNum();
        int number2 = state.getNum();
        String operation = state.getOperation();
        System.out.println(number1+" "+operation+" "+number2+" = ");
        int correctAnswer = 0;
        if(operation == "+") {
            correctAnswer = number1+number2;
        } else if(operation == "-") {
            correctAnswer = number1-number2;
        } else if(operation == "*") {
            correctAnswer = number1*number2;
        } else if(operation == "/") {
            correctAnswer = number1%number2;
        }
        int answer = reader.nextInt();
        reader.nextLine();
        if(answer == correctAnswer) {
            System.out.println("Correct");
            score++;
            if(score >= 3) {
                state.levelUp();
                score = 0;
            }
        } else {
            System.out.println("Incorrect");
            score--;
            if(score <= -3) {
                state.levelDown();
                score = 0;
            }
        }
    }

    /**
     * Sets state of the game
     * @param state state of the game
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Gets the easy state for the game
     * @return returns the easy state
     */
    public State getEasyState() {
        return easyState;
    }

    /**
     * Gets the medium state for the game
     * @return returns the medium state
     */
    public State getMediumState() {
        return mediumState;
    }

    /**
     * Gets the hard state for the game
     * @return returns the hard state
     */
    public State getHardState() {
        return hardState;
    }
}
