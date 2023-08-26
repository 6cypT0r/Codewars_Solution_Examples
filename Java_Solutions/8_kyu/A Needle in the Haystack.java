import java.util.*;

public class Kata {
  public static String findNeedle(Object[] haystack) {
    // Your code here
    int pos = 0;
    for (Object object : haystack) {
      if((object!=null) && (object instanceof String) && object.equals("needle")) break;
      pos++;
    }
    return "found the needle at position "+pos;
  }
}
