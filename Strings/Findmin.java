public class Findmin {
    public static void main(String[] args) {
        int [] arr={7,21,14,5,56,373,3};
        System.out.println(min(arr));
    }
     static int min(int[] arr){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(ans>arr[i]){
                ans=arr[i];
            }
        }
        return ans;

     }
}
