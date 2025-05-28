import java.util.*;
public class A {
   void print(String s){
    System.out.println("hello "+s);
   }
}
class toCheck{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);{
        System.out.println("enter name");
        String name=in.nextLine();
        A a1=new A();
        a1.print(name);
            
        }
        in.close();
    }
}
