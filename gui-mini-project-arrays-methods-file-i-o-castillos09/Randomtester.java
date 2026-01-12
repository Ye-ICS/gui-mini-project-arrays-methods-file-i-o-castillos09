import java.util.Arrays;
import java.util.Random;

public class Randomtester {
    
public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original array: " + Arrays.toString(numbers));

        shuffleArray(numbers);

        System.out.println("Shuffled array: " + Arrays.toString(numbers));
    }

    public static void shuffleArray(int[] arr) {
        Random rnd = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Swap arr[i] and arr[index]
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }







}
