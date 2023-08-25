public class Kata 
{
    public static int quarterOf(int month) 
    {
      int i =0;
      if(month<=3)
        {
          i=1;
        }
      else if(month<=6)
        {
          i=2;
        }
      else if(month<=9)
        {
         i=3;
        }
      else if(month<=12)
        {
          i=4;
        }
      return i;
    }
}
