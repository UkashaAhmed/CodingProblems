class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int maxLen = 1;
        if(nums.length == 0) return 0;
        int count = 1;
        for(int i = 1;i<nums.length;i++){
            if (nums[i] == nums[i - 1]) 
                continue; // skip duplicates
             else if (nums[i] == nums[i - 1] + 1) 
                count++;
             else 
                count = 1; // reset for a new sequence
            
            maxLen = Math.max(maxLen, count);
        }
        return maxLen;
    }
}
