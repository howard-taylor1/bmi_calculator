import java.util.Scanner;

public class Console {
    private static final Scanner scanner = new Scanner(System.in);

    public static void greet(String greeting){
        System.out.println(greeting);
        System.out.print(starsUnder(greeting));
        System.out.println();
    }

    public static String starsUnder(String text){
        return "*".repeat(text.length());
    }

    public static double readNumber(String prompt, double min, double max) {
        while (true) {
            System.out.print(prompt + ": ");
            String input = scanner.nextLine();
            if (InputValidator.isValidNumber(input, min, max)) {
                return Double.parseDouble(input);
            }
            System.out.println("Enter a value from " + min + " to " + max);
        }
    }
}