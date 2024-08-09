public class B_BinarySearch {
      public static int binarySearch(int[] array, int target) {
            int left = 0;
            int right = array.length - 1;
            
            while (left <= right) {
                int mid = left + (right - left) / 2;
                
                if (array[mid] == target) {
                    return mid; // Target found at index mid
                }
                
                if (array[mid] < target) {
                    left = mid + 1; // Search in the right half
                } else {
                    right = mid - 1; // Search in the left half
                }
            }
            
            return -1; // Target not found
        }
    
        public static void main(String[] args) {
            int[] array = {1, 2, 5, 7, 9, 12, 22, 34, 64, 90};
            int target = 7;
            int result = binarySearch(array, target);
            if (result != -1) {
                System.out.println("Element found at index: " + result);
            } else {
                System.out.println("Element not found.");
            }
        }
}
