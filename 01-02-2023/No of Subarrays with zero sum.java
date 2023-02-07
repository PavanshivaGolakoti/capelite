
import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
 HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
      int sum=0;
      int c=0;
      for(int i=0;i<arr.size();i++)
          {
            sum+=arr.get(i);
        if(sum==0){
          c++;}
        else{
            if(map.containsKey(sum)){
            c+=map.get(sum);
            map.put(sum,map.get(sum)+1);
            }
            else{
            map.put(sum,1);
        }
          }
    }
        return c;
		
	}
}
