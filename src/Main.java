import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        eightQueens(8);
    }

    public static void eightQueens(int n) {
        if (n < 4) System.out.println("Your value is less than 4!");
        else {
            String[][] board = new String[n][n];
            for (String[] strings : board) {
                Arrays.fill(strings, "·");
            }
            int a;
            boolean b;
            if (n % 2 == 0) {
                a = 1;
                b = true;
            }
            else {
                a = 0;
                b = false;
            }
            for (int i = 0; i < n; i++) {
                if (a <= n) {
                    board[i][a] = "Q";
                    a += 2;
                    System.out.println(Arrays.toString(board[i]));
                }
                else {
                    if (b) {
                        a = 0;
                    }
                    else {
                        a = 1;
                    }
                    i--;
                }
            }
        }
    }
}
