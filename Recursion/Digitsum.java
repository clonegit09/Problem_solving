public class Digitsum{
    public static void main(String[] args) {
        int ans=fun(1342);
        System.out.println(ans);
    }
    static int fun(int n){
    if(n==0){
        return 0;
    }
    return (n%10)+fun(n/10);
}
}
