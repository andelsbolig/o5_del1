import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int sum;

        Die die1 = new Die();
        die1.roll();
        System.out.println("Terning kast 1: " + die1);

        Die die2 = new Die();
        die2.roll();
        System.out.println("Terning kast 2: " + die2);

        Player player1 = new Player();
        sum = player1.GetSum(die1, die2);
        System.out.print("Player one's total is: " + sum);
    }
}
