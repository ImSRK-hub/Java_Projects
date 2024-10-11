public class Main{

public static void main(String[] args) {
    QuestionsService question = new QuestionsService();
    int resultScore = question.playQuiz();
    System.out.println("Your Score : "+ resultScore + "/5");
}

}