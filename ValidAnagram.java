class Solution {
    public boolean isAnagram(String s, String t) {
        char[]x=s.toCharArray();
        char[]y=t.toCharArray();
    Arrays.sort(x);
    Arrays.sort(y);
    String z=new String(x);
    String v=new String(y);
    if(z.equals(v)){
        return true;
    }
    return false;
    }
    
}

If the two strings have different lengths → immediately return false.

Create a frequency map (or an array of size 26 if input is only lowercase).

Loop through the first string and increment the count for each character.

Loop through the second string and decrement the count for each character.

If all counts end at zero, then both strings have identical character frequencies → return true.

If any count is non-zero → return false.


Time: O(n)
