public class Array_largest_secondLargest {
    public static void main(String[] args) {
        int i, j;
        int[] arr = {2, 1, 9, 7, 8, 4, 3, 5};
        for (i = 0; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array elements are : ");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int arrayLength = arr.length;
        System.out.println("\n" + "Largest element is : " + arr[arrayLength - 1]);
        System.out.println("Largest element is : " + arr[arrayLength - 2]);
    }
}