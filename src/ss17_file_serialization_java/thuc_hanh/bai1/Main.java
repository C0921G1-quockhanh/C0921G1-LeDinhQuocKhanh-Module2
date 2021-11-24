package ss17_file_serialization_java.thuc_hanh.bai1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);

            byte[] buffer = new byte[1024];
            int length = is.read(buffer);

            while (length > 0) {
                os.write(buffer);
                length = is.read(buffer);
            }
        }

        finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter source file: ");
        String sourcePath = sc.nextLine();
        System.out.println("Enter destination file: ");
        String destPath = sc.nextLine();

        File source = new File(sourcePath);
        File dest = new File(destPath);

//        try {
//            copyFileUsingJava7Files(source,dest);
//            System.out.println("Copy completed");
//        }
//        catch (IOException ioe) {
//            System.out.println("Can't copy that file");
//            System.out.println(ioe.getMessage());
//        }

        try {
            copyFileUsingStream(source,dest);
            System.out.println("Copy completed");
        }
        catch (IOException ioe) {
            System.out.println("Can't copy that file");
            System.out.println(ioe.getMessage());
        }

    }
}
