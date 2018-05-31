import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {

  static Sum sum;

  @BeforeClass
  public static void init() {
    sum = new Sum();
  }

  @Test
  public void should_return0_when_emptyInput(){
    int expectedResult = 0;
    int result = sum.getSum();

    assertEquals(expectedResult,result);
  }

  @Test
  public void should_returnNumber_when_oneIntegerInput(){

    int inputNumber = 10;
    int expectedResult = 10;
    int result = sum.getSum(inputNumber);

    assertEquals(expectedResult,result);
  }

  @Test
  public void should_returnSum_multipleIntegerInput(){

    int[] numbers = new int[] {1,2,3};
    int expectedResult = 6;
    int result = sum.getSum(numbers);

    assertEquals(expectedResult,result);
  }
  @Test
  public void should_return0_when_nullInput(){
    int expectedResult = 0;
    int result = sum.getSum(null);

    assertEquals(expectedResult,result);
  }
}