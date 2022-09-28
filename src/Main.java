public class Main {
    public static void main(String[] args) {
        playGame(100); // Starter spillet
    }

    public static void playGame(int maxScore) // Funktion der køres hver gang et nyt spil startes
    {
        // Initierer de to players
        Player player1 = new Player();
        Player player2 = new Player();

        // Initierer de to terninger
        Die die1 = new Die();
        Die die2 = new Die();

        // Starter spillerne med 0 point
        int player1Score = 0;
        int player2Score = 0;

        System.out.println("Starter spillet..."); // Annoncerer at spillet begynder

        while(player1Score < maxScore || player2Score < maxScore) // Kører indtil en af spillerne vinder
        {
            int roll; // Variabel der bruges til opbevare resultatet af et terningerkast

            // Spiller 1 kaster 2 terninger
            roll = player1.rollDice(die1, die2); // Saver summen af de to terninger i roll variablet
            System.out.println("Spiller 1 slog "+die1.getFaceValue()+" og "+die2.getFaceValue()); // Annoncerer de to terningekast
            System.out.println("Spiller 1 får "+roll+" point!"); // Annoncerer spillerens roll
            player1Score += roll; // Adder spillerens roll til deres score
            System.out.println("Spiller 1's score er nu: "+player1Score); // Annoncerer spillerens score
            if(player1Score >= maxScore){ // If loop der checker om spiller 1 vandt
                System.out.println("Spiller 1 vandt!"); // Annoncerer at spilleren vandt
                break; // Afslutter while loopet
            }

            // Spiller 2 kaster 2 terninger
            roll = player2.rollDice(die1, die2); // Saver summen af de to terninger i roll variablet
            System.out.println("Spiller 2 slog "+die1.getFaceValue()+" og "+die2.getFaceValue()); // Annoncerer de to terningekast
            System.out.println("Spiller 2 får "+roll+" point!"); // Annoncerer spillerens roll
            player2Score += roll; // Adder spillerens roll til deres score
            System.out.println("Spiller 2's score er nu: "+player2Score); // Annoncerer spillerens score
            if(player2Score >= maxScore){ // If loop der checker om spiller 2 vandt
                System.out.println("Spiller 2 vandt!"); // Annoncerer at spilleren vandt
                break; // Afslutter while loopet
            }
        }
    }
}
