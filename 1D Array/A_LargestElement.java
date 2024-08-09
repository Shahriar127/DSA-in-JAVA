public class A_LargestElement {
            public static int findLargest(int[] array) {
                int largest = array[0];
                for (int num : array) {
                    if (num > largest) {
                        largest = num;
                    }
                }
                return largest;
            }
        
            public static void main(String[] args) {
                int[] array = {3, 5, 7, 2, 8};
                System.out.println("Largest element: " + findLargest(array));
            }
        
        
}
