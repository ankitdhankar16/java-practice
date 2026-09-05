package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambaExpressionComparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println("List:" + list);
        //use of Lamba funtion
        Collections.sort(list,(a,b)->b-a);
        System.out.println("List after sorting :" + list);
        //OUTPUT:
        //List:[1, 2, 3, 4, 5, 6, 7]
        //List after sorting :[7, 6, 5, 4, 3, 2, 1]

    }
}
