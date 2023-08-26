import java.util.Arrays;

public class SmashWords 
{

	public static String smash(String... words) 
  {
    // TODO Write your code below this comment please
    StringBuffer sb = new StringBuffer();
     for (int i =0 ; i< words.length;i++)
     {
      sb.append(" "+words[i]);
     }
     return sb.toString().strip();
  }
}

