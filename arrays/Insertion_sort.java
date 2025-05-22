import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
         int arr[]={4,3,5,2,1,6};
        int n=arr.length;
        insertion(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void insertion(int[]arr,int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
}
