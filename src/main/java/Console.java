import java.util.Scanner;

public class Console {
    private static final Scanner scanner = new Scanner(System.in);
    public static void greet(String greeting){
        System.out.println(greeting);
        for (int i = 0; i < greeting.length(); i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static double readNumber(String prompt, double min, double max) {
        String input;
        double value;
        while (true) {
            System.out.print(prompt + ": ");
            input = scanner.nextLine();
            if (input.matches("[+-]?\\d*\\.?\\d+")) {
                value = Double.parseDouble(input);
                if (value >= min && value <= max) {
                    break;
                }
            }
            System.out.println("Enter a value from " + min + " to " + max);
        }
        return value;
    }
}