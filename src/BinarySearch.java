import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int [] firstArr = {1, 2, 3, 4, 6, 7, 8, 10};

        int [] secondArr = new int[10];
        for(int i = 0; i < 10; i++) {
            secondArr[i] = (int) (Math.random() * 20 + 1    );
        }

        System.out.println(Arrays.toString(secondArr));

        System.out.println(isElementPresented(6, firstArr));

        System.out.println(isElementPresented(8, secondArr));

        System.out.println(isElementPresented(30, firstArr));

    }

    public static boolean isElementPresented(int element, int[] arr) {
        if(arr.length == 0) {
            return false;
        }
        int first = 0;
        int last = arr.length - 1;
        Arrays.sort(arr);

        while (first <= last) {
            int mid = (first + last);
            if(element == arr[mid]) return true;
            if(element < arr[mid]) last = mid - 1;
            if(element > arr[mid]) first = mid + 1;
        }

        return false;
    }
}
