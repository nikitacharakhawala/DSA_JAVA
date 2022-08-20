package javaadvanced.array1;

public class ClosestMinMax {
    public static void main(String[] args) {
        int[] A={1,2,6,1,2,5,6};
        System.out.println(getClosetMinMax(A));
    }

    public static int getClosetMinMax(int[] A){
        int lat_min=Integer.MAX_VALUE, lat_max=Integer.MAX_VALUE, ans=Integer.MAX_VALUE;
        int minValue=Integer.MAX_VALUE, maxValue=Integer.MIN_VALUE;
        if(A.length==1){
            return A.length;
        }
        for(int i=0;i<A.length;i++){
            if(A[i]<minValue){
                minValue=A[i];
            }
            if(A[i]>maxValue){
                maxValue=A[i];
            }
        }
        for(int i=0;i<A.length;i++){
            if(A[i]==minValue){
                lat_min=i;
            }
            if(A[i]==maxValue){
                lat_max=i;
            }
            if(lat_max!=Integer.MAX_VALUE && lat_min!=Integer.MAX_VALUE){
                ans=Math.min(ans, Math.abs(lat_max-lat_min)+1);
            }
        }
        return ans;
    }
}
