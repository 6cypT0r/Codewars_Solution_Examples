import java.util.*;
public class Welcome 
{
   public static String greet(String language)
   {
     
   HashMap<String, String> lg = new HashMap<String, String>(); 
   lg.put("english", "Welcome"); 
   lg.put("czech" ,"Vitejte");
   lg.put("danish" ,"Velkomst");
   lg.put("dutch" ,"Welkom");
   lg.put("estonian" ,"Tere tulemast");
   lg.put("finnish", "Tervetuloa");
   lg.put("flemish", "Welgekomen");
   lg.put("french" ,"Bienvenue");
   lg.put("german" ,"Willkommen");
   lg.put("irish" ,"Failte");
   lg.put("italian", "Benvenuto");
   lg.put("latvian" ,"Gaidits");
   lg.put("lithuanian", "Laukiamas");
   lg.put("polish" ,"Witamy");
   lg.put("spanish" ,"Bienvenido");
   lg.put("swedish" ,"Valkommen");
   lg.put("welsh" ,"Croeso");
  if(lg.containsKey(language)){
   return (String)lg.get(language);}
   else{
    return "Welcome";}
   }
}
