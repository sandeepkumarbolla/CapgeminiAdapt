class BubbleSort 
{
    public int[] bubbleSort(int arr[])
    {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 1; j < (n - i); j++) 
            {
                if (arr[j - 1] > arr[j]) 
                {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    return arr;
    }
}
public class Assignment1Q8 {
    public static void main(String args[]) {
        int arr[] = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
        BubbleSort sort = new BubbleSort();
        sort.bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
