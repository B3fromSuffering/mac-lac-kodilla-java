import java.util.*;

public class RpsRunnerV2 {

    public static void main(String[] args) {

        boolean newGame = true;
        boolean end = false;
        boolean doNotShowStats = false;
        boolean pcMove = true;

        Computer computer = new Computer();
        StatisticsV2 statistics = new StatisticsV2();

        while (!end) {

            //nowa gra
            if (newGame) {

                pcMove = true;
                newGame = false;
                doNotShowStats = true;

                System.out.println("PAPIER KAMIEN NOZYCE");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Podaj swoje imię");
                String name = scanner.nextLine();

                int rounds = 0;
                boolean itIsInt = false;
                while (!itIsInt) {

                    try {
                        System.out.println("Do ilu gramy zwycięstw?");
                        Scanner scanInt = new Scanner(System.in);
                        rounds = scanInt.nextInt();
                        itIsInt = true;

                    } catch (Exception e) {
                        System.out.println("Musisz podać liczbę naturalną!");
                    }
                }

                // inicjalizacja statystyk + instrukcja gry
                statistics.initializeNewStats(name, rounds);
                Instructions.printInstructions();
            }

            // nowa runda
            // ruch gracza
            Scanner buttons = new Scanner(System.in);
            char button = 0;
            char button1 = 0;

            while (!(button == '1' || button == '2' || button == '3' || button == 'n' && button1 == 'n' || button == 'x' && button1 == 'x' )) {
                System.out.println("Wykonaj ruch!");
                button = buttons.next().charAt(0);
                if (button == 'x') {
                    System.out.println("Czy napewno chcesz zakończyć grę? Wciśnij 'x'.");
                    button1 = buttons.next().charAt(0);
                    if (button1 == 'x') {
                        System.out.println("Zakończyłeś grę! Do zobaczenia następnym razem!");
                        end = true;
                        pcMove = false;
                        doNotShowStats = true;
                    }
                }
                if (button == 'n') {
                    System.out.println("Czy napewno chcesz zakończyć aktualną grę? Wciśnij 'n'.");
                    button1 = buttons.next().charAt(0);
                    if (button1 == 'n') {
                        System.out.println("Gra rozpocznie się od początku...");
                        pcMove = false;
                        newGame = true;
                        doNotShowStats = true;
                    }
                }
            }

            //kontynuacja gry
            if (pcMove) {
                Move movePlayer = new Move(button);
                System.out.println("Wykonałeś ruch: " + movePlayer);

                /*List<Character> givenList = Arrays.asList('1', '2', '3');
                Random rand = new Random();
                char random = givenList.get(rand.nextInt(givenList.size()));
                Move movePC = new Move(random);*/

                // ruch komputera
                Move movePC = computer.getComputerMove();
                System.out.println("Przeciwnik wykonał ruch: " + movePC);


                // rozstrzygnięcie partii
                if (movePlayer.equals(movePC)) {
                    System.out.println("REMIS!");
                    statistics.numberOfRemises += 1;
                } else {
                    if (movePlayer.getMoveID() == '1' && movePC.getMoveID() == '2') {
                        statistics.numberOfLoses += 1;
                        System.out.println("PRZEGRALES!");
                    }
                    if (movePlayer.getMoveID() == '2' && movePC.getMoveID() == '3') {
                        statistics.numberOfLoses += 1;
                        System.out.println("PRZEGRALES!");
                    }
                    if (movePlayer.getMoveID() == '3' && movePC.getMoveID() == '1') {
                        statistics.numberOfLoses += 1;
                        System.out.println("PRZEGRALES!");
                    }
                    if (movePlayer.getMoveID() == '1' && movePC.getMoveID() == '3') {
                        statistics.numberOfWins += 1;
                        System.out.println("WYGRALES!");
                    }
                    if (movePlayer.getMoveID() == '2' && movePC.getMoveID() == '1') {
                        statistics.numberOfWins += 1;
                        System.out.println("WYGRALES!");
                    }
                    if (movePlayer.getMoveID() == '3' && movePC.getMoveID() == '2') {
                        statistics.numberOfWins += 1;
                        System.out.println("WYGRALES!");
                    }
                }

                // założenia gry - liczba zwycięstw
                if (statistics.numberOfWins == statistics.getNumberOfRounds() || statistics.numberOfLoses == statistics.getNumberOfRounds()) {
                    end = true;
                    doNotShowStats = false;
                }
            }


            if (!doNotShowStats) {
                // zwycięstwo i statystyki
                System.out.println("KONIEC GRY!");
                if (statistics.numberOfWins > statistics.numberOfLoses) {
                    System.out.println("GRATULACJE, WYGRALES!");
                } else {
                    System.out.println("PORAŻKA!");
                }
                statistics.printStatistics();

                //ponowne rozegranie
                Scanner playAgain = new Scanner(System.in);
                char buttonPlayAgain = '0';
                System.out.println("Czy chesz zagrać jeszcze raz?");

                while (!(buttonPlayAgain == 'n' || buttonPlayAgain == 'x')) {
                    System.out.println("Tak - wciśnij 'n', Nie - wciśnij 'x'");
                    buttonPlayAgain = playAgain.next().charAt(0);

                    if (buttonPlayAgain == 'n') {
                        newGame = true;
                        end = false;
                    }
                }
            }
        }
    }
}


