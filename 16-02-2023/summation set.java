import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String st = in.nextLine();
        String[] sr = st.split(",");
        int[] arr = new int[sr.length];
        for(int i=0;i<sr.length;i++)
            arr[i]=Integer.parseInt(sr[i]);
        int t = in.nextInt();
        Arrays.sort(arr);
        int c=0;
        for(int i=0;i<arr.length-3;i++){
            if(i>0 && arr[i]==arr[i-1])
                continue;
            for(int j=i+1;j<arr.length-2;j++){
                if(j>i+1 && arr[j]==arr[j-1])
                    continue;
                int s = j+1;
                int e = arr.length-1;
                int tar = t-(arr[i]+arr[j]);
                while(s<e){
                    if(arr[s]+arr[e]==tar){
                        c++;
                        int ee=arr[e];
                        while(s<e && arr[s]==arr[s-1]) s++;
                        while(s<e && arr[e]==ee) e--;
                    }
                    else if(arr[s]+arr[e]<tar)
                        s++;
                    else
                        e--;
                }
            }
        }
        if(c==0)
            System.out.println(-1);
        else
        System.out.println(c);
    }
}
