public class Kata 
{
  public static int[] invert(int[] array) 
  {
  if(array == null)
    {
    return null;
  }
  else
    {
    int [] arr = new int[array.length];
    for(int i =0; i < arr.length; i++)
      {
      if(array[i]>0)
        {
        arr[i]=0-array[i];
      }
      else if(array[i]==0)
        {
        arr[i]=array[i];
      }
      else if( array[i]<0)
        {
        arr[i]= array[i] *(-1);
      }
    }
    return arr;
  }
  }
}
