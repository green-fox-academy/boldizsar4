import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {

  static CountLetters counting;

  @BeforeClass
  public static void init(){
    counting = new CountLetters();
  }

  @Test
  public void should_return(){
    String s1 = "aaaaa";
    int expectedresult = 5;
    int[] result = counting.countingLetters(s1);

    assertEquals(expectedresult,result);
  }
}