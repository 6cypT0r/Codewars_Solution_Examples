public class Hello{
  public String sayHello(String [] name, String city, String state){
    //code here
        StringBuffer sb = new StringBuffer();
        sb.append("Hello, ");
        for (int i =0; i < name.length;i++)
        {
          if(i==name.length-1){
            sb.append(name[i]);
          }
          else
          sb.append(name[i]+" ");
        }

        sb.append("! Welcome to "+city+", "+state+"!");
        return sb.toString();
  }
}
