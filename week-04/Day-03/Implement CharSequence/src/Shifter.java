public class Shifter implements CharSequence {

  String string2;
  int intIndex;

  public Shifter(String string2, int intIndex){
    this.string2 = string2;
    this.intIndex = intIndex;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return string2.charAt(index + intIndex);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return string2.subSequence(start,end);
  }

  @Override
  public String toString(){
    return string2.toString();
  }
}
