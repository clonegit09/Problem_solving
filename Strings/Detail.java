import java.util.Scanner;

class Box{
    int height,width,breadth;
    Box(int height,int width,int breadth){
        this.height=height;
        this.width=width;
        this.breadth=breadth;
    }
    float volume(){
        return height*width*breadth;
    }
}
public class Detail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        int br=sc.nextInt();

        Box b=new Box(h,w,br);

        System.out.println(b.volume());
        sc.close();
    }
}
