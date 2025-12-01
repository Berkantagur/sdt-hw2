import java.util.Random;

public class App {
    public static void main(String[] args) {
        int size = 10;
        int[] numbers = new int[size];

        Random random = new Random();



        System.out.println("DEBUG: this line will be reverted");





        // Fill with random values
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // 0–99
        }

        System.out.println("Random table values:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
    }
    
}
