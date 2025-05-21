public class Digitpro{
    public static void main(String[] args) {
        int ans=fun(102);
        System.out.println(ans);
    }
    static int fun(int n){
    if(n==1){
        return 1;
    }
    return (n%10)*fun(n/10);
}
}
