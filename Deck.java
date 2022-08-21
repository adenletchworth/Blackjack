public class Deck{

  private List<BlackJackValue> cards;

  public Deck(){
    this.cards = new ArrayList<BlackJackValue>();
    for(int i = 0;i<=13;i++){
      for(Suit suit : suit.values()){
        this.cards.add(new BlackJackValue(suit,value));
      }
    }
  }
  public List<BlackJackValue> getDeck(){
    return cards;
  }

}
