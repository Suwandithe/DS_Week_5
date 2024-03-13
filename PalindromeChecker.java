import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeChecker {

    // method 1 : Fill the stack with characters from inputString
    private static Deque<Character> fillStack(String inputString){
        Deque<Character> CharStack = new ArrayDeque<>();
        for (int i = 0; i< inputString.length(); i++){
            CharStack.push(inputString.charAt(i));
        }
        return CharStack;
    }

    private String buildReverse(String inputString){
        Deque<Character> charStack = fillStack(inputString);
        StringBuilder result = new StringBuilder();
        while (!charStack.isEmpty()) {
            result.append(charStack.pop());
        }
        return result.toString();
    }

    public boolean isPalindrome(String inputString) {
        return inputString.equalsIgnoreCase(buildReverse(inputString));
    }
    public static void main(String[] args) throws Exception {
        PalindromeChecker checker = new PalindromeChecker();

        // test cases
        String [] testCases = {
            "a",
            "radar",
            "Able was i ere i saw Elba",
            "Racecar",
            "hello",
            "",
            "abba",
            "abcba"
        };

        for (String testCase : testCases){
            System.out.println("Is \"" + testCase + "\" a palindrome?" + checker.isPalindrome(testCase));
        }
    }
}
