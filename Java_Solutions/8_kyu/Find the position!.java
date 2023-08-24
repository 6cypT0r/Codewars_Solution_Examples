public class Kata
{
  public static String position(char alphabet)
  {
    String s ="abcdefghijklmnopqrstuvwxyz";   
    return "Position of alphabet: "+Integer.toString(s.indexOf(alphabet)+1);
  }
}
