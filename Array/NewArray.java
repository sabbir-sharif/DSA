package Array;

public class NewArray {

    //Array as argument
    //any changes in the method array also changed in main array
    public static void arrayAsArgument(int newArray[]){
        for (int i = 0; i < 5; i++) {
            newArray[i] = newArray[i] + 1;
        }
    }

    //Lenear Search
    public static int linearSearch(int arr[], int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    //Largest Number
    public static int largestNumber(int arr[]){
        int largestNumber = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= largestNumber){
                largestNumber = arr[i];
            }
        }
        return largestNumber;
    }
    //Binary Search
    public static int binarySearch(int arr[], int key){
        //Define start and end index
        int start = 0, end = arr.length -1;
        //Compare
        while(start <= end){
            //define mid
            int mid = (start + end) / 2;
            //found
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;

    }
    //Reverse in Array
    public static void reverseInArray(int arr[]){
        int left = 0, right = arr.length - 1;
        int temp;
        while(left <= right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        //creating an array
        //dataType arrayName[] = new dataType[size]
        int myArraay[] = new int[5];
        for (int i = 0; i < 5; i++) {
            myArraay[i] = i+1;
        }
        for (int i = 0; i < 5; i++) {
            //System.out.print(myArraay[i] + " ");
        }
        //System.out.println();

        //dataType arrayName = {v1, v2, ...}
        int myArray_2[] = {2, 4, 6, 8, 10, 12, 14, 15};

        for (int i = 0; i < 5; i++) {
            //System.out.print(myArray_2[i] + " ");
        }
        //System.out.println();

        //arrayAsArgument(myArray_2);
        //After modify the array
        System.out.println("After Changes in myArray_2: ");
        for (int i = 0; i < 5; i++) {
            //System.out.print(myArray_2[i] + " ");
        }
        System.out.println();

        //linear Search
        int value = 8;
        int isFound = linearSearch(myArray_2, value);
        if(isFound == -1){
            //System.out.println(value + " doesn't exist");
        }
        else {
            //System.out.println(value + " is in index: " + isFound);
        }

        //Largest Number
        //System.out.println("Largest number: " + largestNumber(myArray_2));

        //Binary Search
        int value_binary = 12;
        int found = binarySearch(myArray_2, value_binary);
        if(found == -1){
            //System.out.println(value_binary + " doesn't exist");
        }
        else {
            //System.out.println(value_binary + " is in index: " + found);
        }

        //Reverse In Array
        reverseInArray(myArray_2);
    }
}
