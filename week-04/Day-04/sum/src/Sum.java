import java.util.ArrayList;

public class Sum {

  public int getSum(int... numbers){
    int sum = 0;
    for (int number : numbers){
    sum += number;
    }
    return sum;
    }
}
