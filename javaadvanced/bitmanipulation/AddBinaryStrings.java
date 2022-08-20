package javaadvanced.bitmanipulation;

public class AddBinaryStrings {
    public static void main(String[] args) {
        String A="11";
        String B="1";
        System.out.println(addBinaryString(A,B));
    }

    public static String addBinaryString(String A, String B) {
        int i=A.length()-1, j=B.length()-1, carry=0;
        StringBuilder addedBinary=new StringBuilder();
        while(i>=0 && j>=0){
            int sum=Integer.parseInt(A.charAt(i)+"")+Integer.parseInt(B.charAt(j)+"")+carry;
           // System.out.println(sum);
            if(sum==0 || sum==1){
                addedBinary.append(String.valueOf(sum));
                carry=0;
            }else if(sum==2){
                addedBinary.append('0');
                carry=1;
            }else{
                addedBinary.append('1');
                carry=1;
            }
            i--;
            j--;
        }

        while(i>=0){
            int sum=carry+Integer.parseInt(A.charAt(i)+"");
            if(sum==2){
                addedBinary.append('0');
                carry=1;
            }else{
                addedBinary.append(String.valueOf(sum));
                carry=0;
            }
            i--;
        }
        while(j>=0){
            int sum=carry+Integer.parseInt(B.charAt(j)+"");
            if(sum==2){
                addedBinary.append('0');
                carry=1;
            }else{
                addedBinary.append(String.valueOf(sum));
                carry=0;
            }
            j--;
        }
        if(i<=0 && j<=0 && carry==1){
            addedBinary.append(carry);
        }
        return addedBinary.reverse().toString();
    }
}
