package week_12_Quiz.source.question_1;

public class GameObject {
    protected String Name;
    protected int PosX;
    protected int PosY;

    public GameObject(String name, int posX, int posY) {
        this.Name = name;
        this.PosX = posX;
        this.PosY = posY;
    }

    public void Despawn() {
        System.out.println(Name + " has been removed from the game.");
    }
}