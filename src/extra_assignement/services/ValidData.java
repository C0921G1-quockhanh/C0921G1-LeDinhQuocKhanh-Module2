package extra_assignement.services;

import java.util.Scanner;

public class ValidData {
    Scanner sc = new Scanner(System.in);

    public int validYearOfBirth(int yearOfBirth) {
        while (yearOfBirth < 1900 || yearOfBirth > 2021) {
            System.out.println("Please check the year of birth! Enter again: ");
            yearOfBirth = sc.nextInt();
        }

        return yearOfBirth;
    }

    public String validPhoneNumber(String phone) {
        while (phone.length() < 10) {
            System.out.println("Please check the phone number! Enter again: ");
            phone = sc.nextLine();
        }

        return phone;
    }

    public String validEmail(String email) {
        final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

        while (!email.matches(EMAIL_REGEX)) {
            System.out.println("Please check the format of the email! Enter again: ");
            email = sc.nextLine();
        }

        return email;
    }

    public int validYearOfExperience(int yearOfExperience) {
        while (yearOfExperience < 0 || yearOfExperience > 100) {
            System.out.println("Please check the year of experience! Enter again: ");
            yearOfExperience = sc.nextInt();
        }

        return yearOfExperience;
    }

    public String validRankOfGraduation(String rankOfGraduation) {
        while (!rankOfGraduation.equals("Excellence") && !rankOfGraduation.equals("Good") && !rankOfGraduation.equals("Fair") && !rankOfGraduation.equals("Poor")) {
            System.out.println("Please check the rank of graduation! Enter again: ");
            rankOfGraduation = sc.nextLine();
        }

        return rankOfGraduation;
    }
}
