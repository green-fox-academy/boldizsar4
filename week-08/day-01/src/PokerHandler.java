import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PokerHandler {

  String[] black = {"2H", "3D", "5S", "9C", "KD"};
  String[] white = {"2C", "3H", "4S", "8C", "AH"};

  public static String getHighestNumber(String[] black, String[] white) {
    String white1 = "White";
    String black1 = "Black";
    String result = " wins! - (";

    if (black == null || white1 == null || black.length != 5 || white.length != 5){
      return "sdfgh";
    }

    String whiteHand = whatHas(white1);
    String blackHand = whatHas(black1);

    return result + white1 + ")";
  }

  private static String whatHas(String white) {
    return "malac";
  }
}
