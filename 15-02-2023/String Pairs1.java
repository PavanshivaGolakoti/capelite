import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] arr = s.split(",");
        int c=0;
        for(int i=0;i<arr.length;i++){
            String s1 = arr[i];
            List<Character> list = new ArrayList<>();
            for(int j=0;j<s1.length();j++)
                list.add(s1.charAt(j));
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    String s2  = arr[j];
                    int k=0;
                    for(int l=0;l<s2.length();l++){
                        if(!list.contains(s2.charAt(l))){
                        k=1;
                           break;}
                    }
                    if(k==0)
                        c++;
                    
                }
            }
        }
        System.out.println(c);
        
        }
    }
