import java.util.ArrayList;
import java.util.List;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println(checkForPalindromeInSentence());
    }

    private static List<String> checkForPalindrome(){
        String[] words = {"madam", "racecar", "level", "hello", "world", "noon"};
        List<String> foundWords = new ArrayList<>();
        for (int i = 0; i < words.length; i++){
            if (words[i].equals(new StringBuilder(words[i]).reverse().toString())){
                System.out.println("found word " + words[i] + " as palindrome");
                foundWords.add(words[i]);
            }
        }
        return foundWords;
    }


    //check for palindromeInSentence
    private static List<String> checkForPalindromeInSentence(){
        String sentence = "Madam Arora teaches malayalam and noon is my favorite time.";
        List<String> foundWords = new ArrayList<>();
        for (String word : sentence.split("\\W+")){
            if (word.equalsIgnoreCase(new StringBuilder(word).reverse().toString())){
                System.out.println(word);
                foundWords.add(word);
            }
        }
        return foundWords.toArray().length > 0 ? foundWords : new ArrayList<>();
    }
}
