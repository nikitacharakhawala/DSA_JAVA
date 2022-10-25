package javaadvanced.tries;

public class SpellChecker {
    static Node root=new Node(null);

    public static void main(String[] args) {
        String[] dic={"hat", "cat", "rat"};
        String[] words={"cat", "ball"};
        spellChecker(dic, words);
        for(int result: spellChecker(dic, words)){
            System.out.println(result);
        }
    }

    public static int[] spellChecker(String[] dic, String[] words){
        int[] ans=new int[words.length];
        for(String d: dic){
            insert(d);
        }
        int index=0;
        for(String word: words){
            ans[index++]=search(word) ? 1 : 0;
        }
        return ans;
    }

    public static void insert(String word){
        Node temp=root;
        for(Character c: word.toCharArray()){
            if(!temp.characterMap.containsKey(c)){
                Node newNode=new Node(c);
                temp.characterMap.put(c, newNode);
            }
            temp=temp.characterMap.get(c);
//            System.out.println(temp.data+":::"+temp.characterMap);
        }
        temp.isTerminal=true;
    }

    public static boolean search(String word){
        Node temp=root;
        for(Character c: word.toCharArray()){
            if(temp.characterMap.containsKey(c)){
                temp= temp.characterMap.get(c);
            }else{
                return false;
            }
        }
        return temp.isTerminal;
    }
}
