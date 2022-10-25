package javaadvanced.doublylinkedlist;

import java.util.HashMap;

public class LRUCache {
    HashMap<Integer,ClassNode> nodeMap=new HashMap<>();
    int capacity=0;
    ClassNode head=new ClassNode(0,0);
    ClassNode tail=new ClassNode(0,0);

    public static void main(String[] args) {
        LRUCache lruCache=new LRUCache(2);
        lruCache.set(2 ,1);
        lruCache.set(1, 1);
        lruCache.set(2, 3);
        lruCache.set(4, 1);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(2));
//        lruCache.set(1, 1);
//        lruCache.set(4, 1);
//        lruCache.get(2);
    }

    LRUCache(int capacity){
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }

    public int get(int key) {
        if(nodeMap.containsKey(key)){
            ClassNode node=nodeMap.get(key);
            remove(node);
            insertAfterHead(node);
            return node.value;
        }else{
            return -1;
        }
    }

    public void set(int key, int value) {
        if(nodeMap.containsKey(key)){
            remove(nodeMap.get(key));
        }else if(nodeMap.size()==capacity){
            remove(tail.prev);
        }
        ClassNode node=new ClassNode(key, value);
        insertAfterHead(node);

    }

    public void insertAfterHead(ClassNode node){
        nodeMap.put(node.key, node);

        ClassNode headNext=head.next;

        head.next=node;
        node.prev=head;

        node.next=headNext;
        headNext.prev=node;
    }

    public void remove(ClassNode node){
        nodeMap.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
}

class ClassNode{
    int value;
    int key;
    ClassNode next;
    ClassNode prev;

    ClassNode(int key, int value){
        this.value=value;
        this.key=key;
    }
}

