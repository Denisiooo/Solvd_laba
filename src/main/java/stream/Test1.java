package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("goodbye");
        list.add("good night");
        list.add("good morning");
        list.add("nice to meet you");

        List<Integer> list1 = list.stream().map(el->el.length()).collect(Collectors.toList());
        System.out.println(list1);
    }
}
