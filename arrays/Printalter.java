public class Printalter {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int n=arr.length;
        alter(arr,n);
    }
    static void alter(int[] arr,int n){
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]+" ");
            }
        }
    }
}
