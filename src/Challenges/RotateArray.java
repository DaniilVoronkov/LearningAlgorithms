package Challenges;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateArray(new int[]{1, 2, 3, 4, 5, 6})));
    }

    public static int[] rotateArray(int[] arr) {
        int first = arr[0];
        for(int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = first;

        return arr;
    }
}
