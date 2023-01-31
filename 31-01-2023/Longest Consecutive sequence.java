class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int val:nums)
        set.add(val);
        int max=0;
        for(int val:nums){
            int l=0;
            if(!set.contains(val-1)){
                while(set.contains(val)){
                l++;
                val++;}
                if(max<l)
            max=l;

            }
        }
        return max;
        
    }
}
