/*
242. Valid Anagram


Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false


Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.


 */

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();

        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(!map2.containsKey(t.charAt(i))){
                map2.put(t.charAt(i),1);
            }else{
                map2.put(t.charAt(i),map2.get(t.charAt(i))+1);
            }
        }

        if(map.equals(map2)){
            return true;
        }else{
            return false;
        }
    }
}