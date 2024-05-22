import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 4, 6, 8, 6, 11, 13, 75, 24, 56, 3));
        List<String> words = new ArrayList<>(List.of("apple", "pineapple", "orange", "orange", "pineapple", "banana", "orange"));
        printOddNums(nums);
        System.out.println("_____________________");
        printEvenNums(nums);
        System.out.println("_____________________");
        printUniqueWords(words);
        System.out.println("_____________________");
        printWordDuplicates(words);
    }

    public static void printOddNums(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
    public static void printEvenNums(List<Integer> nums) {
        Set<Integer> evenNums = new TreeSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        for (Integer num : evenNums) {
            System.out.println(num);
        }
    }
    public static void printUniqueWords(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }

    public static void printWordDuplicates(List<String> words) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + (entry.getValue() - 1));
        }
    }
}

