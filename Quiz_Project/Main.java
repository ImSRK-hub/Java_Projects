public class Main{

public static void main(String[] args) {
    QuestionsService question = new QuestionsService();
    try {
    Result result = question.playQuiz();
    System.out.println("\n\nYour Score : "+ result.getScore() + "/5");
    System.out.println("Your Answers :");
    for(String ans : result.getAnswers()){
        int i = 1;
        System.out.println(i+". "+ans);
    }
    }catch (Exception e){
        System.out.println(e);
    }
   
}

}