
public class string {
    public static void main(String[] args) {
        
        //char[] name = {'s', 'h', 'r', 'e', 'y', 'a','s','h'};
        String Msg = "MOM";  
        System.out.println(Msg.length());
        System.out.println(Msg.indexOf('y'));
        System.out.println(Msg.toUpperCase());
        String rev=new StringBuilder(Msg).reverse().toString();
        System.out.println(rev);
        if(Msg.equals(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    }

