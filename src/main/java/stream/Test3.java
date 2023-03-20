package stream;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);

        int res = list.stream().reduce((accum, elem)->accum*elem).get();
        System.out.println(res);

        System.out.println(list.stream().distinct().count());
    }
}
