import java.util.*;

public class Main {

    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        WordsChecker wordsChecker = new WordsChecker(text);
        String textLow = text.toLowerCase();
        wordsChecker.textSet.addAll((List.of(textLow.split("\\P{IsAlphabetic}+"))));

        String word = "double";
        if (wordsChecker.hasWord(word)) {
            System.out.println("В тексте содержится слово " + word);
        } else {
            System.out.println("В тексте нет слова " + word);
        }
    }
}





