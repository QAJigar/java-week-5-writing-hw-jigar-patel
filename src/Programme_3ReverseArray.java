import java.util.Arrays;

public class Programme_3ReverseArray {
    /**
     * Write a Java program to reverse an array of integer values.
     */

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Original array : " + Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            int reverse = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = reverse;
        }
        System.out.println("Reverse array : " + Arrays.toString(array));
    }
}
