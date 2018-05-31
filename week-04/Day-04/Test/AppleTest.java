import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

  static Apple getApple;

  @BeforeClass
  public static void init(){
  getApple = new Apple();
}
@Test
  public void should_return_Apple_With_getApple(){

  String expectedResult = "apple";
  String result = getApple.getApple();

  assertEquals(expectedResult,result);
}
}