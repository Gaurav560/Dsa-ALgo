package dsa;



import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {342, 2, 6, 1, 9, 0,-64};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        int n=arr.length;
        for (int i = 0; i <n-1 ; i++) {
            for (int j = 0; j <n-i-1 ; j++) {
                int temp=0;
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
