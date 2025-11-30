class Solution {
    public boolean isPalindrome(int x) {
        String[] num = String.valueOf(x).split("");

        for (int i = 0; i < num.length / 2; i++) {
            if (!num[i].equals(num[num.length - 1 - i])) {
                return false;
            }
        }

        return true;
    }
}

/**
 * Valid Palindrome - Two Pointer Approach
 *
 * Steps:
 * 1. Use two pointers: left at the start, right at the end of the string.
 * 2. While left < right:
 *      - Skip characters that are not letters or digits.
 *      - Compare the lowercase versions of s.charAt(left) and s.charAt(right).
 *      - If they are not equal, return false.
 *      - If they match, move left++ and right--.
 * 3. If the loop completes without mismatches, the string is a palindrome.
 *
 * Time Complexity: O(n) — each character is visited at most once.
 * Space Complexity: O(1) — no additional data structures are used.
 */

