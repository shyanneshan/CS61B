import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Shyanne Shan
 * @created 1/28/22/2022 - 12:42 PM
 */
public class Palindrome {
    public Deque<Character> wordToDeque(String word){
        Deque<Character> result = new ArrayDeque<>();
        // I added the if below to pass the test in TestPalindrome.java:27
        if (word == null){
            return result = null;
        }
        char[] words = word.toCharArray();
        for (char c:words){
            result.addLast(c);

        }
        return result;
    }

    /** using deque **/
    public boolean isPalindromeApplyDeque(Deque<Character> word){
        if (word == null){
            return false;
        }else {
            return word.size() == 0 || word.size() == 1 || applyDequeHelper(word);
        }

    }

    public boolean applyDequeHelper(Deque<Character> word){
        for (int index = 0; index <= word.size() / 2; index += 1){
            if (!word.getFirst().equals(word.getLast())){
                return false;
            } else {
                word.removeFirst();
                word.removeLast();
            }
        }
        return true;
    }

    /** my code not using data structure deque**/
    public boolean isPalindrome(String word){
        if (word == null){
            return false;
        }else {
            return word.length() == 0 || word.length() == 1 || isPalindromeHelper(word);
        }
    }

    public boolean isPalindromeHelper(String word){
        int cur = word.length() - 1;
        for (int index = 0; index <= word.length()/2; index += 1){
            if (word.charAt(index) != word.charAt(cur)){
                return false;
            }
            cur -= 1;
        }
        return true;
    }

    public boolean isPalindrome(String word, CharacterComparator cc){
        if (word == null){
            return false;
        }else {
            return word.length() == 0 || word.length() == 1 || isPalinderomeHelper(word,cc);
        }
    }

    public boolean isPalinderomeHelper(String word, CharacterComparator cc){
        int cur = word.length() - 1;
        for (int index = 0; index < word.length()/2; index += 1){
            char x = word.charAt(index);
            char y = word.charAt(cur);
            if (!cc.equalChars(x, y)){
                return false;
            }
            cur -= 1;
        }
        return true;
    }
}
