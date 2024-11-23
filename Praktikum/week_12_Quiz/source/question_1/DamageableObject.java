package week_12_Quiz.source.question_1;

public abstract class DamageableObject extends GameObject {
    protected int MaxHealth;
    protected int Health;

    public DamageableObject(String name, int posX, int posY, int maxHealth) {
        super(name, posX, posY);
        this.MaxHealth = maxHealth;
        this.Health = maxHealth;
    }

    public boolean IsDead() {
        return Health <= 0;
    }

    public void TakeDamage(int damage) {
        Health -= damage;
        System.out.println(Name + " took " + damage + " damage. Current health: " + Health);
        if (IsDead()) {
            OnKilled();
        }
    }

    protected abstract void OnKilled();
}