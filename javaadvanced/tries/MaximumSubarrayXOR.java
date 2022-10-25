package javaadvanced.tries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MaximumSubarrayXOR {
    static BitNode root=new BitNode(null);

    public static void main(String[] args) {
        int[] A={29, 13, 9, 34, 32, 15, 30, 9};
        System.out.println(Arrays.toString(getMaxXOR(A)));
    }

    public static int[] getMaxXOR(int[] A){
        int[] xORPrefixArray=getPrefixXOR(A);
        ArrayList<Integer> answer=new ArrayList<>();
        int maxXOR=Integer.MIN_VALUE, length=Integer.MAX_VALUE, startIndex=-1, endIndex=-1;

        System.out.println(Arrays.toString(xORPrefixArray));
        for(int i=0;i<A.length;i++){
            insert(xORPrefixArray[i], i);
        }

        for(int i=0;i<xORPrefixArray.length;i++){
            BitNode temp=root;
            int num=0;
            for(int j=31;j>=0;j--){
                int bit=(xORPrefixArray[i]>>j)&1;
                if(bit==0){
                    if(temp.right!=null){
                        num=num|(1<<j);
                        temp=temp.right;
                    }else{
                        temp=temp.left;
                    }
                }else{
                    if(temp.left!=null){
                        num=num|(1<<j);
                        temp=temp.left;
                    }else{
                        temp=temp.right;
                    }
                }
            }
          maxXOR=Math.max(maxXOR, num);
        }
        System.out.println("m:::"+maxXOR);
        HashMap<Integer, Integer> indexMap=new HashMap<>();
        for(int i=0;i<xORPrefixArray.length;i++){
            int xOR=xORPrefixArray[i]^maxXOR;
            System.out.println(xOR+"::::"+  indexMap);
            if(indexMap.containsKey(xOR)){
                int start=indexMap.get(xOR)+1;
                int end=i;
                int len=end-start+1;
                if(len<length){
                    startIndex=start;
                    endIndex=end;

                    length=len;
                }else if(len==length && start<startIndex){
                    length=len;
                    startIndex=start;
                    endIndex=end;
                }

            }
            indexMap.put(xORPrefixArray[i],i );

        }

        return new int[]{startIndex, endIndex};

    }



    public static void insert(int num, int index){
        BitNode temp=root;
        for(int i=31;i>=0;i--){
            int bit=(num>>i)&1;
            if(bit==0){
                if(temp.left==null){
                    BitNode newNode=new BitNode(0);
                    temp.left=newNode;

                }
                temp=temp.left;
            }else{
                if(temp.right==null){
                    BitNode newNode=new BitNode(1);
                    temp.right=newNode;

                }
                temp=temp.right;
            }

            //System.out.println(temp.num+"::::"+temp.indexArr);
        }
        temp.isTerminal=true;
    }

    public static int[] getPrefixXOR(int[] A){
        int[] xORPrefix=new int[A.length+1];
        xORPrefix[0]=0;
        for(int i=1;i<=A.length;i++){

                xORPrefix[i]=xORPrefix[i-1]^A[i-1];

        }
        return xORPrefix;
    }
}
