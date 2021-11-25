package ss18_string_regex_java.bai_tap.bai1;

public class ClassNameTest {
    private static ClassName className;
    private static final String[] validName = new String[] {"C0318G","C0921G","C1021G"};
    private static final String[] invalidName = new String[] {"M0318G","P0323A","c0921G"};

    public static void main(String[] args) {
        className = new ClassName();

        for (String name: validName) {
            boolean isValid = className.validate(name);
            System.out.println("Name " + name + " has valid: " + isValid);
        }

        for (String name: invalidName) {
            boolean isValid = className.validate(name);
            System.out.println("Name " + name + " has valid: " + isValid);
        }
    }
}
