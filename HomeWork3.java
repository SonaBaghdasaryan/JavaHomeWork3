// Реализовать алгоритм сортировки слиянием на java.
// import java.util.Arrays;

// public class HomeWork3 {
// public static void mergeSort(int[] array, int left, int right) {
// if (right <= left)
// return;
// int mid = (left + right) / 2;
// mergeSort(array, left, mid);
// mergeSort(array, mid + 1, right);
// merge(array, left, mid, right);
// }
// public static void merge(int[] array, int left, int mid, int right) {
// int lengthLeft = mid - left + 1;
// int lengthRight = right - mid;
// int leftArray[] = new int[lengthLeft];
// int rightArray[] = new int[lengthRight];

// for (int i = 0; i < lengthLeft; i++)
// leftArray[i] = array[left + i];
// for (int i = 0; i < lengthRight; i++)
// rightArray[i] = array[mid + i + 1];

// int leftIndex = 0;
// int rightIndex = 0;

// for (int i = left; i < right + 1; i++) {
// if (leftIndex < lengthLeft && rightIndex < lengthRight) {
// if (leftArray[leftIndex] < rightArray[rightIndex]) {
// array[i] = leftArray[leftIndex];
// leftIndex++;
// } else {
// array[i] = rightArray[rightIndex];
// rightIndex++;
// }
// } else if (leftIndex < lengthLeft) {
// array[i] = leftArray[leftIndex];
// leftIndex++;
// } else if (rightIndex < lengthRight) {
// array[i] = rightArray[rightIndex];
// rightIndex++;
// }
// }
// }

// public static void main(String[] args) {
// int[] arr = { 11, 85, 1, 10, 12, 3, 8, 4, 6};
// System.out.println(Arrays.toString(arr)) ;
// mergeSort(arr, 0, arr.length - 1);
// System.out.println(Arrays.toString(arr));
// }
// }

// #3

// import java.util.ArrayList;
// import java.util.LinkedList;

// /* 1. Создать два списка LinkedList & ArrayList.
// Нужно создать два списка – LinkedList и ArrayList. */

// public class HomeWork3 {
// public static void main(String[] args) {
// System.out.println();
// System.out.println("""
// Задание №1: Нужно создать два списка – LinkedList и ArrayList.""");
// System.out.println();

// ArrayList<Object> arrayList = new ArrayList<>();
// System.out.println("ArrayList создан");
// System.out.println();

// LinkedList<Object> linkedList = new LinkedList<>();
// System.out.println("LinkedList создан");
// System.out.println();
// }

// }

// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.List;

// public class HomeWork3 {
// public static void main(String[] args) throws Exception {
// ArrayList arrayList = new ArrayList();
// insert10000(arrayList);
// get10000(arrayList);
// set10000(arrayList);
// remove10000(arrayList);

// LinkedList linkedList = new LinkedList();
// insert10000(linkedList);
// get10000(linkedList);
// set10000(linkedList);
// remove10000(linkedList);
// }

// public static void insert10000(List list) {
// for (int i = 0; i < 10000; i++) {
// list.add(i);
// }
// }

// public static void get10000(List list) {
// for (int i = 0; i < 10000; i++) {
// list.get(i);
// }
// }

// public static void set10000(List list) {
// for (int i = 0; i < 10000; i++) {
// list.set(i, i * 2);
// }
// }

// public static void remove10000(List list) {
// for (int i = 0; i < 10000; i++) {
// list.remove(0);
// }
// }
// }

// import java.util.ArrayList;
// import java.util.Date;
// import java.util.LinkedList;
// import java.util.List;
// public class HomeWork3 {
// public static void main(String[] args) {
// System.out.println(getTimeMsOfInsert(new ArrayList()));
// System.out.println(getTimeMsOfInsert(new LinkedList()));
// }

// public static long getTimeMsOfInsert(List list) {
// Date startDate = new Date();
// insert10000(list);
// Date endDate = new Date();
// return (endDate.getTime() - startDate.getTime());
// }

// public static void insert10000(List list) {
// for (int i = 0; i < 10000; i++) {
// list.add(0, new Object());
// }
// }
// }