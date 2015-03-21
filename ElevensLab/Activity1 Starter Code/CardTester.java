/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
         Card newCard1 = new Card("King", "Hearts", 3);
         Card newCard2 = new Card("Queen", "Diamonds", 2);
         Card newCard3 = new Card("Jack", "Spades", 1);
         System.out.println(newCard1.suit());
         System.out.println(newCard1.rank());
         System.out.println(newCard1.pointValue());
         System.out.println(newCard1.matches(newCard2));
         System.out.println(newCard2.suit());
         System.out.println(newCard2.rank());
         System.out.println(newCard2.pointValue());
         System.out.println(newCard3.suit());
         System.out.println(newCard3.rank());
         System.out.println(newCard3.pointValue());
         System.out.println(newCard1.toString());
         System.out.println(newCard2.toString());
         System.out.println(newCard3.toString());
	}
}
