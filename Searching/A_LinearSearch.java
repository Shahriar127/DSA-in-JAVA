public class A_LinearSearch {
      public static int linearSearch(int[] array, int target) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == target) {
                    return i; 
                }
            }
            return -1; 
        }
    
        public static void main(String[] args) {
            int[] array = {5, 3, 7, 1, 9, 2};
            int target = 7;
            int result = linearSearch(array, target);
            if (result != -1) {
                System.out.println("Element found at index: " + result);
            } else {
                System.out.println("Element not found.");
            }
        }
}
