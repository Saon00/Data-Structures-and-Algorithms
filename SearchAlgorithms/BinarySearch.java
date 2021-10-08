import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("------- Binary Search -------");
        System.out.print("How many Arrays do you want: ");
        int num = scan.nextInt();
        int[] intArray = new int[num];

        System.out.print("Input your " + num + " Numbers: ");
        for (int i = 0; i < num; i++) {
            intArray[i] = scan.nextInt();
        }
        System.out.print("Which Number do you want to search: ");
        int key = scan.nextInt();

        System.out.println(binarySearch(intArray, key));

    }

    public static int binarySearch(int[] array, int value) {
        int start = 0, end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == value) return mid;
            else if (array[mid] < value) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}

