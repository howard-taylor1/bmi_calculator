public final class InputValidator {
    public static boolean isValidNumber(String input, double min, double max) {
        if (!input.matches("-?\\d+(\\.\\d+)?"))
            return false;
        double value = Double.parseDouble(input);
        return value >= min && value <= max;
    }
}
