package ss18_string_regex_java.bai_tap.bai2;

public class PhoneNumberTesting {
    private static PhoneNumber phoneNumber;
    private static final String[] validPhone = new String[] {"(84)-(0978489648)","(84)-(0787730997)"};
    private static final String[] invalidPhone = new String[] {"(a8)-(22222222)","(a8)-(1212121212)"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();

        for (String phone: validPhone) {
            boolean isValid = phoneNumber.validate(phone);
            System.out.println("Phone number " + phone + " has valid: " + isValid);
        }

        for (String phone: invalidPhone) {
            boolean isValid = phoneNumber.validate(phone);
            System.out.println("Phone number " + phone + " has valid: " + isValid);
        }
    }
}
