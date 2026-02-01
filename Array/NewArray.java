package Array;

public class NewArray {

    //Array as argument
    //any changes in the method array also changed in main array
    public static void arrayAsArgument(int newArray[]){
        for (int i = 0; i < 5; i++) {
            newArray[i] = newArray[i] + 1;
        }
    }

    public static void main(String[] args) {
        //creating an array
        //dataType arrayName[] = new dataType[size]
        int myArraay[] = new int[5];
        for (int i = 0; i < 5; i++) {
            myArraay[i] = i+1;
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(myArraay[i] + " ");
        }
        System.out.println();

        //dataType arrayName = {v1, v2, ...}
        int myArray_2[] = {6, 7, 8, 9, 10};

        for (int i = 0; i < 5; i++) {
            System.out.print(myArray_2[i] + " ");
        }
        System.out.println();

        arrayAsArgument(myArray_2);
        //After modify the array
        System.out.println("After Changes in myArray_2: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(myArray_2[i] + " ");
        }
        System.out.println();
    }
}
