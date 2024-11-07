package sortAlgorithm;

public class BubbleSort {
    public static void bubbleSortAscending(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n -1; i++){
            for (int j = 0; j <n - i - 1; j++){
                swap(arr, j, j+1);
                //Hoán đổi 2 phần tử
                int temp  = arr[j];
                arr[j] = arr[j +1];
                arr[j+1] =temp;
            }
        }
    }
    public static void swap (int[] arr, int a, int b){
        int temp = arr[a];
        arr[b] = arr[a];
        arr[a]=temp;
    }
    //Hàm sắp xếp từ lớn tới bé
    public static void bubbleSortDescending (int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++ ){
            for (int j = 0; j < n-i-1; j++){
                if(arr [j] < arr[j + 1]){
                    //Hoan doi 2 phan tu
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
