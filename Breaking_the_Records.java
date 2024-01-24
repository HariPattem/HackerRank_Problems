package HackerRank_Problems;

import java.util.LinkedList;
import java.util.List;

public class Breaking_the_Records {
     public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
          int high=0;
        int low=0;
        int highScore=scores.get(0);
        int lowScore=scores.get(0);
   
        for(Integer num:scores){
            if(num>highScore){
                highScore=num;
               high++;
            }
           
             if(lowScore>num){
                 lowScore=num;
                 low++;
                  }
            }
        List<Integer> list1=new LinkedList<>();
        list1.add(high);
        list1.add(low);
        
       return list1;

    }
}
