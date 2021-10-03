import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arrayLimit = scan.nextInt();
        int[] intArray = new int[arrayLimit];

        for (int i = 0; i < arrayLimit; i++) {
            intArray[i] = scan.nextInt();
        }

        mergeSort(intArray, 0, intArray.length);

        for (int finalResult : intArray) {
            System.out.println(finalResult);
        }

    }

    public static void mergeSort(int[] inputArray, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(inputArray, start, mid);
        mergeSort(inputArray, mid, end);
        merge(inputArray, start, mid, end);
    }

    public static void merge(int[] inputArray, int start, int mid, int end) {
        if (inputArray[mid - 1] <= inputArray[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = inputArray[i] <= inputArray[j] ? inputArray[i++] : inputArray[j++];
        }
        System.arraycopy(inputArray, i, inputArray, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, inputArray, start, tempIndex);
    }

}
