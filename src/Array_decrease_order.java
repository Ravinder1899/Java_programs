public class Array_decrease_order {
    public static void main(String args[]) {
        int arr[] = {2, 9, 3, 1, 6, 16, 43, 5, 12};
        int i, j;
        for(i = 0; i< arr.length;i++){
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("sorted array : ");
        for(i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
