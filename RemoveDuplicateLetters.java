import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        String resultString = removeDuplicates(inputString);
        System.out.println("String after removing duplicates: " + resultString);
    }

    public static String removeDuplicates(String inputString) {
        char[] chars = inputString.toCharArray();
        Set<Character> charSet = new LinkedHashSet<>();
        for (char c : chars) {
            charSet.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (Character character : charSet) {
            result.append(character);
        }
        return result.toString();
    }
}
