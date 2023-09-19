public class ReverseWords
{

 public static String reverseWords(String str)
 {
     StringBuffer sb = new StringBuffer();
      String [] s = str.split(" ");
      for (int i =0 , b =s.length-1; i< s.length; i++, b--) {
        sb.append(s[b]+" ");
      }
      
      return sb.toString().strip();
 }
}
