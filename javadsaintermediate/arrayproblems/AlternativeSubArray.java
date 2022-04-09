package javadsaintermediate.arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;

public class AlternativeSubArray {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1));
        ArrayList<Integer> answer=new ArrayList<>();
        int B=1,  subLength=3*B;
        for(int s=0;s<A.size();s++){
            int e=s+subLength-1;
            if(e<A.size()) {
                int i=s+1, previousBit=A.get(s), currentBit=0;
                boolean isStopped=false;
                while(i<=e) {
                   currentBit=A.get(i);
                   if(currentBit==previousBit) {
                       isStopped=true;
                       break;
                   }
                   previousBit=currentBit;
                   i++;
                }
                if(!isStopped){
                    answer.add(s+B);
                }


            }
        }
        for(Integer ele: answer){
            System.out.print(ele+" ");
        }
    }


}
