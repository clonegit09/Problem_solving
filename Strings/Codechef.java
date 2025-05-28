import java.util.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int n=in.nextInt();
		    int r=1;
		    for (int i=1;i<=n;i++ ){
		        r*=i;
		    } 
		    System.out.println(r);
		}
		in.close();

	}
}
