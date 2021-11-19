package ss11_stack_queue_java.bai_tap.bai4;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();

        String[] words = inputString.split("\\s");

        int defaultValue = 1;

        Map<String,Integer> countWords = new TreeMap<>();

        for (String word: words) {
            String wordLowerCase = word.toLowerCase();

            if (countWords.containsKey(wordLowerCase)) {
                int value = countWords.get(wordLowerCase);
                countWords.replace(wordLowerCase,++value);
            } else {
                countWords.put(wordLowerCase,defaultValue);
            }
        }

        for (Map.Entry<String,Integer> countWord: countWords.entrySet()) {
            System.out.println(countWord);
        }
    }
}
