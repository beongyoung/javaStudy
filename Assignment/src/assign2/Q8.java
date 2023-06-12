package assign2;
/**
 * The program Q8
 * This program > 영어 한글 번역기
 * 
 * @author Beongyoung Park
 * @version 1.0
 * @since 2023-04-15
 */

import java.util.HashMap;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        // Define the translations
        HashMap<String, String> translations = new HashMap<>();
        translations.put("hello", "안녕");
        translations.put("goodbye", "잘가");
        translations.put("good", "좋은");
        translations.put("morning", "아침");
        translations.put("night", "밤");
        translations.put("apple", "사과");
        translations.put("is", "는");
        translations.put("red", "빨간색");
        translations.put("rabbit", "토끼");
        translations.put("blue", "우울한");
        
        // Get the user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String input = scanner.nextLine();
        
        // Split the sentence into words
        String[] words = input.split(" ");
        
        // Translate each word
        String output = "";
        for (String word : words) {
            if (translations.containsKey(word)) {
                output += translations.get(word) + " ";
            } else {
                output += "모름";
            }
        }
        
        // Print the translated sentence
        System.out.print("Output: ");
        System.out.println(output);
    }
}