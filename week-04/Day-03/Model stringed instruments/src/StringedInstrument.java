public abstract class StringedInstrument extends Instrument {
public StringedInstrument() {}
  int numberOfStrings;

  public StringedInstrument(int numberOfStrings){
    this.numberOfStrings = numberOfStrings;
  }
  abstract void sound();
}
