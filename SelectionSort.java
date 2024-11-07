package sortAlgorithm;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i =0; i < n - 1; i++){
            int minIndex = i;
            for (int j = i+1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                     minIndex = j;
                }
            }
            //Hoán đổi ptu nhỏ nhất tìm được vơí ptu đầu tiên của đoạn chưa sắp xếp
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
