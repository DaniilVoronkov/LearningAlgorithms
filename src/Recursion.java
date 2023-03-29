import java.util.ArrayList;

import java.util.List;


public class Recursion {
    static int i = 0;
    static int j = 0;
    public static void main(String[] args) {
        System.out.println(factor(3));

        System.out.println(sumOfAllElements(new ArrayList<>(){{add(1);add(2); add(3); add(4);}}));

        System.out.println(sortTheListWithQuickSort(new ArrayList<>(){{add(56); add(60); add(21); add(10); add(100);}}));
        System.out.println(i);

        System.out.println(mergeSort(new ArrayList<>(){{add(56); add(60); add(21); add(10); add(100);}}));
        System.out.println(j);
    }


    public static int factor(int base) {
        if(base == 1) return 1;
        else return base * factor(base - 1);
    }

    public static int sumOfAllElements(List<Integer> list) {
        if(list.isEmpty()) return 0;
        else {
            return list.remove(0) + sumOfAllElements( list);
        }
    }

    //quick sort
    public static List<Integer> sortTheListWithQuickSort(List<Integer> list) {
        i++;
        if(list.isEmpty()) {
            return list;
        }
        List<Integer> sorted;
        int median = list.get(0);
        List<Integer> lesser = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        for(int i = 1; i < list.size(); i++) {
            if(list.get(i) < median) lesser.add(list.get(i));
            if(list.get(i) >= median) greater.add(list.get(i));

        }

        lesser = sortTheListWithQuickSort(lesser);
        lesser.add(median);
        greater = sortTheListWithQuickSort(greater);
        lesser.addAll(greater);
        sorted = lesser;


        return sorted;
    }

    public static List<Integer> mergeSort(List<Integer> list) {
        j++;
        if(list.isEmpty()) {
            return list;
        }
        List<Integer> sorted;
        int middle = list.size()/2;
        int median = list.get(middle);
        List<Integer> lesser = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            if(i != middle) {
                int comparisonElement = list.get(i);
                if(comparisonElement < median) lesser.add(comparisonElement);
                else greater.add(comparisonElement);
            }

        }

        lesser = mergeSort(lesser);
        lesser.add(median);
        greater = mergeSort(greater);
        lesser.addAll(greater);
        sorted = lesser;


        return sorted;
    }

}
