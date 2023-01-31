class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 3; i++) {
            if(i>0 && nums[i]==nums[i-1])
            continue;
            for(int j = i + 1; j < nums.length - 2; j++) {
                if(j>i+1 && nums[j]==nums[j-1])
            continue;
                long res = (nums[i] + nums[j]);
                long remSum = target - res;
                int front = j + 1, back = nums.length - 1;
                while(front < back) {
                    long twoSum = nums[front] + nums[back];
                    
                    if(twoSum==remSum){
                        List<Integer> sum = new ArrayList<>();
                        sum.add(nums[i]);
                        sum.add(nums[j]);
                        sum.add(nums[front]);
                        sum.add(nums[back]);
                        ans.add(sum);
                        
                        while(front < back && nums[front] == nums[front-1] )front++;
                        while(front < back && nums[back] == sum.get(3)) back--;
                    }
                    else if(twoSum > remSum) back--;
                    else front++;
                }
            }
        }
        return ans;
        
    }
}
