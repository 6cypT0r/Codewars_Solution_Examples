public class Sequence{

  public static int[] reverse(int n){
    //your code
    int [] arr = new int[n];
    for(int i =0, c=n; i < n; i++, c--)
      {
      arr[i]=c;
    }
    return arr;
  }

}
