import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * HomeWork5
 */
public class HomeWork5 {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Input the text");
            String[] str = scan.nextLine().split(" ");
            System.out.println("Array: " + Arrays.toString(str));
            Arrays.sort(str, Comparator.comparing(String::length));
            System.out.println("Sorted Array: " + Arrays.toString(str));
        }
    }
}