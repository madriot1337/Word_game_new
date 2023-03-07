public class Main {
    public static void main(String[] args) throws Exception {
        Start.start();
        while(Word.secWordList.contains("*") && Motion.tries < 10) {
            Motion.takeLetter();
            Motion.checkerCorrect();
        }

    }
}
