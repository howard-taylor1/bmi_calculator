public class BmiCalculator {
    short IMPERIAL_CONVERSION_FACTOR = 703;
    private final float weight;
    private final float height;


    public float getWeight() {
        return weight;
    }

    public float getHeight() {
        return height;
    }

    public BmiCalculator(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    public String getBmi() {
        float BMI = IMPERIAL_CONVERSION_FACTOR * weight / (height * height);
        return String.format("%.1f", BMI);
    }

    public String calculateLowWeight(){
        float LOW_BMI = 18.5F;
        float lowWeight = LOW_BMI * (height * height) / IMPERIAL_CONVERSION_FACTOR;
        return String.format("%.0f", lowWeight);
    }

    public String calculateHighWeight(){
        float HIGH_BMI = 24.9F;
        float highWeight = HIGH_BMI * (height * height) / IMPERIAL_CONVERSION_FACTOR;
        return String.format("%.0f", highWeight);
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

