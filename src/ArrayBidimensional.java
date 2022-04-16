import java.util.Arrays;

public class ArrayBidimensional {

    public static void main(String[] args) {

        // declara a variável tabuleiro como um array de chars de tamanho 3x3
        // char[][] tabuleiro = new char[3][3];

        char[][] tabuleiro = {
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' }
        };

        tabuleiro[1][2] = 'x';

        // uma forma de imprimir o array bonitinho

        // for (int i = 0; i < tabuleiro.length; i++){
        // System.out.println(Arrays.toString(tabuleiro[i]));
        // }

        // outra forma de faze-lo

        for (int a = 0; a < tabuleiro.length; a++) {
            for (int b = 0; b < tabuleiro[a].length; b++) {
                System.out.print(tabuleiro[a][b]);
                System.out.print("|");
            }
            System.out.println();
        }

    }

}