import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a temp in c");
        float tempc =in.nextFloat();

        float tempf = (tempc *9/5)+32;

        System.out.println(tempf);
        in.close();
    }
    
}
