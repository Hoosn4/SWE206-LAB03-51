// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Sorter {
    public static void main(String[] args) {
    }
    public static void selectionSort(int[] array) {
        // loop through the array from left to right
        for (int i = 0; i < array.length - 1; i++) {
            // find the index of the smallest element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // swap the smallest element with the current element
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

}