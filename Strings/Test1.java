import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int sum=in.nextInt();
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int ans=pro(sum, arr);
        System.out.println(ans);
        in.close();   
    }
    static int pro(int sum ,int[] arr){
        int n=arr.length;
        Arrays.sort(arr);
        int t;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]<=sum){
                    t=arr[i]*arr[j];
                    return t;
                }
            }
        }
        return -1;
    }
}
