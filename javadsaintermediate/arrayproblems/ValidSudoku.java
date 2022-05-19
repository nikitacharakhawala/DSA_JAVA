package javadsaintermediate.arrayproblems;

import java.util.HashMap;
import java.util.HashSet;

public class ValidSudoku {
    public static void main(String[] args) {
        String[] A={"53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"};
        System.out.println(isValidSudoku(A));
    }

    public static int isValidSudoku(String[] A){
        if(validate_row(A) && validate_col(A) && isValid_Square(A))
            return 1;
        return 0;
    }

    public static boolean validate_col(String[] A){
        for(int i=0;i<9;i++){
            if(!isValid_col(A,i,0,8))
                return false;
        }
        return true;
    }

    public static boolean validate_row(String[] A){
        for(int i=0;i<9;i++){
            if(!isValid_row(A, i, 0, 8)){
                return false;
            }
        }
        return true;
    }

    public static boolean isValid_row(String[] A, int rowIndex, int startCol,int endCol){
        HashSet<String> hs=new HashSet<>();
        for(int i=startCol;i<=endCol;i++){
            if(A[rowIndex].charAt(i)!='.'){
                if(!(Integer.parseInt(A[rowIndex].charAt(i)+"")>=1 && Integer.parseInt(A[rowIndex].charAt(i)+"")<=9))
                    return false;
                if(hs.contains(A[rowIndex].charAt(i)+""))
                    return false;
                else{

                    hs.add(A[rowIndex].charAt(i)+"");
                }

            }

        }
        return true;
    }

    public static boolean isValid_col(String[] A, int colIndex,int startRow, int endRow){
        HashSet<String> hs=new HashSet<>();
        for(int i=startRow;i<=endRow;i++){
            if(A[i].charAt(colIndex)!='.'){
                if(!(Integer.parseInt(A[i].charAt(colIndex)+"")>=1 && Integer.parseInt(A[i].charAt(colIndex)+"")<=9))
                    return false;
                if(hs.contains(A[i].charAt(colIndex)+""))
                    return false;
                else{

                    hs.add(A[i].charAt(colIndex)+"");
                }

            }
        }
        return true;
    }

    public static boolean isValid_Square(String[] A){
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                for(int a=i;a<i+3;a++){
                    for(int b=j;b<j+3;b++){
                        if(A[a].charAt(b)!='.'){
                            if(hs.contains(A[a].charAt(b))){
                                return false;
                            }else{
                                hs.add(A[a].charAt(b));
                            }
                        }
                    }
                }
              hs.clear();
            }
        }
        return true;
    }
}
