package zettel5_solved.aufgabe1;

public class Bird {
    private long idIncrementer = 0;
    private long id;

    private String name;

    private double rarity;

    private double latitude;
    private double langitude;

    private long maximumLifeSpan;

    private double estimatedAge;

    public Bird() {

    }

    public Bird(String name, double rarity, double latitude, double langitude, long maximumLifeSpan, double estimatedAge) {
        this.id = ++idIncrementer;
        this.name = name;
        this.rarity = rarity;
        this.latitude = latitude;
        this.langitude = langitude;
        this.maximumLifeSpan = maximumLifeSpan;
        this.estimatedAge = estimatedAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRarity() {
        return rarity;
    }

    public void setRarity(double rarity) {
        this.rarity = rarity;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLangitude() {
        return langitude;
    }

    public void setLangitude(double langitude) {
        this.langitude = langitude;
    }

    public long getMaximumLifeSpan() {
        return maximumLifeSpan;
    }

    public void setMaximumLifeSpan(long maximumLifeSpan) {
        this.maximumLifeSpan = maximumLifeSpan;
    }

    public double getEstimatedAge() {
        return estimatedAge;
    }

    public void setEstimatedAge(double estimatedAge) {
        this.estimatedAge = estimatedAge;
    }

    public boolean isGhost() {
        return estimatedAge > maximumLifeSpan;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rarity=" + rarity +
                ", latitude=" + latitude +
                ", langitude=" + langitude +
                ", maximumLifeSpan=" + maximumLifeSpan +
                ", estimatedAge=" + estimatedAge +
                '}';
    }

    public String kindOfRarity() {
        String myRarity = "";
        if (getRarity() >= 0 && getRarity() < 0.5) {
            myRarity = "regulär";
        }
        else if (getRarity() >= 0.5 && getRarity() < 0.7) {
            myRarity =  "selten";
        }
        else if (getRarity() >= 0.7 && getRarity() < 1.0) {
            myRarity =  "außergewöhnlich-selten";
        }
        return myRarity;
    }

    public double getEstimatedLifeTime(){
        if(!isGhost()){
            return getMaximumLifeSpan() - getEstimatedAge();
        }
        else {
            return getEstimatedAge() - getMaximumLifeSpan();
        }
    }

    public boolean isInGermany(){
        return ((latitude >= 47.41 && latitude <= 5.99) && (langitude >= 54.91 && langitude <= 14.99));
    }

    public double getLatitudeDistance(Bird bird){
        return Math.abs(this.getLatitude() - bird.getLatitude());
    }
}
