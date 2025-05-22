public class Revstring {
    public static void main(String[] args) {
        String str = "this is my pen";
               
        String revStr = new StringBuilder(str).reverse().toString();
        
        System.out.println(revStr);
    }
}
