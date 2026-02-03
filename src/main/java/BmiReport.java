public class BmiReport {
    private final BmiCalculator calculator;

    public BmiReport(BmiCalculator calculator) {
        this.calculator = calculator;
    }

    public void PrintBMI() {
        String bmi = calculator.calculateBMI();
        System.out.println("BMI = " + bmi);
        System.out.println();
        System.out.println("BMI Categories for Adults");
        System.out.println("Underweight: Below 18.5");
        System.out.println("Healthy Weight: 18.5 - 24.9");
        System.out.println("Overweight: 25.0-29.9");
        System.out.println("Obese: 30.0 or higher");
        System.out.println();
        System.out.println("Ideal waist size for a woman of that height is " + calculator.calculateWaistWomen() + "\" or below.");
        System.out.println("Ideal waist size for a man of that height is " + calculator.calculateWaistMen() + "\" or below.");
        System.out.println();
        System.out.println("BMI is a screening tool and does not directly\n" +
                "measure body fat or account for muscle mass.");
        System.out.println();
        System.out.println("Ideal waist size is based on height x .52\n" +
                "for men and height x .54 for women");
    }
}
