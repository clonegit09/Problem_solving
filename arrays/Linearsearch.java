public class Linearsearch {
    public static void main(String[] args) {
        int[] nums={23,54,65,28,97,4,5,2,79,69};
        int target=9 ;
        int ans=Search(nums,target);
        System.out.println(ans);
    }
    static int Search(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }

        for(int index=0;index< arr.length;index++){
            int element= arr[index];
            if(element==target){
                return index;
            }
            //or
        // for (int element:arr){
        //     if(element==target){
        //         return Integer.MAX_VALUE ;
        //     }
        // }
        }
        return -1;

    }
}
