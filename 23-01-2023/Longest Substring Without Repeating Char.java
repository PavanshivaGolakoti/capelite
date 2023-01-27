class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0;
        int rs=0;
        
        HashSet<Character> set = new HashSet();
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
            }
            else{
                set.clear();
                i++;
                j=i;}
                            rs = Math.max(set.size(),rs);
        }
    return rs;
        
    }
}
