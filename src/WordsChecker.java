import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordsChecker {
    protected Set<String> words = new HashSet<>();


    public WordsChecker(String text) {
        text = text.toUpperCase();
        this.words.addAll(Arrays.asList(text.split("\\P{IsAlphabetic}+")));
    }
    public boolean hasWord(String word) {
        return this.words.contains(word.toUpperCase());
    }
}
