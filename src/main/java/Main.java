public class Main {
    public static void main(String[] args) {
        Console.greet("BMI Calculator");
        float height = (float) Console.readNumber("Height (inches)", 48, 84);
        float weight = (float) Console.readNumber("Weight (lbs)", 50, 375);

        var calculator = new BmiCalculator(weight, height);
        var report = new BmiReport(calculator);

        report.PrintBMI();
    }
}
