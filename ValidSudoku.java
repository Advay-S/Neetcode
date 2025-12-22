package ArraysAndHashing;

import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        HashSet<Character>[] rowHS = new HashSet[9]; //references for 9 hashset objects
        HashSet<Character>[] colHS = new HashSet[9];
        HashSet<Character>[] matHS = new HashSet[9];

        //we need to check of uniqueness of a number simultaneously
        for(int i = 0 ; i < 9 ; i++){
            rowHS[i] = new HashSet<>();
            colHS[i] = new HashSet<>();
            matHS[i] = new HashSet<>();

        }

        for(int a = 0 ; a < 9 ; a++){
            for(int b = 0 ; b <9 ; b++){
                char value = board[a][b];


                if(value == '.'){
                    continue;
                }

                if(rowHS[a].contains(value)){return false;

                }
                rowHS[a].add(value);
//We are essentially building column memory . Column persists across rows and slowly build memory with each iteration . Like For first iteration an element at row 0 column 0 will be in column 0
// but then later an element at row 1 column 0 will also be in column 0
                if(colHS[b].contains(value)){
                    return false;
                }
                colHS[b].add(value);
int idx = ((a/3)*3) + (b/3);
                if(matHS[idx].contains(value)){
                    return false ;
                }
                matHS[idx].add(value);
            }
        }

return true ;
    }

}
