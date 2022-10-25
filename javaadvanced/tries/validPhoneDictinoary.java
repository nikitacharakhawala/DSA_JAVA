package javaadvanced.tries;

import java.nio.file.NotDirectoryException;

public class validPhoneDictinoary {
    static Node root=new Node(null);
    public static void main(String[] args) {
        String[] A={"1234", "2342", "567"};
        System.out.println(isValidDict(A));
    }

    public static int isValidDict(String[] A){
        Node temp=root;
        for(int i=0;i<A.length;i++){
            temp=root;
            for(Character c: A[i].toCharArray()){
                if(!temp.characterMap.containsKey(c)){
                    Node newNode=new Node(c);
                    temp.characterMap.put(c, newNode);
                }else{
                    return 0;
                }
                temp=temp.characterMap.get(c);
            }
        }
        return 1;
    }


}
