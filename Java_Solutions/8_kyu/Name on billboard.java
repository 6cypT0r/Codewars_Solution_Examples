public class Billboard {
	
	public static int billboard(String name, int price) {
    // Your code
    int res=0;
    for( int i = 0; i<name.length(); i++)
      {
      res+=price;
    }
    return res;
  }
}
