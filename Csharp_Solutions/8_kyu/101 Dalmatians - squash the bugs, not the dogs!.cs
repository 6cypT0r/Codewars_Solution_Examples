using System;
using System.Collections.Generic;

public static class Kata
{
  public static string HowManyDalmatians(int n)
  {
  List<string> dogs = new List<string>()
  {
    "Hardly any",
    "More than a handful!",
    "Woah that's a lot of dogs!",
    "101 DALMATIONS!!!"
  };
  if(n <= 10) return dogs[0];
  else if (n <= 50) return dogs[1];
  else if (n == 101) return dogs[3];
  else return dogs[2];
  }
}
