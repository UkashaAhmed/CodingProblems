class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }
}


“I use the binary search algorithm, which works on a sorted array.
I start by setting two pointers: left at the start and right at the end of the array.
Inside a loop, I compute mid = (left + right) // 2.

I compare nums[mid] with the target:

If nums[mid] equals the target, I return the index.

If nums[mid] is greater than the target, that means the target can only be in the left half, so I move right to mid - 1.

If nums[mid] is less than the target, I move left to mid + 1.

I repeat this until left goes above right.
If that happens, it means the target doesn’t exist in the array, so I return -1.

This runs in O(log n) time.”
