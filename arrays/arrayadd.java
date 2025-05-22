public class arrayadd {
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9};
        int n=arr.length;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n-1;i++){
            sum1+=arr[i];
        }
        for(int i=1;i<n;i++){
            sum2+=arr[i];
        }
        System.out.println(sum1);
        System.out.println(sum2);
        
    }
}
