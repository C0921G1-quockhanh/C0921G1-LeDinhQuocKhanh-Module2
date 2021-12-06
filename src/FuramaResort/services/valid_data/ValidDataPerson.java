package FuramaResort.services.valid_data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ValidDataPerson {
    Scanner sc = new Scanner(System.in);

    public String validDateOfBirth(String dateOfBirth) {
        final String DATE_OF_BIRTH_REGEX = "^(\\d){2}/(\\d){2}/(\\d){4}$";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate now = LocalDate.now();

        while (true) {
            boolean isRetry = false;

            if (!dateOfBirth.matches(DATE_OF_BIRTH_REGEX)) {
                isRetry = true;
            } else {
                LocalDate birthDayTime = LocalDate.parse(dateOfBirth,formatter);
                LocalDate eighteenYears = birthDayTime.plusYears(18);
                LocalDate oneHundredYears = birthDayTime.plusYears(100);

                if ((eighteenYears.isAfter(now) || oneHundredYears.isBefore(now))) {
                    isRetry = true;
                }
            }

            if (isRetry) {
                System.out.println("Please check the date of birth! Enter again: ");
                dateOfBirth = sc.nextLine();
            } else
                break;
        }

        return dateOfBirth;
    }

    public String validPhoneNumber(String phoneNumber) {
        final String PHONE_REGEX = "^84-0(\\d){9}$";

        while (!phoneNumber.matches(PHONE_REGEX)) {
            System.out.println("Please check the format of phone number! Enter again: ");
            phoneNumber = sc.nextLine();
        }

        return phoneNumber;
    }

    public String validEmail(String email) {
        final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

        while (!email.matches(EMAIL_REGEX)) {
            System.out.println("Please check the format of email! Enter again: ");
            email = sc.nextLine();
        }

        return email;
    }

    public String validQualification(String qualification) {
        boolean check = qualification.equals("Intermediate") || qualification.equals("College") || qualification.equals("University") || qualification.equals("Postgraduate");

        while (!check) {
            System.out.println("Please check the qualification! Enter again: ");
            qualification = sc.nextLine();
            check = qualification.equals("Intermediate") || qualification.equals("College") || qualification.equals("University") || qualification.equals("Postgraduate");
        }

        return qualification;
    }

    public String validWorkingPosition(String workingPosition) {
        boolean check = workingPosition.equals("Receptionist") || workingPosition.equals("Service Staff") || workingPosition.equals("Specialist") ||
                workingPosition.equals("Advisor") || workingPosition.equals("Manager") || workingPosition.equals("President");

        while (!check) {
            System.out.println("Please check the working position! Enter again: ");
            workingPosition = sc.nextLine();
            check = workingPosition.equals("Receptionist") || workingPosition.equals("Service Staff") || workingPosition.equals("Specialist") ||
                    workingPosition.equals("Advisor") || workingPosition.equals("Manager") || workingPosition.equals("President");
        }

        return workingPosition;
    }

    public String validTypeOfCustomer(String typeOfCustomer) {
        boolean check = typeOfCustomer.equals("Diamond") || typeOfCustomer.equals("Platinum") || typeOfCustomer.equals("Gold") ||
                typeOfCustomer.equals("Silver") || typeOfCustomer.equals("Member");

        while (!check) {
            System.out.println("Please check the type of customer! Enter again: ");
            typeOfCustomer = sc.nextLine();
            check = typeOfCustomer.equals("Diamond") || typeOfCustomer.equals("Platinum") || typeOfCustomer.equals("Gold") ||
                    typeOfCustomer.equals("Silver") || typeOfCustomer.equals("Member");
        }

        return typeOfCustomer;
    }
}
