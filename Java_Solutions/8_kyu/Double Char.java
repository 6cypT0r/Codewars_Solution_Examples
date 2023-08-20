public class Solution
{
  public static String doubleChar(String s)
  {
    StringBuffer sb = new StringBuffer();
      for(int i  =0 ; i < s.length(); i++)
      {
        sb.append(s.charAt(i)+""+s.charAt(i)+"");
      }
      return sb.toString();
  }
}
