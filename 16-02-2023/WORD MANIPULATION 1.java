import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        TreeMap<String,String> map = new TreeMap<>();
        for(int i=0;i<s.length();i++){
            String sub = s.substring(i,i+1);
            String lo = sub.toLowerCase();
            if(!map.containsKey(lo))
                map.put(lo,sub);
            else
                map.put(lo,map.get(lo)+sub);
            
        }
        String res="";
        List<String> l = new ArrayList<>();
        for(Map.Entry<String,String> entry: map.entrySet())
            l.add(entry.getValue());
        for(int i=0;i<l.size()/2;i++){
            res+=l.get(i);
            res+=l.get(l.size()-1-i);
        }
        if(l.size()%2!=0)
            res+=l.get(l.size()/2);
        System.out.println(res);
    }
}
