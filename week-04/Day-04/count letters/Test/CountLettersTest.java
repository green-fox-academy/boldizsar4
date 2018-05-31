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
  public void should_return_the_numberOfLetters(){
    String s1 = "aaaaa";
    int expectedresult = 5;

    assertEquals(expectedresult,s1);

  }
}