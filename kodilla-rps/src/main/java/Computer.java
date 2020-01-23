import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Computer {

    List<Character> givenList = Arrays.asList('1', '2', '3');
    Random rand = new Random();

    public Move getComputerMove(){
        char random = givenList.get(rand.nextInt(givenList.size()));
        Move movePC = new Move(random);
        return movePC;
    }

}
