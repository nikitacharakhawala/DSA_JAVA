package javadsaintermediate.arrayproblems;

public class SetBits {
    public static void main(String[] args) {
        int x=1;
        int y=3;
        int answer=0;
        if(x==y){
            answer=1<<x;
        }else{
            answer=(1<<x)+(1<<y);
        }
        System.out.println(answer);
    }
}
