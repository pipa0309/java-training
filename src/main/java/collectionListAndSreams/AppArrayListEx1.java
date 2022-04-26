package collectionListAndSreams;

import java.util.ArrayList;
import java.util.List;

public class AppArrayListEx1 {
    public static void main(String[] args) {
        List<Integer> integers = getIntegers();
        printOriginList(integers);
        List<Integer> arrIntegers = new ArrayList<>(integers);
        arrIntegers.add(9, 10);
        System.out.println(arrIntegers);
        System.out.println(arrIntegers.size());
//        arrIntegers.forEach(System.out::println);
        arrIntegers.removeIf(integer -> integer % 2 == 1);
        System.out.println(arrIntegers);
        System.out.println(arrIntegers.get(2));
        for (int i = 0; i < arrIntegers.size(); i++) {
            System.out.println(arrIntegers.get(i));
        }
        arrIntegers.set(1, 4);
        arrIntegers.set(3, 8);
        arrIntegers.removeIf(integer -> integer.equals(8)); // [2, 4, 6, 10]
        System.out.println(arrIntegers);
    }

    private static List<Integer> getIntegers() {
        return List.of(2, 5, 3, 9, 8, 1, 6, 7, 4);
    }

    private static void printOriginList(List<Integer> integers) {
        System.out.print("origin list: [");
        integers.forEach(System.out::print);
        System.out.print("]");
        System.out.println();

    }
}
