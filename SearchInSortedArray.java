class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) return mid;

            // Check if left part is sorted
            if (nums[mid] >= nums[start]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1; // move left
                } else {
                    start = mid + 1; // move right
                }
            } 
            // Right part is sorted
            else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1; // move right
                } else {
                    end = mid - 1; // move left
                }
            }
        }

        return -1;
    }
}

/**
 * Interview-Style Explanation:
 *
 * Problem:
 * We are given a rotated sorted array (e.g., [4,5,6,7,0,1,2]) and a target value.
 * We must find the index of the target in O(log n) time.
 *
 * Key Insight:
 * Even though the array is rotated, ONE HALF of the array is always sorted.
 * During each step of binary search:
 *
 *      - Either the left half (start → mid) is sorted
 *      - Or the right half (mid → end) is sorted
 *
 * Once we identify which half is sorted, we can decide whether the target
 * lies inside that sorted portion. If it does, we search there; if not,
 * we search the other half. This keeps our time complexity at O(log n).
 *
 * Step-by-Step Logic:
 *
 * 1. Perform normal binary search (start, end, mid).
 * 2. If nums[mid] == target → return mid.
 *
 * 3. Determine which side is sorted:
 *
 *    A. Left side is sorted:
 *       if (nums[mid] >= nums[start]):
 *             If target lies between nums[start] and nums[mid],
 *                 move search to the left half (end = mid - 1).
 *             Otherwise, search right half (start = mid + 1).
 *
 *    B. Right side is sorted:
 *       else:
 *             If target lies between nums[mid] and nums[end],
 *                 search the right half (start = mid + 1).
 *             Otherwise, search left half (end = mid - 1).
 *
 * 4. If search ends without finding the target → return -1.
 *
 * Why This Works:
 * - Even though the entire array isn't sorted, one half ALWAYS is.
 * - Each iteration cuts the search space in half.
 * - Ensures O(log n) performance.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 *
 */
