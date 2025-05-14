import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {

    public static int[][] preencherMatriz(int l, int c) {
        int[][] matriz = new int[l][c];
        Random preencher = new Random();

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = preencher.nextInt(100);
            }
        }
        return matriz;
    }

    public static void exibir(int[][] matriz)
    {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int[] vetor = new int[linhas * colunas];
        int inicio = 0;
        int fim = vetor.length - 1;

        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                if(matriz[i][j] % 2 == 0)
                {
                    vetor[inicio++] = matriz[i][j];
                } else {
                    vetor[fim--] = matriz[i][j];

                }
            }
        }

        System.out.println("Vetor com pares no início e ímpares no final:");
        System.out.println(Arrays.toString(vetor));
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Número de linhas: ");
        int l = leitor.nextInt();
        System.out.print("Número de colunas: ");
        int c = leitor.nextInt();

        int[][] matriz = preencherMatriz(l, c);
        exibir(matriz);
    }
}


