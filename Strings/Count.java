import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int n =sc.nextInt();
        System.out.println("enter which number you want to check");
        int i =sc.nextInt();

        int count =0;
        while(n>0){
            int rem = n%10;
            if(rem==i){
                count++;
            }
            n=n/10;
        }

        System.out.println(count);
        sc.close();
    }
}    

