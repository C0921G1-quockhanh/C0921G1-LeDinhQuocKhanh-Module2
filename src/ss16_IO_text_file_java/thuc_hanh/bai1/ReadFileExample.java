package ss16_IO_text_file_java.thuc_hanh.bai1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public static void readFileText(String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists())
                throw new FileNotFoundException();

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            int sum = 0;

            while (line != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
                line = br.readLine();
            }

            br.close();
            System.out.println("Sum = " + sum);
        }

        catch (Exception e) {
            System.err.println("File does not exist or error!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file path: ");
        String filePath = sc.nextLine();

        readFileText(filePath);
    }
}
