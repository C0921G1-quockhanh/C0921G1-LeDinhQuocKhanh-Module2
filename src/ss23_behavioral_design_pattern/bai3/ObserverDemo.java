package ss23_behavioral_design_pattern.bai3;

import java.util.Scanner;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        HexObserver hexObserver = new HexObserver(subject);
        OctObserver octObserver = new OctObserver(subject);
        BinObserver binObserver = new BinObserver(subject);

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int value = sc.nextInt();
            subject.setState(value);
        }
    }
}
