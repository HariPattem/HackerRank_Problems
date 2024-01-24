package HackerRank_Problems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sales_by_Match {
     public static int sockMerchant(int n, List<Integer> ar) {
        HashMap<Integer,Integer> map=new HashMap<>();
    // Write your code here
        int count=1;
        for(Integer num:ar){
            if(map.containsKey(num)){
              map.put(num,map.get(num)+1);
            }else{
               map.put(num,count);
            }
        }
        count=0;
        for(Map.Entry<Integer,Integer>num:map.entrySet()){
        count+=num.getValue()/2;                                                 
        }
        return count;
    }
}
