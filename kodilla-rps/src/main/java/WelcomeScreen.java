// ta klasa nie jest używana, została stworzona z myślą o podzieleniu kodu gry na segmenty

import java.util.Scanner;

public class WelcomeScreen {

    public static void welcome(){

        System.out.println("PAPIER KAMIEN NOZYCE");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imię");
        String name = scanner.nextLine();
        System.out.println("Do ilu gramy zwycięstw?");
        int rounds = scanner.nextInt();
    }
}
