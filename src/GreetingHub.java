import java.util.Scanner;

public class GreetingHub {
    public static void main(String[] args) {
        if (promptEvent().equals("Coding")) {
            System.out.println("Happy Coding!");
        }
    }

    static String promptEvent() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the event: ");
        return scan.nextLine();
    }
}
