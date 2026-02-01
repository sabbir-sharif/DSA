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
        int myArray_2[] = {6, 7, 14, 45, 10};

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
        System.out.println("Largest number: " + largestNumber(myArray_2));
    }
}
