/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        String[] ranks = {"jack", "queen", "king"};
        String[] suits = {"Spades", "Hearts" , "Diamonds", "Clubs"};
        int[] pointValues = {11, 12, 13};
        Deck d = new Deck(ranks, suits, pointValues);
        System.out.println("  toString " + d.toString());
        System.out.println("  isEmpty " + d.isEmpty());
        System.out.println("  size " + d.size());
        System.out.println("  deal " + d.deal());
    }
}
