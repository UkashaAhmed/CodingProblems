class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int goal = target - numbers[right];
            if (numbers[left] == goal) return new int[]{++left, ++right};
            else if (numbers[left] < goal) left++;
            else right--;
        }

        return new int[]{-1, -1};
    }
}
