package javaadvanced.linkedlist;

import sun.awt.image.ImageWatched;

import javax.management.ListenerNotFoundException;


class LinkedList{
    int value;
    LinkedList next;


}
public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList head=new LinkedList();
        head.value=1;

        int count=2;
        LinkedList tail=head;
        while(count!=4){
            LinkedList newNode=new LinkedList();
            newNode.value=count;
            head.next=tail;
            count++;
        }

        reverseLinkedList(head);

    }

    public static void reverseLinkedList(LinkedList head){

    }
}
