public class SearchinRange {
    public static void main(String[] args) {
        int[] nums={18,38,48,58,37,2,328};
        int target=58;
        System.out.println(Search(nums,target,1,4));
    }
    static int Search(int[] arr, int target,int start,int end){
        if(arr.length==0){
            return -1;
        }

        for(int index=start;index<= end;index++){
            int element= arr[index];
            if(element==target){
                return index;
            }
           
        }
        return -1;

    }
}
