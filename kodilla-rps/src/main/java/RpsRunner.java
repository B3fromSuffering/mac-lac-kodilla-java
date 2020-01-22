import java.io.IOException;
import java.util.*;

public class RpsRunner{

    public static void main(String[] args) {

        // możliwe ruchy
/*        Map<Character, String> moves = new HashMap<>();
        moves.put('1', "Kamień");
        moves.put('2', "Papier");
        moves.put('3', "Nożyce");*/

        //pętla całego programu
        boolean theEnd = false;
        while (!theEnd) {

            // powitanie
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
            Statistics statistics = new Statistics(name, rounds);
            Instructions.printInstructions();

            // nowa gra - pętla pojedyńczej gry
            boolean doNotShowStats = false;
            boolean end = false;
            while (!end) {

                //ruch gracza
                char button = '0';
                while (!(button == '1' || button == '2' || button == '3' || button == 'n' || button == 'x')) {
                    System.out.println("Wykonaj ruch!");
                    button = scanner.next().charAt(0);
                    if (button == 'x') {
                        System.out.println("Czy napewno chcesz zakończyć grę? Wciśnij 'x'.");
                        button = scanner.next().charAt(0);
                        if (button == 'x') {
                            System.out.println("Zakończyłeś grę! Do zobaczenia następnym razem!");
                            end = true;
                            theEnd = true;
                            doNotShowStats = true;
                        }
                    }
                    if (button == 'n') {
                        System.out.println("Czy napewno chcesz zakończyć aktualną grę? Wciśnij 'n'.");
                        button = scanner.next().charAt(0);
                        if (button == 'n') {
                            System.out.println("Gra rozpocznie się od początku...");
                            end = true;
                            doNotShowStats = true;
                        }
                    }
                }

                //kontynuacja gry
                if (!end) {

                    Move movePlayer = new Move(button);
                    System.out.println("Wykonałeś ruch: " + PossibleMoves.moves().get(button));

                    // ruch komputera
                    List<Character> givenList = Arrays.asList('1','2','3');
                    Random rand = new Random();
                    char random = givenList.get(rand.nextInt(givenList.size()));
                    Move movePC = new Move(random);
                    System.out.println("Przeciwnik wykonał ruch: " + PossibleMoves.moves().get(random));

                    // rozstrzygnięcie partii
                    if (movePlayer.equals(movePC)) {
                        System.out.println("REMIS!");
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

                    // założenia pętli
                    if (statistics.numberOfWins == statistics.getNumberOfRounds() || statistics.numberOfLoses == statistics.getNumberOfRounds()) {
                        end = true;
                    }
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
            }
        }
    }
}
