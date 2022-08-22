import java.io.IOException;
import java.util.Scanner;

public class Quiz
{
    public static void main(String [] args) throws IOException, InterruptedException
    {
        int num = 0, score = 0;
        Scanner input = new Scanner(System.in);
        String [] questions= {
            "What is 2 + 2", 
            "When did Pakistan become indpendent?",
            "How many Letters are there in the English Language?",
            "What is 3 + 3?",
            "What is 2 x 8",
            "What is 10 / 2",
        };
        String [] ans = {
            "4",
            "1947",
            "26",
            "6",
            "16",
            "5",
        };
        while(true)
        {
            cls();
            
            ++num;
            int randomNum = (int)(Math.random()*questions.length);
            System.out.println("---Quiz Game in Java---\n");
            System.out.println("Score: " + score);
            System.out.print("\nQ. " + num + ". " + questions[randomNum] + "\n");
            String userAns = input.nextLine();
            if(userAns.equals(ans[randomNum]))
            {
                System.out.println("\n-Correct!");
                score++;
            }
            else if(userAns.equals("end") || userAns.equals("END"))
            {
                System.out.println("---Game TERMINATED---");
                System.exit(69);
            }
            else
            {
                System.out.println("\n-Incorrect!");
            }
            System.out.println("[Press Enter to Continue...]");
            input.nextLine();
            cls();
        }
    }
    public static void cls() throws IOException, InterruptedException
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}