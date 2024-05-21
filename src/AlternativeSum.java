import java.util.Scanner;

public class AlternativeSum {

    public static int alternatingSum(int[] values) {
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            if (i % 2 == 0) {
                sum += values[i];
            } else {
                sum -= values[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] values = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }

        System.out.println("The alternating sum is: " + alternatingSum(values));

        scanner.close();
    }
}
