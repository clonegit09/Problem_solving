import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Num(1, n);
        s.close();
    }

    static void Num(int cur, int n) {
        if (cur > n) {
            return;
        }
        System.out.println(cur);
        Num(cur + 1, n);
    }
}