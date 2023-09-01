public class Kata {
  public static int[] digitize(long n) 
  {
    String number = Long.toString(n) ;
        int array [] = new int[number.length()];
        for (int i=0, b = number.length()-1 ;i<number.length();i++,b--)
        {
        array[i]=number.charAt(b)-'0';
        }
        return array;
  }
}
