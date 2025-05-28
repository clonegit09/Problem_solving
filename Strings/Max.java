public class Max {
    public static void main(String[] args) {
        int[] arr={5,3,2,4,1};
        int max=arr[0];
        int min=arr[0];
        for(int i=0; i<5;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0; i<5;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
}
}
