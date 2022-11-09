import java.util.Arrays;
import java.util.Random;

public class Massive2 {
    public static void main(String[] args) {

        int[] arr = generateRandomArray();

        System.out.println(Arrays.toString(arr));

        System.out.println("\n");

        //Massive HomeWork 2
        //Task 1
        int spendingPerMonth = 0;
        for (int i : arr) {
            spendingPerMonth += i;
        }
        System.out.println("Сумма трат за месяц составила " + spendingPerMonth + " рублей.");

        System.out.println("\n");

        //Task 2
        int min = arr[0];
        int max = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            } else if (j > max) {
                max = j;

            }
        }
        System.out.print("Минимальная сумма трат за день составила " + min + " рублей. ");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");

        System.out.println("\n");

        //Task 3
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum / arr.length + " рублей");

        System.out.println("\n");

        //Task 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i  = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }


    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}

//by Igor