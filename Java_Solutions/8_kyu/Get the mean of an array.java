public class School{

 	public static int getAverage(int[] marks){
		int sum =0;
    for(int i =0; i < marks.length; i++)
      {
      sum+=marks[i];
    }
    return (int)Math.round(sum/marks.length);
	}

}
