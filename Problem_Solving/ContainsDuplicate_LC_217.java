package Problem_Solving;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_LC_217 {
    public static boolean containsDuplicate(int arr[]){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        if(arr.length == set.size()){
            return false;
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,1};

        System.out.println(containsDuplicate(arr));
    }
}
