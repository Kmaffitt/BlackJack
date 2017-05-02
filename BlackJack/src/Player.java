import java.util.*;

public class Player{
	List<Card> hand = new ArrayList<Card>();
	int bank;

	public Player(int bank){
		this.bank = bank;
	}
	public void adjustBank(int adj){
		this.bank += adj;
	}
	public void draw(Card card){
		hand.add(card);
	}
	public void discardHand(){
		hand.clear();
	}
	public void displayCards(){
		for(Card card : hand){
			card.printCard(card);
			System.out.print(" ");
		}
	}

}
