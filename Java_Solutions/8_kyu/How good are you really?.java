public class Kata 
{
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) 
  {
    // Your code here
    int avarage =0;
    
    for (int i =0; i < classPoints.length; i++)
    {
      avarage+=classPoints[i];
    }
    
    avarage=avarage/classPoints.length;
    return (avarage>yourPoints) ? false :true;
  }
}
