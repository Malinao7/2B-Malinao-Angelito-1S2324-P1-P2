import java.util.Scanner;

public class SayAnything{
    private final Scanner scanner;

    public SayAnything() {
        scanner = new Scanner(System.in);
    }

    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public void closeScanner() {
        scanner.close();
    }

    public static void main(String[] args) {
        SayAnything userInput = new SayAnything();
        String userFirstName = userInput.getInput("FirstName: ");
        String userSecondName = userInput.getInput("SecondName: ");
        System.out.println("Users Name: " + userFirstName + " " + userSecondName );

        userInput.closeScanner();
    }
}
