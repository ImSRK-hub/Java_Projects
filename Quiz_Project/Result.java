import java.util.ArrayList;

public class Result {
    private int score;
    private ArrayList<String> answers;
    
    public Result(int score, ArrayList<String> answers) {
        this.score = score;
        this.answers = answers;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    
}
