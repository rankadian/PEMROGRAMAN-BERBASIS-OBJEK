package week_12_Quiz.source.question_1;

public class Player extends DamageableObject {
    private int Score;
    private int LivesRemaining;

    public Player(String name, int posX, int posY, int maxHealth, int score, int livesRemaining) {
        super(name, posX, posY, maxHealth);
        this.Score = score;
        this.LivesRemaining = livesRemaining;
    }

    @Override
    protected void OnKilled() {
        LivesRemaining--;
        System.out.println(Name + " has been killed! Lives remaining: " + LivesRemaining);
        if (LivesRemaining > 0) {
            Health = MaxHealth;
            System.out.println(Name + " has respawned with full health!");
        } else {
            Despawn();
        }
    }
}