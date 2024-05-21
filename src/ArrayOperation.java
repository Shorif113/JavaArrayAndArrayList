import java.util.Random;

public class ArrayOperation{
  public static void main(String[] args) {
     Random random = new Random();
       int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
       }

        System.out.println("Every element at an even index:");
       for (int i = 0; i < numbers.length; i += 2) {
           System.out.print(numbers[i] + " ");
      }
      System.out.println();

      System.out.println("Every even element:");
     for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] % 2 == 0) {
               System.out.print(numbers[i] + " ");
           }
       }
       System.out.println();

       System.out.println("All elements in reverse order:");
       for (int i = numbers.length - 1; i >= 0; i--) {
          System.out.print(numbers[i] + " ");
       }
        System.out.println();

       System.out.println("Only the first and last element:");
       System.out.print(numbers[0] + " " + numbers[numbers.length - 1]);
      System.out.println();
   }
}
