public class Kata{
  public static double find_average(int[] array)
  {
    double sum = 0;
    if(array.length>0)
    {
      for (int x:array) 
     {
      sum+=x;
    }
      return (double)sum/array.length;
    }
    else return 0.0;
  }
}
