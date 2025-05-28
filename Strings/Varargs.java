import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        fun(3,4,2,24,2,3,4,22);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    
}
