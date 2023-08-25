public class FakeBinary {
    public static String fakeBin(String numberString) {
        StringBuffer sb = new StringBuffer();
      char nums [] = numberString.toCharArray();
      for (char c : nums) {
        if((Integer.parseInt(c+""))<5 )
        {
          sb.append('0');
        }
        else{
        sb.append('1');}
      }
      return sb.toString();
    }
}
