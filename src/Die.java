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
        faceValue = (int)(Math.random() * MAX) + 1;

        return faceValue;
    }

    public void setFaceValue (int value) // Kan bruges til at bestemme faceValue til et bestemt tal
    {
        faceValue = value;
    }

    public int getFaceValue() // Bruges til at finde ud af hvad den seneste faceValue er(blevet rullet til)
    {
        return faceValue;
    }


    public String toString() // Omformaterer faceValue til en String der bliver til et tal mellem 1-6
    {
        String result = Integer.toString(faceValue);

        return result;
    }
}