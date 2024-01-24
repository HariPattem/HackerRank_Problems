package HackerRank_Problems;

public class Number_Line_Jumps {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
             while(true){
                
                if(x1==x2){
                    return "YES";
                }
                if(v1>v2){
                 if(x1>x2){
                     return "NO";
                  }
                }else{
                       if(x2>x1){
                        return "NO";  
                       }
                 }
                x1+=v1;
                x2+=v2; 
            }
    
    
        }
}
