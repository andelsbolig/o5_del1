public class Player {

    private String name;

    public Player() // Vores construktor
    {
    }

    public int rollDice(Die die1, Die die2)
    {
        return die1.roll()+die2.roll();
    }
}
