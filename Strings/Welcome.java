 import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        System.out.println("welcome to my program "+str);
        sc.close();

    }
    
}
