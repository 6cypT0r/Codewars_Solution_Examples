public class Kata {

  public static int makeNegative(final int x) {
    
        int y=0;
        if(x==0)
         {
          y= 0;
        }
         else if(x>0)
         {
           y= -x;
         }
         else if(x<0)
         {
           y= x;
         }
         return y;
    
  }
  
}
