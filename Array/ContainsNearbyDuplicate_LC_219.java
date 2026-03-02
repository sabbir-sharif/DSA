package Problem_Solving;

import java.util.HashMap;
import java.util.Map;

public class ContainsNearbyDuplicate_LC_219 {
    //Hashmap:
    //Number -> Last seen index
    //If containsKey: prevIndex = index (value of the key)
    //every value should be in map as key (not only when mismatch)
    public static boolean containsNearbyDuplicate(int arr[], int k){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                int prevIndex = map.get(arr[i]);
                if((i - prevIndex) <= k){
                    return true;
                }
            }
            map.put(arr[i], i);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        int k = 3;

        System.out.println(containsNearbyDuplicate(arr, k));
    }
}
