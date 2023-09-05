package codeforce.problemset.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TicTacToe {
    public void game(int[][] board){
        int max_index = 0, max_count = 0;
        for(int i=0; i<board.length; i++){
            int count = board[i][0] + board[i][1] + board[i][2];            
            
        }
    }
}

class TicTacToeTest {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("D:\\personal\\study\\data structure\\dsANDalgo\\src\\main\\java\\codeforce\\problemset\\testdata\\tictactoe.txt");
        
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(file);
        int n = in.nextInt();
        int b = 3 * in.nextInt();
        in.nextLine();
        
        int[][] board = new int[b][3];
        for(int i=0; i<b; i++){
            String l  = in.nextLine();
            int j = 0;
            for(char c : l.toCharArray()){
                board[i][j++] = c == 'X' ? 1 : 0;                
            }
        }

        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.game(board);
        //System.out.println(board);
    }
}
