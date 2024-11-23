package week_12_Quiz.source.question_1;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 0, 100, 0, 3);
        Monster monster = new Monster("Goblin", 10, 15, 50, 5, "Green");

        System.out.println(monster.MakeNoise());
        monster.TakeDamage(30);
        monster.TakeDamage(25);

        player.TakeDamage(50);
        player.TakeDamage(60);
        player.TakeDamage(60);
    }
}