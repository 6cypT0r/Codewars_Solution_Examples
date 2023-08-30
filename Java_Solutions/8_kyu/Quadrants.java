public class Kata 
{
  public static int quadrant(int x, int y) 
  {
    int result = 0;
    if (x<0)
      {
      if(y>0)
      {
        result =2;
      }
      else
      {
        result =3;
      }
    }
    
    if (x>0)
      {
      if (y>0)
      {
        result = 1;
      }
      else
      {
        result = 4;
      }
    }
    return result;
  }
}
