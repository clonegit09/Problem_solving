import java.util.*;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);   
        int[] arr={4,7,8,11,21,27,31,40,43,51};
        int target=s.nextInt();
        int ans=orderagnosticBS(arr, target);
        System.out.println(ans);
        s.close();
    }
    static int orderagnosticBS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        boolean check = arr[start] <arr[end];

        while (start<=end) {
            
            int mid=start+(end-start)/2;
            //best case
            if(arr[mid]==target){
                return mid;
            }
            // if ascending thecn this 
            if(check){
                if(arr[mid]>target){
                    end =mid-1;
                }
                else{
                    start=mid+1;
                }
            }//or this
            else{
                if(arr[mid]<target){
                    end =mid-1;
                }
                else{
                    start=mid+1;
                } 
            }  
        }
        return -1;

    }
    
}
