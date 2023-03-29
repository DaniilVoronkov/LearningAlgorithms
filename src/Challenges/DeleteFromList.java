package Challenges;

import java.util.LinkedList;
import java.util.List;

public class DeleteFromList {
    public static void main(String[] args) {
        List<Integer> testList = new LinkedList<>() {{add(1); add(2); add(4); add(5);}};

        testList = removeFromList(testList, 2);
        System.out.println(testList);
    }

    public static List<Integer> removeFromList(List<Integer> list, int index) {
        if(index < 0 || list.isEmpty()) {
            return null;
        }
        list.remove(list.size() - index);

        return list;
    }
}
