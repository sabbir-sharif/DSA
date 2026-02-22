package Problem_Solving;

import java.util.Arrays;
import java.util.Collections;

public class LongestCommonPrefix_LC_14 {
    //Optimized
    public static String lobgestCommonPrefix(String strs[]){
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
    //Brute Force
    public static String solve(String strs[]) {
        String prefix = "";
        Arrays.sort(strs);
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if(strs[j].charAt(i) != strs[0].charAt(i)){
                    return prefix;
                }
            }
            prefix += strs[0].charAt(i);
        }
        return prefix;
    }
    public static void main(String[] args) {
        String strs[] = {"","",""};

        String str = solve(strs);
                //lobgestCommonPrefix(strs);

        System.out.println(str);
    }
}
