package ss16_IO_text_file_java.bai_tap.bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static List<Character> readFile(String sourcePath) {
        List<Character> chars = new ArrayList<>();

        try {
            File file = new File(sourcePath);

            if (!file.exists())
                throw new FileNotFoundException();

            BufferedReader br = new BufferedReader(new FileReader(file));
            int charByAscii = br.read();

            while (charByAscii != -1) {
                chars.add((char)charByAscii);
                charByAscii = br.read();
            }

            br.close();
        }

        catch (Exception e) {
            System.err.println("File does not exist or error!");
        }

        return chars;
    }

    public static void writeFile(String sourcePath, String destPath, int countChar) {
        try {
            List<Character> chars = readFile(sourcePath);
            char[] result = new char[chars.size()];

            for (int i = 0; i < result.length; i++) {
                result[i] = chars.get(i);
            }

            FileWriter writer = new FileWriter(destPath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write(result,0,result.length);
            bufferedWriter.write("\nThe number of chars in source file is " + countChar);
            bufferedWriter.close();
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
