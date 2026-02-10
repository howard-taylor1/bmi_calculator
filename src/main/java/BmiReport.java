public class BmiReport {
    private final BmiCalculator calculator;

    public BmiReport(BmiCalculator calculator) {
        this.calculator = calculator;
    }

    public void PrintBMI() {
        String bmi = calculator.getBmi();
        System.out.println();
        System.out.println("*********************** YOUR INFORMATION ****************************");
        System.out.println("Height: " + calculator.getHeight() + " inches");
        System.out.println("Weight: " + calculator.getWeight() + " pounds");
        System.out.println("Body Mass Index: " + calculator.getBmi());
        System.out.println("Based on your height, your weight should be between " +
                calculator.calculateLowWeight() + " and " + calculator.calculateHighWeight() + " pounds.");
        System.out.println("The ideal waist size for a woman of that height is " + calculator.calculateWaistWomen());
        System.out.println("The ideal waist size for a man of that height is " + calculator.calculateWaistMen());
        System.out.println("*********************************************************************");
        System.out.println();
        System.out.println("BMI Categories for Adults");
        System.out.println("Underweight: Below 18.5");
        System.out.println("Healthy Weight: 18.5 - 24.9");
        System.out.println("Overweight: 25.0-29.9");
        System.out.println("Obese: 30.0 or higher");
        System.out.println();
        System.out.println("BMI is a screening tool and does not directly\n" +
                "measure body fat or account for muscle mass.");
    }
}
