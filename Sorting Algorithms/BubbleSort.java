# O(n^2)

import java.util.Scanner;

public class MainClass_1118 {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many numbers you want to sort: ");
		int arrayLimit = scanner.nextInt();
		int[] intArray = new int[arrayLimit];
		
		for(int i = 0;i<arrayLimit;i++) {
			intArray[i] = scanner.nextInt();
		}
		
		for(int lastIndex = intArray.length-1; lastIndex > 0; lastIndex--) {
			for(int i=0; i < lastIndex; i++) {
				if(intArray[i] > intArray[i+1]) {
					swap(intArray, i, i+1);
				}
			}
		}
		System.out.print("Bubble Sort: ");
		for(int i = 0; i < intArray.length;i++) {
			System.out.print(intArray[i]+" ");
		}
	}
	
	public static void swap(int[] array, int i, int j) {
		if(i==j) {
			return;
		}
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}
}