/* Md. Saon Sikder
 * 9:07 PM
 * 13 Nov 2020
 * Dhaka, Bangladesh.
 */
# O9n^2)

import java.util.*;
public class MainClass_1118 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		for (int firstIndex = 1; firstIndex < intArray.length; firstIndex++) {
			int newElement = intArray[firstIndex];
			int i;

			for (i = firstIndex; i > 0 && intArray[i - 1] > newElement; i--) {
				intArray[i] = intArray[i - 1];
			}
			intArray[i] = newElement;
		}

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
}
