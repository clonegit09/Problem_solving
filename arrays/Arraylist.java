import java.util.ArrayList;
import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
         ArrayList<ArrayList<Integer>> list = new ArrayList<>(10);
         for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
         }

         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(s.nextInt());
            }
         }
         System.out.println(list);
        // list.add(3);
        // list.add(3544);
        // list.add(3446);
        // list.add(566);
        // list.add(69);
        // System.out.println(list);
        s.close();

    }
}
