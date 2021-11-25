package ss18_string_regex_java.bai_tap.bai1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String CLASS_REGEX = "^[ACP][\\d]{4}[G-I[K-M]]$";

    public ClassName() {
        pattern = Pattern.compile(CLASS_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
