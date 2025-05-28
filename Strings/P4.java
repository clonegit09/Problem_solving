public class P4 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= 2* n; i++) {
            for (int j = 1;j<=i;j++) {
                System.out.print("* ");
                if(i>=n){
                    
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }
}
 