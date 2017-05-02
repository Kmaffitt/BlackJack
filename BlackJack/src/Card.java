public class Card {
	public enum Suit {
		DIAMONDS("♦"), HEARTS("♥"), CLUBS("♣"), SPADES("♠");
		private String symbol;

		Suit(String symbol) {
			this.symbol = symbol;
		}

		public String getSymbol() {
			return this.symbol;
		}
	}

	public enum Value {
		ACE("A"), TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"),
		SEVEN("7"), EIGHT("8"), NINE("9"), TEN("10"), JACK("J"),
		QUEEN("Q"), KING("K");
		private String symbol;

		Value(String symbol) {
			this.symbol = symbol;
		}

		public String getSymbol() {
			return this.symbol;
		}
	}

	private boolean faceDown = false;
	private final int suit;
	private final int val;

	public Card(int suit, int val) {
		this.suit = suit;
		this.val = val;
	}

	public void printCard(Card card) {
		if (faceDown){
			System.out.print("XX");
		}
		else
		{
			switch (card.val) {
				case 0:
					System.out.print(Card.Value.ACE.getSymbol());
					break;
				case 1:
					System.out.print(Card.Value.TWO.getSymbol());
					break;
				case 2:
					System.out.print(Card.Value.THREE.getSymbol());
					break;
				case 3:
					System.out.print(Card.Value.FOUR.getSymbol());
					break;
				case 4:
					System.out.print(Card.Value.FIVE.getSymbol());
					break;
				case 5:
					System.out.print(Card.Value.SIX.getSymbol());
					break;
				case 6:
					System.out.print(Card.Value.SEVEN.getSymbol());
					break;
				case 7:
					System.out.print(Card.Value.EIGHT.getSymbol());
					break;
				case 8:
					System.out.print(Card.Value.NINE.getSymbol());
					break;
				case 9:
					System.out.print(Card.Value.TEN.getSymbol());
					break;
				case 10:
					System.out.print(Card.Value.JACK.getSymbol());
					break;
				case 11:
					System.out.print(Card.Value.QUEEN.getSymbol());
					break;
				case 12:
					System.out.print(Card.Value.KING.getSymbol());
					break;
				}
			switch (card.suit) {
			case 0:
				System.out.print(Card.Suit.DIAMONDS.getSymbol());
				break;
			case 1:
				System.out.print(Card.Suit.HEARTS.getSymbol());
				break;
			case 2:
				System.out.print(Card.Suit.CLUBS.getSymbol());
				break;
			case 3:
				System.out.print(Card.Suit.SPADES.getSymbol());
				break;
			}
		}
	}

	public int getVal() {
		return val;
	}
	public void setFaceDown(boolean b){
		faceDown = b;
	}
}
