package javadsaintermediate.mathproblems;

import java.io.*;
class GFG
{

    static boolean canFormPalindrome(String a)
    {

        // bitvector to store
        // the record of which character appear
        // odd and even number of times
        int bitvector = 0, mask = 0;
        for (int i = 0; i < a.length(); i++)
        {
            int x = a.charAt(i) - 'a';
            System.out.println("-------------------------");
            System.out.println(x);
            mask = 1 << x;

            System.out.println(mask);
            bitvector = bitvector ^ mask;

            System.out.println(bitvector);
            System.out.println("-------------------------");
        }
        System.out.println("last bit vector::"+(bitvector & (bitvector - 1)));

        return (bitvector & (bitvector - 1)) == 0;
    }

    // Driver Code
    public static void main (String[] args) {

        if (canFormPalindrome("aba"))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}