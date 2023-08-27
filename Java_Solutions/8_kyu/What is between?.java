public class Kata {

  public static int[] between(int a, int b) 
  {
    // your code here
    int [] array = new int [(b-a)+1];
    for (int i =0, c = a ;i < array.length;i++, c++ )
      {
      array[i]=c;
    }
    return array;
  }
}
