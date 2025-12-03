class Solution {
    public void reverseString(char[] s) {
        int start=0;
        int end = s.length-1;
        while(start<end){
          char temp= s[start];
          s[start]=s[end];
          s[end]=temp;
          start++;
          end--;
        }
    }
}
/**
 * Reverses a character array in-place using the two-pointer technique.
 *
 * Algorithm:
 * - Initialize two pointers: left = 0, right = chars.length - 1.
 * - While left < right:
 *      1. Store chars[left] in a temporary variable.
 *      2. Assign chars[left] = chars[right].
 *      3. Assign chars[right] = temp.
 *      4. Move the pointers inward (left++ and right--).
 *
 * This approach reverses the array in-place with:
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
