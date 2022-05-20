package javadsaintermediate.arrayproblems;

public class MajorityElement {
    public static void main(String[] args) {
        int[] A={2,1,1};
        System.out.println(getMajorityElement(A));
    }

    public static int getMajorityElement(int[] A){
        int ele=A[0], freq=1;
        for(int i=1;i<A.length;i++){
            if(ele==A[i]){
                freq++;
            }else{
                if(freq==0){
                    ele=A[i];
                    freq++;
                }else{
                    freq--;
                }
            }
        }
        int count=0;
        for(int i=0;i<A.length;i++){
            if(ele==A[i]){
                count++;
            }
        }
        if(count>(A.length/2)){
            return ele;
        }
        return ele;
    }
}

