public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    return (name.charAt(0)+"").toUpperCase()+"."+(name.charAt(name.indexOf(" ")+1)+"").toUpperCase();
  }
}
