public class Main {
    public static void main(String[] args) {
        Console.greet("BMI Calculator");
        float weight = (float) Console.readNumber("Weight (lbs)", 50, 375);
        float height = (float) Console.readNumber("Height (inches)", 48, 84);

        var calculator = new BmiCalculator(weight, height);
        var report = new BmiReport(calculator);

        report.PrintBMI();
    }
}
