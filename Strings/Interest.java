import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();

        int si=(p*r*t)/100;

        System.out.println(si);
        sc.close();

    }
    
}
