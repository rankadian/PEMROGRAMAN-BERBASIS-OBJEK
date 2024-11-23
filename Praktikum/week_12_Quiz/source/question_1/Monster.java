package week_12_Quiz.source.question_1;

public class Monster extends DamageableObject {
    private int ThreatLevel;
    private String Color;

    public Monster(String name, int posX, int posY, int maxHealth, int threatLevel, String color) {
        super(name, posX, posY, maxHealth);
        this.ThreatLevel = threatLevel;
        this.Color = color;
    }

    public String MakeNoise() {
        return Name + " roars menacingly!";
    }

    @Override
    protected void OnKilled() {
        System.out.println(Name + " has been defeated! Threat level: " + ThreatLevel);
        Despawn();
    }
}