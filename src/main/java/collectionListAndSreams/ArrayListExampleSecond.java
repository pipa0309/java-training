package collectionListAndSreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExampleSecond {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("dej");
        StringBuilder str2 = new StringBuilder("abc");
        StringBuilder str3 = new StringBuilder("bcd");
        StringBuilder str4 = new StringBuilder("cde");
        StringBuilder[] arrStr = {str1, str2, str3, str4};
        List<StringBuilder> list = Arrays.asList(arrStr);
        System.out.println("list = " + list);

        for (int i = 0; i < arrStr.length; i++) {
            if (i == (arrStr.length - 1))
                arrStr[i].append('!');
        }
        System.out.println("list = " + list);

        System.out.println(list.size());
        System.out.println(list.get(3));

//        List<StringBuilder> sortedList = list.stream()
//                .sorted(Comparator.comparing(StringBuilder::toString))
//                .collect(Collectors.toList());
//        System.out.println();
//        System.out.println(sortedList + "\n");

        List<StringBuilder> arrayListSort = list.stream()
                .sorted(Comparator.comparing(StringBuilder::toString))
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("arrayListSort = " + arrayListSort);

        StringBuilder str5 = new StringBuilder("wer");
        arrayListSort.add(str5);
        System.out.println("arrayListSort = " + arrayListSort);

//        arrayListSort.removeAll(list);
//        System.out.println(arrayListSort + "\n");

        System.out.println(arrayListSort.containsAll(list));
        System.out.println(arrayListSort.contains(str5));

        System.out.println("arrayListSort = " + arrayListSort);
        StringBuilder[] arrFromList = arrayListSort.toArray(new StringBuilder[0]);
        for (StringBuilder stringBuilder : arrFromList) {
            System.out.print(stringBuilder + " ");
        }
    }
}
