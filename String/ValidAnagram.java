package String;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t){
        boolean flag = false;
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                int value = map.get(s.charAt(i));
                value++;
                map.put(s.charAt(i), value);
            }
            else {
                map.put(s.charAt(i), 1);
            }
        }

        return flag;
    }
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";

        isAnagram(s, t);
    }
}
