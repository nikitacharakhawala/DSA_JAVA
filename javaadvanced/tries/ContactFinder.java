package javaadvanced.tries;

import java.util.ArrayList;
import java.util.Arrays;

public class ContactFinder {
    static Node root=new Node(null);

    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList(0, 0, 1, 1));
        ArrayList<String> B=new ArrayList<>(Arrays.asList("hack", "hacker", "hac", "hak"));
        System.out.println(getContactFinder(A,B));
    }

    public static ArrayList<Integer> getContactFinder(ArrayList<Integer> A, ArrayList<String> B){
        ArrayList<Integer> answer=new ArrayList<>();
        for(int i=0;i<A.size();i++){
            if(A.get(i)==0){
                insert(B.get(i));
            }else{
                answer.add(search(B.get(i)));
            }
        }
        return answer;
    }

    public static int search(String word){
        Node temp=root;

        for(Character c: word.toCharArray()){
            if(temp.characterMap.containsKey(c)){
                temp=temp.characterMap.get(c);
            }else{
                return 0;
            }
        }
        return temp.count;
    }
    public static void insert(String A){
            Node temp=root;
            for(Character c: A.toCharArray()){
                if(!temp.characterMap.containsKey(c)){
                    Node newNode=new Node(c);
                    temp.characterMap.put(c, newNode);
                }
                temp= temp.characterMap.get(c);
                temp.count++;
                System.out.println(temp.data+":::"+temp.count);
            }
            temp.isTerminal=true;
    }
}
