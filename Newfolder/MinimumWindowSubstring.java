class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        int[] need = new int[128];
        for (char c : t.toCharArray()) need[c]++;

        int left = 0;
        int count = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {
            char cRight = s.charAt(right);

            if (need[cRight] > 0) count--;
            need[cRight]--;

            while (count == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char cLeft = s.charAt(left);
                need[cLeft]++;
                if (need[cLeft] > 0) count++;
                left++;
            }
        }

        return (minLen == Integer.MAX_VALUE) ? "" : s.substring(start, start + minLen);
    }
}
