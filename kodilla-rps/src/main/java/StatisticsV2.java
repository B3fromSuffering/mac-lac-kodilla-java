public class StatisticsV2 {

    private String name;
    private int numberOfRounds;
    int numberOfWins = 0;
    int numberOfLoses = 0;
    int numberOfRemises = 0;

    public void initializeNewStats(String name, int numberOfRounds){
        this.name = name;
        this.numberOfRounds = numberOfRounds;
        this.numberOfWins = 0;
        this.numberOfLoses = 0;
        this.numberOfRemises = 0;
    }

    public boolean printStatistics(){
        System.out.println("STATYSTYKI:");
        System.out.println("-Imię gracza: " + name);
        System.out.println("-Liczba zwycięztw: " + numberOfWins);
        System.out.println("-Liczba porażek: " + numberOfLoses);
        System.out.println("-Liczba remisów: " + numberOfRemises);
        return true;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }
}
