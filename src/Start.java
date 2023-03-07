import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Start {
    public static String menu = "Приветствую в игре Висилица. Напиши GO, чтобы начать, или EXIT для выхода из игры.";
    static Scanner sc = new Scanner(System.in);
    public static void start() throws Exception {
        System.out.println(menu);
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("EXIT")){
            System.exit(0);
        } else if (answer.equalsIgnoreCase("GO")){
            Word.getWord();
        } else {
            while (!(answer.equalsIgnoreCase("EXIT") || answer.equalsIgnoreCase("GO"))){
                System.out.println("Введите одно из значений GO/EXIT");
                answer = sc.nextLine();
            }
            if (answer.equalsIgnoreCase("EXIT")){
                System.exit(0);
            } else if (answer.equalsIgnoreCase("GO")) {
                Word.getWord();
            }
        }
    }
    public static void restart() {

    }

}
