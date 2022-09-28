public class Die
{
    private final int MAX = 6;  // højest antal øjne

    private int faceValue;  // antal øjne der vises pt

    public Die() // vores constructor
    {
        faceValue = 1;
    }

    public int roll() // ruller terningen og returnere antal øjne
    {
        faceValue = (int) (Math.random() * MAX) + 1;

        return faceValue;
    }

    public String toString() // omformatere faceValue til string så vi kan læse det som normale tal
    {
        String result = Integer.toString(faceValue);

        return result;
    }
}