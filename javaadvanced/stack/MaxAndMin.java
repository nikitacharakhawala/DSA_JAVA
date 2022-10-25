package javaadvanced.stack;

import java.util.Arrays;
import java.util.Stack;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] A={ 994390, 986616, 976849, 979707, 950477, 968402, 992171, 937674, 933065, 960863, 980981, 937319, 951236, 959547, 991052, 991799, 992213, 941294, 978103, 997198, 960759, 988476, 963517, 980366, 921767, 979757, 977912, 983761, 981869, 947454, 930202, 999086, 973538, 999798, 996446, 944001, 974217, 951595, 942688, 975075, 970973, 970130, 897109, 927660, 862233, 997130, 986068, 954098, 978175, 889682, 988973, 996036, 969675, 985751, 977724, 881538, 988613, 924230, 906475, 915565, 986952, 975702, 994316, 964011, 986848, 983699, 949076, 989673, 981788, 929094, 988310, 926471, 994763, 999736, 980762, 973560, 996622, 934475, 998365, 966255, 998697, 998700, 911868, 983245, 996382, 996992, 953142, 994104, 987303, 853837, 960626, 904203, 998063, 977596, 977868, 996012, 946345, 949255, 988138, 996298, 954933, 965036, 886976, 998628, 990878, 953725, 916744, 985233, 919661, 970903, 986066 };
        System.out.println(getMaxAndMin(A));
    }

    public static int getMaxAndMin(int[] A) {
        int mod=1000*1000*1000+7;
        int[] leftSmallerEle=leftSmallerElement(A);
        //System.out.println(Arrays.toString(leftSmallerEle));
        int[] rightSmallerEle=rightSmallerElement(A);
//        System.out.println(Arrays.toString(rightSmallerEle));

        int[] leftGreaterEle=leftGreaterElement(A);
//        System.out.println(Arrays.toString(leftGreaterEle));
        int[] rightGreaterEle=rightGreaterElement(A);
//        System.out.println(Arrays.toString(rightGreaterEle));
        long answer=0;
        for(int i=0;i<A.length;i++){
            int p1=leftSmallerEle[i];
            int p2=rightSmallerEle[i];
            long prodMin=(1L*(i-p1)*(p2-i))%mod;
            long minContribution=(prodMin*A[i])%mod;

            int p3=leftGreaterEle[i];
            int p4=rightGreaterEle[i];
            long prodMax=(1L*(i-p3)*(p4-i))%mod;
            long maxContribution=(prodMax*A[i])%mod;

            answer=(answer%mod)+((maxContribution-minContribution)%mod);

        }
        if(answer<0){
            answer=(answer+mod)%mod;
        }
        return (int)(answer%mod);



    }

    public static int[] leftSmallerElement(int[] A){
            Stack<Integer> histogram=new Stack<>();
            int[] leftSmall=new int[A.length];
            Arrays.fill(leftSmall,-1);
            for(int i=0;i<A.length;i++){
                while(!histogram.isEmpty() && A[i]<=A[histogram.peek()]){
                    histogram.pop();
                }
                if(!histogram.isEmpty()){

                    leftSmall[i]=histogram.peek();
                }
                histogram.push(i);
            }
            return leftSmall;
    }

    public static int[] rightSmallerElement(int[] A){
        Stack<Integer> histogram=new Stack<>();
        int[] rightSmall=new int[A.length];
        Arrays.fill(rightSmall,A.length);
        for(int i=A.length-1;i>=0;i--){
            while(!histogram.isEmpty() && A[i]<=A[histogram.peek()]){
                histogram.pop();
            }
            if(!histogram.isEmpty()){

                rightSmall[i]=histogram.peek();
            }
            histogram.push(i);
        }
        return rightSmall;
    }

    public static int[] leftGreaterElement(int[] A){
        Stack<Integer> histogram=new Stack<>();
        int[] leftGreater=new int[A.length];
        Arrays.fill(leftGreater,-1);
        for(int i=0;i<A.length;i++){
            while (!histogram.isEmpty() && A[i]>=A[histogram.peek()]){
                histogram.pop();
            }
            if(!histogram.isEmpty()){

                leftGreater[i]=histogram.peek();
            }
            histogram.push(i);
        }
        return leftGreater;
    }

    public static int[] rightGreaterElement(int[] A){
        Stack<Integer> histogram=new Stack<>();
        int[] rightGreater=new int[A.length];
        Arrays.fill(rightGreater,A.length);
        for(int i=A.length-1;i>=0;i--){
            while (!histogram.isEmpty() && A[i]>=A[histogram.peek()]){
                histogram.pop();
            }
            if(!histogram.isEmpty()){

                rightGreater[i]=histogram.peek();
            }
            histogram.push(i);
        }
        return rightGreater;
    }


}
