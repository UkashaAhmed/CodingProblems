class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        int r=s.length()-1;

        while(l<r){
            char left=s.charAt(l);
            char right=s.charAt(r);
             if(!Character.isLetterOrDigit(left)){
                l++;
            }    
            else if(!Character.isLetterOrDigit(right)){
                r--;
            }     
            else{
                if(Character.toLowerCase(left)!=Character.toLowerCase(right)){
                    return false;
                }
                 l++;
            r--;
            }
           
       }
       return true;
    }
}
“I use two pointers: one at the beginning (left) and one at the end (right).
While left < right, I skip any characters that are not letters or numbers.
Then I compare the lowercase version of both characters.
If they don’t match, I return false immediately.
If they do match, I move left forward and right backward.
If the whole loop finishes without mismatches, I return true.”
