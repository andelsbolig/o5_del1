public class Main {
    public static void main(String[] args) {
        Die Die1 = new Die();
        Die1.roll();
        System.out.println("Terning kast 1: " + Die1);

        Die Die2 = new Die();
        Die2.roll();
        System.out.println("Terning kast 2: " + Die2);
    }
}
