import java.util.Arrays;
import java.util.Collections;

public class Kata {
  public static int[] flip(char dir, int[] arr) {
        int [] a = new  int[arr.length];
        if(dir=='L')
        {
            Arrays.sort(arr);
            for(int i =0, c = arr.length-1; i < arr.length;i++,c--)
            {
                a[i]= arr[c];
            }
        }
        else if(dir=='R')
          {
          Arrays.sort(arr);
          a =arr;
        }
        return a;
  }
}
