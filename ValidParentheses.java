class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

/**
 * Valid Parentheses Algorithm
 *
 * To check whether a string has valid parentheses, I use a stack.
 *
 * Steps:
 * 1. Iterate through each character in the string.
 * 2. If the character is an opening bracket: '(', '{', '['
 *      - Push the corresponding closing bracket onto the stack.
 * 3. If the character is a closing bracket:
 *      - If the stack is empty or the top of the stack does NOT match
 *        the current character, return false.
 *      - Otherwise, pop from the stack.
 * 4. After processing all characters, return true only if the stack is empty.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
