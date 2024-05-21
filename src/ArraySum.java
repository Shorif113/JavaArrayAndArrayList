public class ArraySum {

    public static int sumWithoutSmallest(int[] values) {

        if (values.length == 0) {
            return 0;
        }
        if (values.length == 1) {
            return 0;
        }

        int sum = 0;
        int smallest = Integer.MAX_VALUE;

        for (int value : values) {
            sum =sum + value;
            if (value < smallest) {
                smallest = value;
            }
        }

        return sum - smallest;
    }

    public static void main(String[] args) {
        int[] values = {5, 3, 8, 6, 2, 7};
        System.out.println("Sum without the smallest value: " + sumWithoutSmallest(values));
    }
}
