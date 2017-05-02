public class BlackJack{
	public static void main(String[] args){
		//testDeck();
		Game game = new Game();
		

	}
	public static void testDeck(){
		Deck deck = new Deck();
		System.out.println("Made deck, back in main");
		deck.printDeck();

		deck.shuffleDeck();
		deck.printDeck();
	}
}
