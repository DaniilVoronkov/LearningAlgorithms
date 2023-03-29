import java.util.ArrayList;
import java.util.List;

public class ChoiceSort {
    public static void main(String[] args) {

        List<Integer> testList = new ArrayList<>();
        List<Integer> streamSortList = new ArrayList<>();
        List<Integer> sortFunc = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            testList.add((int) (Math.random() * 40 + 1));
            streamSortList.add((int) (Math.random() * 40 + 1));
            sortFunc.add((int) (Math.random() * 40 + 1));
        }

        System.out.println(testList);

        System.out.println(getSortedList(testList));

        System.out.println(streamSortList);

        System.out.println(streamSortList.stream().sorted().toList());

        System.out.println("Sort func");

        System.out.println(sortFunc);

        sortFunc.sort(Integer::compareTo);

        System.out.println(sortFunc);

        System.out.println(sortFunc.stream().max(Integer::compareTo).get());

        System.out.println(sortFunc.stream().min(Integer::compareTo).get());

        System.out.println(sortFunc.stream().filter(x -> x % 2 == 0).toList());

    }

    public static int getIndexOfSmallestNumber(List<Integer> list) {
        int smallest = list.get(0);
        int index = 0;
        for(int i = 1; i < list.size(); i++) {
            if(list.get(i) < smallest) {
                smallest = list.get(i);
                index = i;
            }
        }
        return index;
    }

    //With big O notation the complexity is O(n logn)
    public static List<Integer> getSortedList(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>();
        System.out.println(list.size());
        while (!list.isEmpty()) {

            sortedList.add(list.remove(getIndexOfSmallestNumber(list)));
            System.out.println("List size is: " + list.size());
        }

        return sortedList;
    }
}
