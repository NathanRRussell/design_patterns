package singleton.TriviaGame;

public class Question {
    public String question;
    public String[] answers;
    public int correctAnswer;

    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer) {
        this.question = question;
        this.answers[0] = ans1;
        this.answers[1] = ans2;
        this.answers[2] = ans3;
        this.answers[3] = ans4;
    }

    public String toString() {
        return question+"\n1. "+answers;
    }

    public boolean isCorrect(int userAnswer) {
        if(correctAnswer == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String getCorrectAnswer() {
        String correct = Integer.toString(correctAnswer);
        return correct;
    }
    
}
