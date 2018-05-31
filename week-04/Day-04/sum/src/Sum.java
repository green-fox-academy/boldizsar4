import java.util.ArrayList;

public class Sum {

  public int getSum(int... numbers){
    if (numbers == null){
      return 0;
    }
    int sum = 0;
    for (int number : numbers){
    sum += number;
    }
    return sum;
    }
}
