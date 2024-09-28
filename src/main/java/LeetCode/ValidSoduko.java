package LeetCode;

import java.util.HashMap;

public class ValidSoduko {

    public static void main(String[] args){
        ValidSoduko validSoduko = new ValidSoduko();
        char[][] board = new char[][]{
                {'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(validSoduko.isValidSudoku(board));
    }

    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.')
                    continue;
                if(!isRowValid(board,i,j)) return false;
                if(!isColumnValid(board,i,j)) return false;
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(!is3By3Valid(board,i*3,j*3)){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean is3By3Valid(char[][] board, int y, int x){
        HashMap<Character, Character> unique = new HashMap<>();
        for(int i = y; i < y+3; i++){
            for(int j = x; j < x+3; j++){
                if(board[i][j] == '.')
                    continue;
                if(unique.get(board[i][j]) == null){
                    unique.put(board[i][j],board[i][j]);
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isRowValid(char[][] board, int y, int x){
        if(board[y][x]  == '.') return true;
        char num = board[y][x];
        for(int i = 0; i < board[x].length; i++){
            if(i == x) continue;
            if(board[y][i] == num)
                return false;
        }
        return true;
    }
    public boolean isColumnValid(char[][] board, int y, int x){
        if(board[y][x]  == '.') return true;
        char num = board[y][x];
        for(int i = 0; i < board[y].length; i++){
            if(i == y) continue;
            if(board[i][x] == num)
                return false;
        }
        return true;
    }
}
