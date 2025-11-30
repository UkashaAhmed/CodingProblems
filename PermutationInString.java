class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length() || s2.length() == 0) return false;
        if (s1.length() == 0) return true;

        int[] a1 = new int[26];
        int[] a2 = new int[26];

        // Initialize frequency arrays
        for (int i = 0; i < s1.length(); i++) {
            a1[s1.charAt(i) - 'a']++;
            a2[s2.charAt(i) - 'a']++;
        }

        // Sliding window
        for (int i = s1.length(); i < s2.length(); i++) {
            if (Arrays.equals(a1, a2)) return true;
            a2[s2.charAt(i - s1.length()) - 'a']--;
            a2[s2.charAt(i) - 'a']++;
        }

        // Final window check
        return Arrays.equals(a1, a2);
    }
}
