package javaadvanced.tries;

import java.util.*;

class AutoSuggestNode{
   Boolean isTerminal;
   HashMap<Character, AutoSuggestNode> hm;
   ArrayList<Integer> autoIndex;
   Character c;

   AutoSuggestNode(Character c){
       this.c=c;
       this.hm=new HashMap<>();
       isTerminal=false;
       autoIndex=new ArrayList<>();
   }
}

class Pair{
    String word;
    int weight;

    Pair(String word, int weight){
        this.word=word;
        this.weight=weight;
    }
}

public class AutoComplete {
    static AutoSuggestNode root=null;

    public static void main(String[] args) {



        AutoComplete m=new AutoComplete();
        Scanner sc=new Scanner(System.in);
        int noOfTestCases=sc.nextInt();
        for(int i=0;i<noOfTestCases;i++){
            m.root=new AutoSuggestNode(null);
            int discSize=sc.nextInt();
            int querySize=sc.nextInt();

            String[] disc=new String[discSize];
            String[] query=new String[querySize];
            int[] weight=new int[discSize];

            for(int j=0;j<discSize;j++){
                disc[j]=sc.next();
            }

            for(int j=0;j<discSize;j++){
                weight[j]=sc.nextInt();
            }


            for(int j=0;j<querySize;j++){
                query[j]=sc.next();
            }


            m.autoSuggest(disc, weight, query);

        }
    }

    public static void autoSuggest(String[] disc, int[] weight, String[] query){
        //Store all words to pairs array class with its weight.
        Pair[] pairs=new Pair[disc.length];
        for(int i=0;i<disc.length;i++){
            pairs[i]=new Pair(disc[i], weight[i]);
        }

        //sort Pair class based on weight in decreasing order.
        Arrays.sort(pairs, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o2.weight-o1.weight;
            }
        });

        //Construct the Trie
        insert(pairs);
        ArrayList<ArrayList<String>> answer=new ArrayList<>();
        for(int i=0;i<query.length;i++){
            answer.add(getSearch(pairs, query[i]));
        }
        for(ArrayList<String> autoSuggest: answer){
            if(autoSuggest.size()>0) {
                for (String e : autoSuggest) {
                    System.out.print(e + " ");
                }
                System.out.println();
            }else{
                System.out.print("-1");
            }
        }

    }

    public static void insert(Pair[] pairs){
        for(int i=0;i<pairs.length;i++){
            AutoSuggestNode temp=root;
            for(Character c: pairs[i].word.toCharArray()){
                if(!temp.hm.containsKey(c)){
                    AutoSuggestNode newNode=new AutoSuggestNode(c);
                    temp.hm.put(c, newNode);
                }
                temp=temp.hm.get(c);
                if(temp.autoIndex.size()<5)
                    temp.autoIndex.add(i);
                System.out.println("1::"+temp.autoIndex);
            }
            temp.isTerminal=true;
        }
    }

    public static ArrayList<String> getSearch(Pair[] pairs, String query){
            ArrayList<String> ele=new ArrayList<>();
            AutoSuggestNode temp=root;
            for(Character q: query.toCharArray()){
                if(temp.hm.containsKey(q)){
                    temp=temp.hm.get(q);
                }else{
                   return new ArrayList<>();
                }
            }
            System.out.println(temp.c+"::::autoIndex:::"+temp.autoIndex);
            if(temp.autoIndex.size()>0){
                for(Integer index: temp.autoIndex){
                    ele.add(pairs[index].word);
                }
            }
            return ele;
    }
}
