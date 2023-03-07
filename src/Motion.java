import java.util.ArrayList;
import java.util.Scanner;

public class Motion {

    static Scanner sc = new Scanner(System.in);
    static String letter;
    static ArrayList<String> picture = new ArrayList<>();
    static int tries = 0;


    public static void takeLetter() {
        System.out.println("\nВведите букву: ");
        letter = sc.nextLine();
    }

    public static void checkerCorrect(){

        picture.add("-------");
        picture.add("_______");
        picture.add("|");
        picture.add("O");
        picture.add("/");
        picture.add("\\");




        if(Word.selectedWord.contains(letter)){
            System.out.println("Найдена верная буква: " + letter);
            for (int i = 0; i < Word.wordList.size(); i++){
                int index;
                if (Word.wordList.get(i).equals(letter)) {
                    index = i;
                    Word.secWordList.set(index, letter);
                }

                System.out.print(Word.secWordList.get(i));
            }
            System.out.println();
            if (!(Word.secWordList.contains("*"))){
                System.out.println("\nТЫ ВЫИГРАЛ");
            }

        } else {
            tries++;
            switch (tries){
                case 1 :
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println(picture.get(0) + picture.get(0));
                    for (int i = 0; i < Word.wordList.size(); i++){
                        System.out.print(Word.secWordList.get(i));
                    }
                    System.out.println("\nНеудачные попытки: " + tries);
                    break;
                case 2 :
                    System.out.println(picture.get(2));
                    System.out.println(picture.get(2));
                    System.out.println(picture.get(2));
                    System.out.println(picture.get(2));
                    System.out.println(picture.get(2));
                    System.out.println(picture.get(0) + picture.get(0));
                    for (int i = 0; i < Word.wordList.size(); i++){
                        System.out.print(Word.secWordList.get(i));
                    }
                    System.out.println("\nНеудачные попытки: " + tries);
                    break;
                case 3 :
                    System.out.println(" " + picture.get(1));
                    System.out.println(picture.get(2));
                    System.out.println(picture.get(2));
                    System.out.println(picture.get(2));
                    System.out.println(picture.get(2));
                    System.out.println(picture.get(2));
                    System.out.println(picture.get(0) + picture.get(0));
                    for (int i = 0; i < Word.wordList.size(); i++){
                        System.out.print(Word.secWordList.get(i));
                    }
                    System.out.println("\nНеудачные попытки: " + tries);
                    break;
                case 4 :
                    System.out.println(" " + picture.get(1));
                    System.out.println(picture.get(2) + "      " +  picture.get(2));
                    System.out.println(picture.get(2));
                    System.out.println(picture.get(2));
                    System.out.println(picture.get(2));
                    System.out.println(picture.get(2));
                    System.out.println(picture.get(0) + picture.get(0));
                    for (int i = 0; i < Word.wordList.size(); i++){
                        System.out.print(Word.secWordList.get(i));
                    }
                    System.out.println("\nНеудачные попытки: " + tries);
                    break;
                case 5 :
                    System.out.println(" " + picture.get(1));
                    System.out.println(picture.get(2) + "      " + picture.get(2));
                    System.out.println(picture.get(2) + "      " + picture.get(3));
                    System.out.println(picture.get(2));
                    System.out.println(picture.get(2));
                    System.out.println(picture.get(2));
                    System.out.println(picture.get(0) + picture.get(0));
                    for (int i = 0; i < Word.wordList.size(); i++){
                        System.out.print(Word.secWordList.get(i));
                    }
                    System.out.println("\nНеудачные попытки: " + tries);
                    break;
                case 6 :
                    System.out.println(" " + picture.get(1));
                    System.out.println(picture.get(2) + "      " + picture.get(2));
                    System.out.println(picture.get(2) + "      " + picture.get(3));
                    System.out.println(picture.get(2) + "      " + picture.get(2));
                    System.out.println(picture.get(2));
                    System.out.println(picture.get(2));
                    System.out.println(picture.get(0) + picture.get(0));
                    for (int i = 0; i < Word.wordList.size(); i++){
                        System.out.print(Word.secWordList.get(i));
                    }
                    System.out.println("\nНеудачные попытки: " + tries);
                    break;
                case 7 :
                    System.out.println(" " + picture.get(1));
                    System.out.println(picture.get(2) + "      " + picture.get(2));
                    System.out.println(picture.get(2) + "      " + picture.get(3));
                    System.out.println(picture.get(2) + "     " + picture.get(4) + picture.get(2));
                    System.out.println(picture.get(2));
                    System.out.println(picture.get(2));
                    System.out.println(picture.get(0) + picture.get(0));
                    for (int i = 0; i < Word.wordList.size(); i++){
                        System.out.print(Word.secWordList.get(i));
                    }
                    System.out.println("\nНеудачные попытки: " + tries);
                    break;
                case 8 :
                    System.out.println(" " + picture.get(1));
                    System.out.println(picture.get(2) + "      " + picture.get(2));
                    System.out.println(picture.get(2) + "      " + picture.get(3));
                    System.out.println(picture.get(2) + "     " + picture.get(4) +  picture.get(2) + picture.get(5));
                    System.out.println(picture.get(2));
                    System.out.println(picture.get(2));
                    System.out.println(picture.get(0) + picture.get(0));
                    for (int i = 0; i < Word.wordList.size(); i++){
                        System.out.print(Word.secWordList.get(i));
                    }
                    System.out.println("\nНеудачные попытки: " + tries);
                    break;
                case 9 :
                    System.out.println(" " + picture.get(1));
                    System.out.println(picture.get(2) + "      " + picture.get(2));
                    System.out.println(picture.get(2) + "      " + picture.get(3));
                    System.out.println(picture.get(2) + "     " + picture.get(4)+ picture.get(2) + picture.get(5));
                    System.out.println(picture.get(2)  + "     " + picture.get(4));
                    System.out.println(picture.get(2));
                    System.out.println(picture.get(0) + picture.get(0));
                    for (int i = 0; i < Word.wordList.size(); i++){
                        System.out.print(Word.secWordList.get(i));
                    }
                    System.out.println("\nНеудачные попытки: " + tries);
                    break;
                case 10 :
                    System.out.println(" " + picture.get(1));
                    System.out.println(picture.get(2) + "      " + picture.get(2));
                    System.out.println(picture.get(2) + "      " + picture.get(3));
                    System.out.println(picture.get(2) + "     " + picture.get(4)  + picture.get(2) + picture.get(5));
                    System.out.println(picture.get(2)  + "     " + picture.get(4) + " " + picture.get(5));
                    System.out.println(picture.get(2));
                    System.out.println(picture.get(0) + picture.get(0));
                    System.out.println("ТЫ ПРОИГРАЛ     СЛОВО: " + Word.selectedWord);
                    break;

            }

        }
    }
}






