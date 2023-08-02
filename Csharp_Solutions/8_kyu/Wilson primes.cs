public class Kata
{
    public static bool AmIWilson(int p)
  {
    var factorial = 1;
    for(var i = 2; i < p; i++)
    factorial *= i;
    return (factorial + 1) % (p * p) == 0;
  }
}
