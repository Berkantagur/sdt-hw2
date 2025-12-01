import java.util.Random;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int size = 10;
        int[] numbers = new int[size];

        Random random = new Random();

        // Fill the array with random values
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // values between 0 and 99
        }

        System.out.println("Original numbers from friend:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Reverse the sorted array to get descending order
        for (int i = 0; i < numbers.length / 2; i++) {
            int tmp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = tmp;
        }

        System.out.println("\nArray values in descending order:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
    }
}
