package lesson12;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class HW1 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("dgdfgfg");
        strings.add("aaaaaaaaaaa");
        strings.add("fsdfsdvergreg");
        strings.add("aaaaaaaaaaa");
        strings.add("rr");
        strings.add("bbbbbbbbbb");
        strings.add("bbbbbbbbbb");
        System.out.println(strings);

        System.out.println(strings.stream().distinct().filter(s -> s.length() >= 8 && s.length() <= 15).sorted().collect(Collectors.toList()));
    }
}
