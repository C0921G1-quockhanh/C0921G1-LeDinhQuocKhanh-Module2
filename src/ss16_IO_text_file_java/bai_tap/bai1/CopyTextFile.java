package ss16_IO_text_file_java.bai_tap.bai1;

import java.util.List;
import java.util.Scanner;

public class CopyTextFile {
    public static int getNumberOfChars(List<Character> chars) {
        int countChar = chars.size();
        return countChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source path: ");
        String sourcePath = sc.nextLine();

        System.out.println("Enter destination path: ");
        String destPath = sc.nextLine();

        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

        List<Character> chars = readAndWriteFile.readFile(sourcePath);
        int countChar = getNumberOfChars(chars);
        readAndWriteFile.writeFile(sourcePath,destPath,countChar);
    }
}
