import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int arr[]={4,3,5,2,1,6};
        int n=arr.length;
        selection(arr,n);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int getmax(int[] arr,int start, int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void selection(int[] arr,int n){
        for(int i=0;i<n;i++){
            int last=n-i-1;
            int maxindex=getmax(arr,0,last);
            swap(arr,maxindex,last);
        }
    }
}
