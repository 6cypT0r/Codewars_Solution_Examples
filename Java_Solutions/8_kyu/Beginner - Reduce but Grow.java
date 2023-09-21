public class Kata{

  public static int grow(int[] x){
  if(x==null)
    {
    return 0;
  }
    if(x.length==1)
      {
      return x[0];
    }
    int res =1;
    for (int i =0; i < x.length ;i++)
      {
      res*=x[i];
    }
    return res;
  
  }

}
