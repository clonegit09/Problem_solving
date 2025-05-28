
import java.util.Scanner;

public class new3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        arr[0]=1;
        for(int i=0;i<n;i++){
            if(i<=n/2){
                arr[i]=arr[i-1]+2;
            }
            else if(i==(n/2)+1){
                arr[i]=arr[i-1]+1;
            }
            else{
                arr[i]=arr[i-1]-2;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        in.close();
        }


    }

