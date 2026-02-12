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
    public static void main(String[] args) {
        String st = "wneenesennn";

        //Palindrome
        isPalindrome(st);
        //Shortest displacement
        shortestDisplacement(st);

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
