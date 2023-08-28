public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    // TODO May the force be with you
    int count =0;
    for(Boolean b : arrayOfSheeps)
    {
      if(b!=null && b==true)
      {
        count++;
      }
    }
    return count;
  }
}
