package javaadvanced.tries;

import java.util.Arrays;
import java.util.HashMap;

class Node{
    int count;
    HashMap<Character, Node> characterMap;
    boolean isTerminal;
    Character data;

    Node(Character data){
        this.data=data;
        isTerminal=false;
        characterMap=new HashMap<>();
        count=0;
    }
}

public class ShortestUniquePrefix {
   static Node root=new Node(null);

    public static void main(String[] args) {
        String[] A={"zebra", "dog", "duck", "dove"};

        for(String uniquePrefix: prefix(A)){
            System.out.println(uniquePrefix);
        }
    }

    public static String[] prefix(String[] A) {
        String[] answer=new String[A.length];
        for(String word: A){
            //System.out.println(word);
            insert(word);
        }
        int index=0;
        for(String word: A){
            Node temp=root;
            String ans="";
            for(Character c: word.toCharArray()){
               // System.out.println(temp.characterMap.containsKey(c));
               if(temp.characterMap.containsKey(c)){
                   temp=temp.characterMap.get(c);
                   ans+=temp.data;
               //    System.out.println(temp.data+":::"+temp.count+":::"+ans);
                   if(temp.count==1){
                       answer[index++]=ans;
                       break;
                   }
               }
            }
        }
        return answer;
    }

    public static void insert(String word){
        Node temp=root;
        for(Character c:word.toCharArray()){
            if(!temp.characterMap.containsKey(c)){
                Node newNode=new Node(c);
                temp.characterMap.put(c,newNode);
                newNode.count=1;
                temp=newNode;
            }else {
                temp = temp.characterMap.get(c);
                temp.count++;
            }


           // System.out.println(temp.data+"::::"+temp.count);
        }
        temp.isTerminal=true;

    }
}
