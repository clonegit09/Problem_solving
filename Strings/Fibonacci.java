import java.util.Scanner;

public class Fibonacci{  
    public static void main(String args[])  
    {    
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int count=sc.nextInt();
        int n3;
     System.out.print(n1+" "+n2);//printing 0 and 1    
        
     for(int i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
     {    
      n3=n1+n2;    
      System.out.print(" "+n3);    
      n1=n2;    
      n2=n3;    
    
     }  
     sc.close();   
      
    }}  