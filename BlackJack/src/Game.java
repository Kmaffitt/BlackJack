import java.util.*;

public class Game{
	Player dealer, player;
	Deck deck;
	int pot;
	Scanner scanner = new Scanner(System.in);
	String input = "";
	int startingBank = 500;

	public Game(){
		dealer = new Dealer(0);
		player = new Player(startingBank);
		pot = 0;
		deck = new Deck();
		deck.shuffleDeck();

		System.out.println("Starting cards in deck");
		deck.printDeck();

		System.out.println("Dealer draws twice:");
		for(int i = 0; i<2; i++){
			if(deck.deckSize() > 0){
				dealer.draw(deck.draw());
			}
		}
		System.out.println("Dealer's cards:");
		dealer.displayCards();

		System.out.println("\nPlayer draws twice:");
		for(int i = 0; i<2; i++){
			player.draw(deck.draw());
		}
		System.out.println("Player's cards:");
		player.displayCards();

		System.out.println("\nRemaining cards in deck:");
		deck.printDeck();

	}
}
