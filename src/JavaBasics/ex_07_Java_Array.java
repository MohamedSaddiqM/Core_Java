package JavaBasics;

import java.util.Arrays;

public class ex_07_Java_Array {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,10};
        int arr1[] = {4,5,6,7,1};
        Arrays.sort(arr);
        System.out.println("Length of the array:" + arr.length);
        System.out.println("Sorted array:" + Arrays.toString(arr));

        if (arr.equals(arr1)){
            System.out.println("Arrays are equal");
        }
        else {
            System.out.println("Arrays are not equal");
        }
    }
}
