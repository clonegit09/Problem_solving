import java.util.Scanner;

public class Eveodd {
    public static void main(String[] args) {
        Scanner ev =  new Scanner(System.in);
        System.out.println("enter a number");
        int a = ev.nextInt();

        if(a%2==0){
            System.out.println("it is even");
        }
        else{
            System.out.println("it is odd");
        }
        ev.close();


    }
    
}
