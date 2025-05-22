
public class Swaparray {
    public static void main(String[] args) {
        int a2[] = {0,1,0,1,0,1,1,1,0,1,1,1,1,1,0,1,1,1,0};
        int count_2 =0;
        int count = 0;
        for(int i=0; i<=18; i++)
        {
            if(a2[i]==1)
            {
                count++;
                count_2=count;
            }

            else
            {
                count =0;
            }

        }
        System.out.println(count_2);
    
    }
}
