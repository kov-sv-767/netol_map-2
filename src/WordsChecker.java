import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
private String text;

    public WordsChecker(String text){
        this.text = text;
    }
    public boolean hasWord (String word){
        String textLow = text.toLowerCase();
        Set<String> textSet = new HashSet<>(List.of(textLow.split("\\P{IsAlphabetic}+")));
        if (textSet.contains(word)) {
            System.out.println("Слово" + word + " есть в тексте");
        } else {
            System.out.println("Cлово " + word + " не встречается в тексте");
        }
        return true;
    }



}
