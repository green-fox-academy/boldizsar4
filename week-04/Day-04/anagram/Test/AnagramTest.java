import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramTest {
  static Anagram anagram;

  @BeforeClass
  public static void init(){
    anagram = new Anagram();
  }

  @Test
  public void should_returnFalse_when_stringLengthNotEquals(){
    String s1 = "sds";
    String s2 = "abss";
    assertFalse(anagram.isAnagram(s1, s2));
  }

  @Test
  public void should_returnTrue_when_useUpperCase(){
    String s1 = "Tar";
    String s2 = "rat";
    Assert.assertTrue(anagram.isAnagram(s1,s2));
  }

  @Test
    public void should_returnFalse_when_its_notAnagram() {
    String s1 = "abcc";
    String s2 = "abab";
    assertFalse(anagram.isAnagram(s1, s2));
  }

  @Test
  public void should_returnFalse_when_stringInputEmpty(){
    String s1 = "";
    String s2 = "";
    assertFalse(anagram.isAnagram(s1,s2));
  }
  }
