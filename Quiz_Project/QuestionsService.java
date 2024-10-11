import java.util.Scanner;

public class QuestionsService {
    Question[] questions = new Question[5];

    // 1,
    // "Angular is primarily maintained by which company?", 
    // ["Google","Facebook", "Microsoft", "Amazon"],
    // "Google"
    public QuestionsService(){
        String [] options1 = {"Google","Facebook", "Microsoft", "Amazon"};
        questions[0] = new Question(1, "Angular is primarily maintained by which company?",options1 , 1);

        String [] options2 = { "A CSS stylesheet", "A routing configuration", "A building block of Angular UI", "A server-side script"};
        questions[1] = new Question(2, "What is a component in Angular?", options2, 3);

        String [] options3 = {  "{{}}","[]","()","[()]"};
        questions[2] = new Question(3, "In Angular, how do you bind a component's class property to an element in its template?", options3, 2);

        String [] options4 = { "To define a service", "To declare a class as an Angular component", "To configure routing", "To create a directive"};
        questions[3] = new Question(4, "What is the purpose of the @Component decorator in Angular?", options4, 2);

        String [] options5 = { "A directive","A data binding", "An event binding", "A property binding"};
        questions[4] = new Question(5, "Given the Angular Syntax <button (click) = 'save()'>Save</button>, What does (click) represent?", options5, 3);

    }

    public int playQuiz(){
        int totalScore = 0;
        for( int i = 1; i <= questions.length; i++ ){
            System.out.println(questions[i-1].getId() + ".  " + questions[i-1].getQuestion());
            int j = 1;
            for(String opt : questions[i-1].getOptions()){
                System.out.println(j+")"+"  "+opt );
                j++;
            }
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.print("Select your Answer : ");
            int ans = sc.nextInt();
            if(ans == questions[i-1].getAnswer()){
                System.out.println();
                System.out.println("Correct Answer");
                totalScore++;
            }else{
                System.out.println();
                System.out.println("Wrong Answer");
            }
        }
        return totalScore;
    }
}
