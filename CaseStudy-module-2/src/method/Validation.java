package method;

import java.util.regex.Pattern;

public class Validation {
    private static Pattern NAME_PATTERN = Pattern.compile("^[A-Za-z0-9]{3,50}$");

    public static boolean isValidateName(String name) {

        return NAME_PATTERN.matcher(name).matches();
    }

    public static Pattern PRICE_PATTERN = Pattern.compile("^[0-9]*$");

    public static boolean isValidatePrice(String price) {
        return PRICE_PATTERN.matcher(price).matches();
    }

    public static Pattern ID_PATTERN = Pattern.compile("^[0-3]*$");

    public static boolean isValidateId(String id) {
        return ID_PATTERN.matcher(id).matches();
    }
}
