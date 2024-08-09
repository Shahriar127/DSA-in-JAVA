public class D_ReverseArray {
      public static void reverse(int[] array) {
            int left = 0;
            int right = array.length - 1;
            while (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
    
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
            reverse(array);
            for (int num : array) {
                System.out.print(num + " ");
            }
        }
}
