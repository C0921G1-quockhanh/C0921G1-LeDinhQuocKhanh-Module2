package ss17_file_serialization_java.bai_tap.bai2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ProductTestingCopy {
    public static void main(String[] args) {
        String sourcePath = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\ss17_file_serialization_java\\bai_tap\\bai2\\source.txt";
        String destPath = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\ss17_file_serialization_java\\bai_tap\\bai2\\destination.txt";

        ArrayList<Product> products = new ArrayList<>();

        Product product1 = new Product(1,"Co Gai Ha Lan",30000);
        Product product2 = new Product(2,"Vinamilk chocolate",35000);
        Product product3 = new Product(3,"Yomost Strawberry",27000);

        products.add(product1);
        products.add(product2);
        products.add(product3);

        writeToFile(sourcePath,products);
        copyFile(sourcePath,destPath);
    }

    public static void writeToFile(String sourcePath,ArrayList<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(sourcePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(products);
            oos.close();
            fos.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFile(String sourcePath,String destPath) {
        try {
            FileInputStream fis = new FileInputStream(sourcePath);
            FileOutputStream fos = new FileOutputStream(destPath);

            ArrayList<Character> characters = new ArrayList<>();
            int numberOfBytes = 0;
            int readByte = fis.read();

            while (readByte != -1) {
                characters.add((char)readByte);
                numberOfBytes++;
                readByte = fis.read();
            }

            byte[] buffer = new byte[characters.size()];
            for (int i = 0; i < buffer.length; i++) {
                buffer[i] = (byte)characters.get(i).charValue();
            }

            fos.write(buffer);
            System.out.println("\nThe number of bytes is " + numberOfBytes);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
