package LengthOfLongestSubstring;

import java.util.HashMap;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i, j, res = 0;
        for (i=0, j=0; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j))) {
                //更新i的位置
                i = Math.max(map.get(s.charAt(j)), i);
            }
            res = Math.max(res, j-i+1);
            map.put(s.charAt(j), j+1);
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring(s));
    }
}
