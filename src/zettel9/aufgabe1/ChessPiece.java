package zettel9.aufgabe1;

public enum ChessPiece {

    KING(2,1,ChessPieceFaction.REGULAR),
    QUEEN(2,1,ChessPieceFaction.SCHWERGEWICHT),
    ROOK(4,2,ChessPieceFaction.REGULAR),
    BISCHOP(4,2,ChessPieceFaction.LEICHTGEWICHT),
    KNIGHT(4,2,ChessPieceFaction.LEICHTGEWICHT),
    PAWN(16,8,ChessPieceFaction.REGULAR);


    private enum ChessPieceFaction{
        REGULAR("regular"),
        SCHWERGEWICHT("heavy"),
        LEICHTGEWICHT("light");

        private String faction;

        ChessPieceFaction(String faction) {
            this.faction = faction;
        }

        public String getFaction() {
            return faction;
        }
    }

    private final int piecesOnBoard;
    private final int piecesPerPlayer;
    private final ChessPieceFaction faction;


    ChessPiece(int piecesOnBoard, int piecesPerPlayer, ChessPieceFaction faction) {
        this.faction = faction;
        this.piecesOnBoard = piecesOnBoard;
        this.piecesPerPlayer = piecesPerPlayer;
    }


    public int getPiecesOnBoard() {
        return piecesOnBoard;
    }

    public int getPiecesPerPlayer() {
        return piecesPerPlayer;
    }

    public ChessPieceFaction getFaction() {
        return faction;
    }

    @Override
    public String toString() {
        return "ChessPiece{" +
                "piecesOnBoard=" + piecesOnBoard +
                ", piecesPerPlayer=" + piecesPerPlayer +
                '}';
    }

    public boolean isRegular(ChessPiece piece){
        return piece.getFaction() == ChessPieceFaction.REGULAR;
    }
}














