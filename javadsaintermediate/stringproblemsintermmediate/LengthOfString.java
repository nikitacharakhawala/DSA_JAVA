package javadsaintermediate.stringproblemsintermmediate;

public class LengthOfString {
    public static void main(String[] args) {
        String s="My Name is Yash";
        withInBuilt(s);
        withLoop(s);
    }

    public static void withInBuilt(String s){
        String[] strArray=s.split(" ");
        if(strArray.length>0){
            for(String str: strArray){
                System.out.print(str.length()+" ");
            }
        }
        System.out.println();
    }

    public static void withLoop(String s){
        int count=0, length=0;
        while(count<s.length()){
            if(s.charAt(count)==' '){
                System.out.print(length+" ");
                length=0;
            }else{
                length++;
            }
            count++;
        }
        System.out.print(length);
    }
}
