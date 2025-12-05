class Solution {
    public int findDuplicate(int[] nums) {
  boolean boolarr[]=new boolean[nums.length]; 
        for(int i=0;i<nums.length;i++){
              if(boolarr[nums[i]]) return nums[i];

              boolarr[nums[i]]=true;
        }
         return -1;
    }
}

/*
 * INTERVIEW-STYLE EXPLANATION
 * ---------------------------
 * This solution finds the duplicate number using a boolean array
 * to track whether each value has been seen before.
 *
 * Key Idea:
 * Since all values are in the range [1, n], we can use a separate
 * boolean array where each index represents whether that number
 * has appeared. As we iterate through nums:
 *
 * - If we encounter a value that is already marked as true,
 *   that means we've seen this number before → it's the duplicate.
 *
 * Steps:
 * 1. Create a boolean array of size nums.length to track visits.
 * 2. Loop through each number in nums.
 * 3. For each number:
 *      • If boolarr[num] is true, return num (duplicate found).
 *      • Otherwise mark boolarr[num] = true.
 * 4. If no duplicate is found (theoretically impossible here),
 *    return -1.
 *
 * Complexity:
 * - Time: O(n), single pass through the array.
 * - Space: O(n), due to the added boolean array.
 *
 * Notes:
 * This method is simple and efficient, but does not satisfy the
 * more advanced interview constraint of "O(1) extra space".
 * The optimal space solution uses Floyd's Cycle Detection.
 */
