import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        String st = in.nextLine();
        String[] arr = st.split(",");
        List<Integer> list = new ArrayList<>();
        int t = in.nextInt();
        for(int i=0;i<arr.length;i++)
            list.add(Integer.parseInt((arr[i])));
        Collections.sort(list);
        int c=0;
        for(int i=0;i<list.size()-2;i++){
            if(i>0 && list.get(i)==list.get(i-1))
                continue;
            int s=i+1;
            int e =list.size()-1;
            int tar = t-list.get(i);
            while(s<e){
                if(list.get(s)+list.get(e)==tar)
                    c++;
                if(list.get(s)+list.get(e)<tar)
                    s++;
                else 
                    e--;
            }
        }
        if(c!=0)
        System.out.println(c);
        else
            System.out.println(-1);
    }
}
