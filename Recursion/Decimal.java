public class Decimal {
    public static void main(String[] args) {
        int ans=dec(8);
        System.out.println(ans);
    }
    static int dec(int n){
        if(n==0){
            return 0;
        }
        return n%2 + 10*dec(n/2);
    }
}
