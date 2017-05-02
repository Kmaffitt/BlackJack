import java.util.*;

public class Deck{
	public static final Random random = new Random();
	List<Card> deck = new ArrayList<Card>();

	public Deck(){
		int deckIndex = 0;
		for(int i = 0; i < 4; i ++){
			for(int j = 0; j < 13; j++){
				deck.add(new Card(i, j));
				deckIndex++;
			}
		}
	}
	public void shuffleDeck(){
		//Fisher-Yates shuffle
		int n = deck.size();
		while(n > 1){
			int k = random.nextInt(n--);
			Card temp = deck.get(n);
			deck.set(n, deck.get(k));
			deck.set(k, temp);
		}
	}
	public Card draw(){
		Card card = deck.get(deck.size()-1);
		deck.remove(deck.size()-1);
		return card;
	}

	public void printDeck(){
		//for testing
		for(Card temp: deck){
			temp.printCard(temp);
			System.out.print(" ");
		}
		System.out.print("\n");
	}

	public int deckSize(){
		return deck.size();
	}
}
