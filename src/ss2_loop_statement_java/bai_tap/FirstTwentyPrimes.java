package ss2_loop_statement_java.bai_tap;

public class FirstTwentyPrimes {
    public static void main(String[] args) {
        int numbers = 20;
        int count = 0;
        int N = 2;

        while (count < numbers) {
            boolean checkPrime = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    checkPrime = false;
                    break;
                }
            }
            if (checkPrime) {
                System.out.print(N + " ");
                count += 1;
            }
            N += 1;
        }
    }
}
