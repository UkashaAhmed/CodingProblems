class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int x=0;
        int max=0;
        HashSet<Character> t=new HashSet<Character>();
        while(x<s.length()){
            if(!t.contains(s.charAt(x))){
                t.add(s.charAt(x));
                x++;
                max=Math.max(t.size(),max);
            }
            else{
                t.remove(s.charAt(start));
                start++;
            }
        }
        return max;
        
    }
}
