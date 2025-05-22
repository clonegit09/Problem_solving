import java.util.Arrays;
import java.util.Scanner;

public class Arrayinput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //     int[] arr = new int[5];

    //     for(int i =0;i<5;i++){
    //         arr[i]= sc.nextInt();
    // }
    String[] str = new String[4];
    for(int i=0;i<4;i++){
        str[i]= sc.next();
    }
    System.out.println(Arrays.toString(str));
//     for(int i=0;i<5;i++){
//         System.out.print(arr[i]+" ");
//     }
sc.close();

 }
}