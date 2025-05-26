package Linkedlist;
class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        data=data1;
        next=next1;
    }
    Node(int data1){
        data=data1;
        
    }
}

public class LL1 {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,9};
        Node n=new Node(arr[2]);
        System.out.println(n.data);
    }
}
