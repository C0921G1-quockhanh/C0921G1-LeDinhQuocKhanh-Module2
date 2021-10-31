package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int hundreds = number / 100, dozens = (number - hundreds*100) / 10, units = number % 10;
        String hundredStr = "", dozenStr = "", unitStr = "";

        switch (units) {
            case 1:
                unitStr = "One";
                break;
            case 2:
                unitStr = "Two";
                break;
            case 3:
                unitStr = "Three";
                break;
            case 4:
                unitStr = "Four";
                break;
            case 5:
                unitStr = "Five";
                break;
            case 6:
                unitStr = "Six";
                break;
            case 7:
                unitStr = "Seven";
                break;
            case 8:
                unitStr = "Eight";
                break;
            case 9:
                unitStr = "Nine";
                break;
        }

        switch (dozens) {
            case 1:
                int temp = number % 100;
                switch (temp) {
                    case 10:
                        dozenStr = "Ten";
                        break;
                    case 11:
                        dozenStr = "Eleven";
                        break;
                    case 12:
                        dozenStr = "Twelve";
                        break;
                    case 13:
                        dozenStr = "Thirteen";
                        break;
                    case 14:
                        dozenStr = "Fourteen";
                        break;
                    case 15:
                        dozenStr = "Fifteen";
                        break;
                    case 16:
                    case 17:
                    case 19:
                        dozenStr = unitStr + "teen";
                        break;
                    case 18:
                        dozenStr = "Eighteen";
                        break;
                }
                break;
            case 2:
                dozenStr = "Twenty";
                break;
            case 3:
                dozenStr = "Thirty";
                break;
            case 4:
                dozenStr = "Forty";
                break;
            case 5:
                dozenStr = "Fifty";
                break;
            case 6:
                dozenStr = "Sixty";
                break;
            case 7:
                dozenStr = "Seventy";
                break;
            case 8:
                dozenStr = "Eighty";
                break;
            case 9:
                dozenStr = "Ninety";
                break;
        }

        switch (hundreds) {
            case 1:
                hundredStr = "A hundred and";
                break;
            case 2:
                hundredStr = "Two hundreds and";
                break;
            case 3:
                hundredStr = "Three hundreds and";
                break;
            case 4:
                hundredStr = "Four hundreds and";
                break;
            case 5:
                hundredStr = "Five hundreds and";
                break;
            case 6:
                hundredStr = "Six hundreds and";
                break;
            case 7:
                hundredStr = "Seven hundreds and";
                break;
            case 8:
                hundredStr = "Eight hundreds and";
                break;
            case 9:
                hundredStr = "Nine hundreds and";
                break;
        }

        if (number > 0) {
            if (dozens == 1) {
                System.out.println(hundredStr + " " + dozenStr);
            } else {
                System.out.println(hundredStr + " " + dozenStr + " " + unitStr);
            }
        } else {
            System.out.println("Please check that number!");
        }
    }
}


