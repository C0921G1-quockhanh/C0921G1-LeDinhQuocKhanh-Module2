package ss16_IO_text_file_java.bai_tap.bai2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileAssignment {
    public static void readFile(String sourcePath) {
        try {
            File file = new File(sourcePath);

            if (!file.exists())
                throw new FileNotFoundException();

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();

            while (line != null) {
                String[] subLine = line.split(",");
                System.out.println(subLine[2]);
                line = br.readLine();
            }

            br.close();
        }

        catch (Exception e) {
            System.err.println("File does not exist or error!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source path: ");
        String sourcePath = sc.nextLine();

        readFile(sourcePath);
    }
}
