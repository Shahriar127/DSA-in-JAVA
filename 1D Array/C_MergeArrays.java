public class C_MergeArrays {

      public static int[] merge(int[] array1, int[] array2) {
          int[] merged = new int[array1.length + array2.length];
          System.arraycopy(array1, 0, merged, 0, array1.length);
          System.arraycopy(array2, 0, merged, array1.length, array2.length);
          return merged;
      }
  
      public static void main(String[] args) {
          int[] array1 = {1, 3, 5};
          int[] array2 = {2, 4, 6};
          int[] merged = merge(array1, array2);
          for (int num : merged) {
              System.out.print(num + " ");
          }
      }
  }
  