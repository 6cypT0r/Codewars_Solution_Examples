public class Kata {
    public static long sumMul(int n, int m) {
    // TODO implement
  if(n<=0 || m<= 0) throw new IllegalArgumentException();
  else
    {
    long sum =0;
    for (int i = n; i<m; i+=n)
      {
      sum+=i;
    }
    return sum;
  }
}
}
