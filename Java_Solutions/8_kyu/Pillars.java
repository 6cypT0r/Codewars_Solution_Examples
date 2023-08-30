public class Kata{
  
  public static int pillars(int numPill, int dist, int width)
  {
    if (numPill==1)
    {
      return 0;
    }
    else
    {
      int total = width*(numPill-2);
      for( int i =1; i<numPill;i++)
        {
        total+=dist*100;
      }
      return total;
    }
  }
  
}
