package javaadvanced.modulararithmatic;

public class PrimeModuloInverse {
    public static void main(String[] args) {
        int A=6, B=23;
        System.out.println(primeModuloInverse(A,B));
    }

    public static int primeModuloInverse(int A, int B){
        if(B==0)
            return 1;
        return pow(A, B-2, B);
    }

    public static int pow(int A, int B, int mod){
        if(B==0)
            return 1;
        long halfPower=pow(A, B/2, mod);
        long interResult=halfPower%mod*halfPower%mod;
        if(B%2==0){
            return (int)((interResult+mod)%mod);
        }else{
            return (int)((interResult*(A%mod))+mod)%mod;
        }
    }
}
