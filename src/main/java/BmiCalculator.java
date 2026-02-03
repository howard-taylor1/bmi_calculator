public class BmiCalculator {
    private final float weight;
    private final float height;


    public BmiCalculator(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    public String calculateBMI() {
        short IMPERIAL_CONVERSION_FACTOR = 703;
        float BMI = IMPERIAL_CONVERSION_FACTOR * weight / (height * height);
        return String.format("%.1f", BMI);
    }

    public String calculateWaistMen(){
        float MAN_WAIST_HEIGHT_MULTIPLIER = .52F;
        float waistHeightRatio = height * MAN_WAIST_HEIGHT_MULTIPLIER;
        return String.format("%.1f", waistHeightRatio);
    }

    public String calculateWaistWomen(){
        float WOMAN_WAIST_HEIGHT_MULTIPLIER = .54F;
        float waistHeightRatio = height * WOMAN_WAIST_HEIGHT_MULTIPLIER;
        return String.format("%.1f", waistHeightRatio);
    }
}

