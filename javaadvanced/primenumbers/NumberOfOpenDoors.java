package javaadvanced.primenumbers;

public class NumberOfOpenDoors {
    public static void main(String[] args) {
        int A=9;
        System.out.println(noOfOpenDoors(A));
    }

    public static int noOfOpenDoors(int A){
        return (int)Math.floor(Math.sqrt(A));
    }
}
