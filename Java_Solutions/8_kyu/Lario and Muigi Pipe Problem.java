public class Kata {
  public static int[] pipeFix(int[] numbers) {
    // Fix the pipes!
    int [] newArr = new int [(numbers[numbers.length-1]-numbers[0])+1];
    for(int i = 0, c = numbers[0]; i< newArr.length;i++, c++)
      {
      newArr[i]=c;
    }
    return newArr;
  }
}
