import java.util.*;

public class Dominoes {
  public static void main(String[] args) {

      List<Domino> dominoes = new ArrayList<>();
      dominoes.add(new Domino(5, 2));
      dominoes.add(new Domino(4, 6));
      dominoes.add(new Domino(1, 5));
      dominoes.add(new Domino(6, 7));
      dominoes.add(new Domino(2, 4));
      dominoes.add(new Domino(7, 1));

    Collections.sort(dominoes, new Comparator<Domino>() {
      @Override
      public int compare(Domino o1, Domino o2) {
        return o1.compareTo(o2);
      }
    });
    System.out.println(Arrays.asList(dominoes));
  }
}
// the order of your dominoes should look like this: [[1,5], [2,4], [4,6], [5,2], [6,7], [7,1]]