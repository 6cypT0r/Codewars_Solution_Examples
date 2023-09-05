public class Kata {

  public static int oddCount(int n)
  {
    int c =0;
    if(n%2==0)
    {
      c= n/2;
      }
    else if (n%2==1)
      {
      c= (n-1)/2;
    }
    return c;
  }

}
