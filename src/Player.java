public class Player {

    private String name;

    public Player() // Vores construktor
    {
    }

    public int GetSum(Die die1, Die die2)
    {
        return die1.getFaceValue()+die2.getFaceValue();
    }
}
