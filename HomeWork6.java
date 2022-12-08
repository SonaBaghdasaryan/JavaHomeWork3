import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

// public class HomeWork6 {
//     public static void main(String[] args) {
//         int[] array = new int[1000];

//         for (int i = 0; i < array.length; i++) {
//             array[i] = ((int) (Math.random() * 25));
//             System.out.print(array[i]);
//         }

//     }
// }

public class HomeWork6 {
    public static void main(String[] args) {
        System.out.println(percentOfUnique(fillArray(1000)));
    }

    public static List<Integer> fillArray(int count) {
        ArrayList<Integer> result = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < count; i++) {
            result.add(rnd.nextInt(1, 24));
        }
        return result;
    }

    public static double percentOfUnique(List<Integer> list) {
        Set<Integer> integerSet = new HashSet<>(list);
        return integerSet.size() * 100.0 / list.size();
    }
}