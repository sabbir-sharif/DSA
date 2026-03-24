package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram_LC_242 {
    //Time: O(n log n)
    //Space: O(n) -> extra array
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        char s1[] = s.toCharArray();
        char s2[] = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        if(Arrays.equals(s1,s2)){
            return true;
        }
        else {
            return false;
        }
    }

    // Optimal
    //Time: O(n)
    //Space: O(1)
    public static boolean validAngram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        int count[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count){
            if(c != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";

        isAnagram(s, t);
    }
}
