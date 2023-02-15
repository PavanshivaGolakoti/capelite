import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int ss=0;
        for(int i=0;i<s.length();i++)
        {
            if(!Character.isLetterOrDigit(s.charAt(i)))
                ss++;
        }
        List<Character> even = new ArrayList<>();
        List<Character> odd = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                if(s.charAt(i)%2==0)
                    even.add(s.charAt(i));
                else odd.add(s.charAt(i));}
        }
        String res="";
        
        int e = even.size();
        int o = odd.size();
        if(ss%2==0)
        {
            
            if(e>o)
            {
                for(int i=0;i<o;i++)
                {
                    res+=Character.toString(even.get(i));
                    res+=Character.toString(odd.get(i));
                }
                for(int i=o;i<e;i++)
                    res+=Character.toString(even.get(i));
            }
            else{
                for(int i=0;i<e;i++)
                {
                    res+=Character.toString(even.get(i));
                    res+=Character.toString(odd.get(i));
                }
                for(int i=e;i<o;i++)
                    res+=Character.toString(odd.get(i));
                
            }
        }
        else{
            if(e>o)
            {
                for(int i=0;i<o;i++)
                {
                    res+=Character.toString(odd.get(i));
                    res+=Character.toString(even.get(i));
                }
                for(int i=o;i<e;i++)
                    res+=Character.toString(even.get(i));
            }
            else{
                for(int i=0;i<o;i++)
                {
                    
                    res+=Character.toString(odd.get(i));
                    res+=Character.toString(even.get(i));
                }
                for(int i=e;i<o;i++)
                    res+=Character.toString(odd.get(i));
                
            }
            
            
            
        }
        System.out.println(res);
        
        
}
}
