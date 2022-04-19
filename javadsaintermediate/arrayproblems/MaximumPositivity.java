package javadsaintermediate.arrayproblems;

public class MaximumPositivity {
    public static void main(String[] args) {
        int A[]={8986143, -5026827, 5591744, 4058312, 2210051, 5680315, -5251946, -607433, 1633303, 2186575 };
        maximumPositiveArray(A);
    }

    public static int[] maximumPositiveArray(int[] A){

        int minStart=Integer.MAX_VALUE,  MaxEnd=Integer.MIN_VALUE, length=Integer.MIN_VALUE;
        for(int s=0;s<A.length;s++){
            for(int e=s;e<A.length;e++){
                boolean isNegative=false;

                for(int j=s;j<=e;j++){
                    System.out.print(A[j]+" ");
                    if(A[j]<0){

                        isNegative=true;
                        break;
                    }
                }
                if(!isNegative) {
                    if (((e - s) + 1) > length) {
                        length = e - s + 1;
                        minStart = s;
                        MaxEnd = e;
                    }
                }
            }
        }
        int index=0;
        int[] answer=new int[MaxEnd-minStart+1];
        for(int k=minStart;k<=MaxEnd;k++){
            answer[index]=A[k];
            index++;
        }


        return answer;
    }
}
