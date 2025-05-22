import java.util.Scanner;

public class Revarray {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];

        int[] t=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for (int i = 0; i < n; i++){
            t[i] = arr[n-i-1];
        }
        
        for (int i = 0; i <n; i++) 
            System.out.print(t[i] + " ");
            in.close();
    }
    
}
