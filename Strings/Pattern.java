import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){

            for(int j=1;j<i+1;j++){
                System.out.print(j);
            }
            for(int j=1;j<=(2*(n-1));j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            
            System.out.println();
        }
        sc.close();
    }
}
