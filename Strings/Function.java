import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        // String message= greet();
        // System.out.println(message);
        Scanner sc=new Scanner(System.in);

        System.out.print("enter your name");
        String name =sc.next();

        String personalized = mygreet(name);
        System.out.println(personalized+ " ");
        sc.close();
    }
    static String mygreet(String name){
        String greeting="नमस्ते" + name;
        return greeting;
    }


    // static String greet(){
    //     String greeting ="welcome to my website";
    //     return greeting; 

    // }
    
}
