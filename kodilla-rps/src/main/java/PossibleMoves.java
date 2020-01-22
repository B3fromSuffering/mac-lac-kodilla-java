import java.util.HashMap;
import java.util.Map;

public class PossibleMoves {

    public static Map<Character, String> moves(){

        Map<Character, String> moves = new HashMap<>();
        moves.put('1', "Kamień");
        moves.put('2', "Papier");
        moves.put('3', "Nożyce");

        return moves;
    }
}
