import java.util.*;

public class Dealer extends Player{

  public Dealer(int b){
    super(b);
  }
  public void draw(Card card){
    card.setFaceDown(true);
    hand.add(card);
  }

}
