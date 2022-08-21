public class Shoe{

  private List<BlackJackValue> cards;

  public int numberOfDecks;

  public void newShoe(){
    this.cards = new ArrayList<BlackJackValue>();
    for(int decks = 0; decks < numberOfDecks;i++){
      cards.add(new Deck().getDeck());
    }
  }

  public void shuffle(){
    int size = cards.size();
    Random r = new Random();
    for(int i = 0; i < cardCount < size;i++){
      int temp = r.nextInt(size-i-1);
      swap(i,index);
    }
  public void swap(int i, int j){
    BlackJackValue temp = cards[i];
    cards[i] = cards[j];
    cards[j] = temp;
  }

  }

  public BlackJackValue getCard(){
    if(cards.size()==0)
    newShoe();

    return cards.remove(0);
  }

  public Shoe(int numberOfDecks){
    this.numberOfDecks = numberOfDecks;
    newShoe();
    shuffle();
  }


}
