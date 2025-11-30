class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
HashMap<String, List<String>> map=new HashMap<>();
for(String s:strs){
	char[]x=s.toCharArray();
	Arrays.sort(x);
	String d = new String(x);
	
	if(!map.containsKey(d)){
		map.put(d,new ArrayList<>());
	}
	map.get(d).add(s);
	}
	return new ArrayList<>(map.values());
}
    
}
I iterate over the array of strings.
For each string:

I convert it to a char array and sort it

That sorted string becomes my key

I use a HashMap where the key is this sorted string and the value is a list of original strings that match this key

If the key already exists, I append the current word to that list.
If not, I create a new list starting with that word.

At the end, the map’s values represent all the grouped anagrams, so I return them.”
