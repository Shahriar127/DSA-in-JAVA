public class B_Sum_Of_Odd_Even_Numbers {
      public static int sumOdd(int[] array) {
            int sum = 0;
            for (int num : array) {
                if (num % 2 != 0) {
                    sum += num;
                }
            }
            return sum;
        }
    
        public static int sumEven(int[] array) {
            int sum = 0;
            for (int num : array) {
                if (num % 2 == 0) {
                    sum += num;
                }
            }
            return sum;
        }
    
        public static void main(String[] args) {
            int[] array = {3, 5, 7, 2, 8};
            System.out.println("Sum of odd numbers: " + sumOdd(array));
            System.out.println("Sum of even numbers: " + sumEven(array));
        }
}
