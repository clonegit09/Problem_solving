import java.util.*;

public class Binarysearch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr={-18,-12,0,3,4,6,8,10,12,15,25,46,57};
        int target=25;
        int ans=binarysearch(arr, target);
        System.out.println(ans);
        s.close();
        
    }
    static int binarysearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
             //to find middle element
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end =mid-1;
            } 
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
