import java.util.*;

public class pattern4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        char c='A';
        for(char i=0;i<=n;i++){
            for(char j=0;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
        s.close();
    }
}
