public class bubble_1 {
    public static void main(String[] args) {
        int arr[]={3,5,1,4,6,9,8};
        int n=arr.length;
        bubble(arr,n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();

    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void bubble(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n-i;j++){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }
            }
        }
    }
}
