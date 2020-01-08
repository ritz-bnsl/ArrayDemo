/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 08/01/20
 *   Time: 3:46 PM
 */

package array;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] agrs) {
        int[] integers = new int[10];
        printArrayValues(integers);
        initialIntegerArray(integers);
        printArrayValues(integers);
        boolean response = searchInArray(integers, 22);
        if (response) {
            System.out.println("Value found");
        } else {
            System.out.println("Value not found");
        }
        System.out.println(response ? "value found" : "value not found");
    }

    /**
     * this method can search a integer value in integer array
     *
     * @param array an integer array
     * @param value the value to be searched
     * @return True if the (@param value) is found in the (@param array)
     */
    public static boolean searchInArray(int[] array, int value) {
        boolean response = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                response = true;
                break;
            }
        }
        return response;
    }

    public static void printArrayValues(int[] integers) {
        System.out.println(Arrays.toString(integers));
    }

    public static void initialIntegerArray(int[] integerArray) {
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = (i + 1);
        }
    }
}

