// string to arr  -> a.toCharArray()
import java.util.*;
public class _01_Basic{
    public static void main(String[] args) {
        String word = "Ocygen";
        char[] wordArray = word.toCharArray();
        wordArray[1] = 'x';
        word = new String(wordArray);
        System.out.println(word);
    }
}