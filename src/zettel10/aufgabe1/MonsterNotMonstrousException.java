package zettel10.aufgabe1;

public class MonsterNotMonstrousException extends Exception {
    private double lowCreepiness;
    private int lowNumberOfTeeth;

    public MonsterNotMonstrousException(double lowCreepiness) {
        super("Monsters are creepy. You can't have one with creepiness lower than 0!");
        this.lowCreepiness = lowCreepiness;
    }

    public MonsterNotMonstrousException(int lowNumberOfTeeth) {
        super("Monsters with no teeth are no monsters!");
        this.lowNumberOfTeeth = lowNumberOfTeeth;
    }

}
