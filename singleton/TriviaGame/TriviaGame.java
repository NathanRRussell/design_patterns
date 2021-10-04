package singleton.TriviaGame;
import java.util.*;

public class TriviaGame {
    public static TriviaGame triviaGame;
    public int score;
    public Random rand;
    public Scanner reader;
    public ArrayList<Question> questions;

    private TriviaGame() {
        ArrayList<Question> questions = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        Random rand = new Random();
    }

    public static TriviaGame getInstance() {
        if(triviaGame == null) {
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }

    public void play() {
        playRound();
        System.out.println("(P)lay or (Q)uit:");
        String playAgain = reader.nextLine();
        while(playAgain.equalsIgnoreCase("p")) {
            playRound();
        }
        if(playAgain.equalsIgnoreCase("q")) {
            System.exit(0);
            System.out.println("You won "+score+" game(s)!\nGoodbye");
        } else {
            System.out.println("Error! (P)lay or (Q)uit:");
        }
    }

    public boolean playRound() {
        for(int i=0;i<questions.size();i++) {
            int index = rand.nextInt(questions.size());
            System.out.println(index);
        }
        System.out.println("Enter Answer: ");
        int answer = reader.nextInt();
        if(answer == 0) {
            System.out.println("YAY! You got it right!");
            return true;
        } else {
            System.out.println("You got it wrong!");
            return false;
        }
    }
}
