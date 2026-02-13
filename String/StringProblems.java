package String;

public class StringProblems {

    //Palindrome Check
    public static void isPalindrome(String st){
        boolean milse = true;
        for (int i = 0; i < st.length()/2; i++) {
            if(st.charAt(i) != st.charAt(st.length()- i - 1)){
                milse = false;
                break;
            }
        }
        if(milse){
            System.out.println("It is a palindrome.");
        }
        else {
            System.out.println("It is not a palindrome!");
        }
    }
    //Shortest Displacement
    public static void shortestDisplacement(String st){
        // Finding final coordinate
        int x = 0, y = 0;
        for (int i = 0; i < st.length(); i++) {
            if(st.charAt(i) == 'W' || st.charAt(i) == 'w'){
                x--;
            }
            else if(st.charAt(i) == 'E' || st.charAt(i) == 'e'){
                x++;
            }
            else if(st.charAt(i) == 'N' || st.charAt(i) == 'n'){
                y++;
            }
            else{
                y--;
            }
        }
        // Calculating displacement
        double displacement = Math.sqrt((x*x) + (y*y));
        System.out.println("the displacement: " + displacement);
    }
    //String Compression
    public static void stringCompression(String str){
        System.out.print("Compressed String: ");
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            char ch = str.charAt(i);

            while(i < str.length() - 1 && ch == str.charAt(i+1)){
                count++;
                i++;
            }
            System.out.print(ch);
            if(count > 1){
                System.out.print(count);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String st = "wneenesennn";
        String strCompress = "aaabbccccdd";
        String s = "abc";

        //Palindrome
        //isPalindrome(st);
        //Shortest displacement
        //shortestDisplacement(st);
        //String compression
        stringCompression(strCompress);
        //stringCompression(s);

        String str = "abc";
        str.concat("d");
        System.out.println(str);

        String str1 = new String("efg");
        str1.concat("h");
        System.out.println(str1);
        //String Builder
        StringBuilder sb = new StringBuilder("");
        for (char i = 'a'; i <= 'z'; i++) {
            sb.append(i);
        }
        System.out.println(sb);
    }
}
