public class Bob {
  public static int enough(int cap, int on, int wait)
  {
  // your code here
    if(wait+on<=cap)
      {
      return 0;
    }
    else
      {
      return Math.abs(cap-(wait+on));
    }
  }
}
