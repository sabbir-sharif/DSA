package Array;

public class ValidPalindrome_LC_125 {
    public static boolean validPalindrome(String s){
        StringBuilder newString = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||
                    (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') ||
                    (s.charAt(i) >= '0' && s.charAt(i) <= '9'))
            {
                newString.append(s.charAt(i));
            }
        }
        String str = newString.toString();
        String newStr = str.toLowerCase();

        boolean isPalindrome = true;
        int start = 0, end = newStr.length()-1;
        for (int i = 0; i < newStr.length()/2; i++) {
            if(newStr.charAt(start) != newStr.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
    public static void main(String[] args) {
        String s = " ";

        System.out.println(validPalindrome(s));
    }
}
