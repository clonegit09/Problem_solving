public class Box{
    float width;
    float height;
    float breadth;

    Box(){
        width =1;
        height=2;
        breadth=3;
    }
    Box(float w,float h,float b){
        this.width=w;
        this.height=h;
        this.breadth=b;
    }
    public float Volume(){
        return width*height*breadth;
    }

    public static void main(String[] args) {
        Box b= new Box();
        Box b1=new Box(2.5f,3.0f,4.0f);
        System.out.println(b.Volume());
        System.out.println(b1.Volume());
    }
}
