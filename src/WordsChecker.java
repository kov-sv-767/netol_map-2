import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    private String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    Set<String> textSet = new HashSet<>();

    public boolean hasWord(String word) {
        return textSet.contains(word);
    }

}
