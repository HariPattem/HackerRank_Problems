package HackerRank_Problems;

import java.util.List;

public class Simple_Array_Sum {
    public static int simpleArraySum(List<Integer> ar) {
        int sum=0;
   for(Integer arr:ar){
        sum+=arr;
   }
      return sum;
    }
}
