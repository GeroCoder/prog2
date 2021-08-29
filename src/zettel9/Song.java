package zettel9;

public enum Song {
    AUF_UND_AB(3),
    STAY(8),
    BAD_HABITS(4),
    HELL_BEACH(1),
    BLAUES_LICHT(4),
    SOMMERGEWITTER(8);

    private int weeksInCharts;

    Song(int weeksInCharts) {
        this.weeksInCharts = weeksInCharts;
    }

    public int getWeeksInCharts() {
        return weeksInCharts;
    }

    @Override
    public String toString() {
        return "Song{" +
                "weeksInCharts=" + weeksInCharts +
                '}';
    }
}
