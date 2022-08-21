public class BlackJackValue extends Card{
  private int value;

  public int getValue() {return value;}

  public BlackJackValue(Suit suit, int value){
    super(suit,value);
    this.value = value;
    if(this.value > 10)
      this.value = 10;
  }
}
