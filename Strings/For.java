import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        for(int num=1;num<=n;num++){
            System.out.println(num+"");
        }
        sc.close();
    }
}
