import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Word  {
    public static String file = "C:/444/words.txt";
    static int count = 80;
    static List<String> wordsList = new ArrayList<>();
    public static String selectedWord;
    public static String secretWord = "";
    static ArrayList<String> wordList = new ArrayList<>();
    static ArrayList<String> secWordList = new ArrayList<>();

    public static void getWord() throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(new File(file)));
        String read;
        while ((read = br.readLine()) != null) {
            wordsList.add(read);
        }

       selectedWord = wordsList.get((int) (Math.random() * wordsList.size())).toLowerCase();

        int wordSize = selectedWord.length();

       String[] array = selectedWord.split("");
        Collections.addAll(wordList, array);

        for (int i = 0; i < wordSize; i++) {
            secretWord += "*";
        }
        String[] array1 = secretWord.split("");
        Collections.addAll(secWordList, array1);
        System.out.println("\n");
        System.out.println("Загадано слово:");
        System.out.println(secretWord);
    }
}
