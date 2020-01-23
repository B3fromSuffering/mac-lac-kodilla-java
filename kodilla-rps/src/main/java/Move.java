public class Move {

    private char moveID;

    public Move(char moveID){
        this.moveID = moveID;
    }

    public char getMoveID() {
        return moveID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Move move = (Move) o;
        return moveID == move.moveID;
    }

    @Override
    public String toString() {
        return PossibleMoves.moves().get(moveID);
    }
}
