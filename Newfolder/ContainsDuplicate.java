class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> x=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(x.contains(nums[i])){
                return true;
            }
            x.add(nums[i]);
        }
        return false;
    }
}
“I’ll use a HashSet to check for duplicates in one pass.
A HashSet only stores unique values, and insert + lookup are O(1).
I iterate through the array, and for each number I check if it’s already in the set.
If it is, that means I found a duplicate, so I return true.
If not, I add it to the set and continue.
If I finish the loop without finding any duplicates, I return false.”

Time complexity: O(n)
Space complexity: O(n)
