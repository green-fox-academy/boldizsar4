import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnagramTest {
  static Anagram isAnagram;

  @BeforeClass
  public static void init(){
    isAnagram = new Anagram();
  }

  @Test
  public void should_returnFalse_when_stringLengthNotEquals(){
    String s1 = "abc";
    String s2 = "kjld";
    Assert.assertFalse(isAnagram.isAnagram(s1, s2));
  }

  @Test
  public void should_returnTrue_when_stringIsAnagram(){
    String s1 = "Tar";
    String s2 = "rat";
    Assert.assertTrue(isAnagram.isAnagram(s1,s2));
  }
}