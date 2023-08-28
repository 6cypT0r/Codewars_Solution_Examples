public class Calculate
{
  public static String bmi(double weight, double height) 
  {
    double bmi = weight /Math.pow( height, 2);
    String str = null;
    if (bmi > 30) str =  "Obese";
    if (bmi <= 30.0) str =  "Overweight";
    if (bmi <= 25.0) str =  "Normal";
    if (bmi <= 18.5) str =  "Underweight";
    return str;
  }
}
