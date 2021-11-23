package ss16_IO_text_file_java.thuc_hanh.bai2;

import java.util.List;
import java.util.Scanner;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max)
                max = numbers.get(i);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file path: ");
        String path = sc.nextLine();

        System.out.println("Enter destination path: ");
        String dest = sc.nextLine();

        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

        List<Integer> numbers = readAndWriteFile.readFile(path);

        int maxValue = findMax(numbers);

        readAndWriteFile.writeFile(dest,maxValue);
    }
}
