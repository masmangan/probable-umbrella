import java.util.Scanner;

public class TicTacToe
{
    public static void main(String[] args)
    {
        System.out.println("Jogo da Velha!");
        char[][] grid = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}        
            };

        System.out.printf("%c|%c|%c\n", grid[0][0], grid[0][1],grid[0][2]);
        System.out.printf("-+-+-\n");
        System.out.printf("%c|%c|%c\n", grid[1][0], grid[1][1],grid[1][2]);
        System.out.printf("-+-+-\n");
        System.out.printf("%c|%c|%c\n", grid[2][0], grid[2][1],grid[2][2]);

        // // variaveis
        // Scanner in;
        // int a;
        // int b;
        // int s;

        // // entrada de dados
        // in = new Scanner(System.in);
        // a = in.nextInt();      
        // b = in.nextInt();      
        // in.close();

        // // processamento de dados
        // s = a + b;

        // // saida de dados
        // System.out.println(s);
    }
}
