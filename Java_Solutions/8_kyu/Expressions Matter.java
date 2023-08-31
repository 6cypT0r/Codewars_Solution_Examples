import java.util.*;

public class Kata
{
    public static int expressionsMatter(int a, int b, int c)
    {
        int one = a*(b+c);
        int two = a*b*c;
        int three = a+c*b;
        int four = (a+b)*c;
        int five = a+(b*c);
        int six = a+c+b;
        int [] nums = new int [] {one, two, three, four,five,six};
        Arrays.sort(nums);
        return nums[5];
    }
}
