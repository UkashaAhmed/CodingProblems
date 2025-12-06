class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while(left < right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return nums[left];
    }
}

/**
 * Interview-Style Explanation:
 *
 * Problem:
 * We are given a rotated sorted array (e.g., [4,5,6,7,0,1,2]) and must find
 * the minimum element in O(log n) time. The rotation creates a "pivot"
 * where the sorted order breaks, and that pivot is where the minimum lies.
 *
 * Key Insight:
 * Even though the array is rotated, one half of the array is always sorted.
 * The minimum element will always be located in the *unsorted* half.
 * We use binary search and repeatedly shrink toward the unsorted side.
 *
 * Core Logic (Binary Search):
 *
 * 1. Initialize pointers: left at start, right at end.
 *
 * 2. While left < right:
 *        Compute mid.
 *
 *        A. If nums[mid] < nums[right]:
 *             This means the right half (mid → right) is sorted.
 *             Therefore, the minimum cannot be in that sorted portion.
 *             The minimum is either at mid or somewhere to the left.
 *             → Move right = mid.
 *
 *        B. Else (nums[mid] > nums[right]):
 *             This means the rotation pivot (and the minimum) is to the right of mid.
 *             The left half is sorted, so discard it.
 *             → Move left = mid + 1.
 *
 * 3. When left == right:
 *        Both pointers point to the minimum element.
 *
 * Return nums[left].
 *
 * Why This Works:
 * By checking nums[mid] against nums[right], we can determine which half
 * of the array is sorted. We always eliminate the sorted half and move
 * toward the pivot—the only place where the smallest element can be.
 * This guarantees O(log n) time.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
