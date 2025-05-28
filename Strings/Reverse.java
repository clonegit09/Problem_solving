import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int temp=0;

        while(n>0){
            int rem =n%10;
            n/=10;
            temp =temp*10 + rem;
        }
        System.out.println(temp);
        sc.close();
    }
}
