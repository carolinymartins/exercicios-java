import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {

    public static int[][] criarMatriz(int l, int c)
    {
      int[][] matriz = new int[l][c];
      return matriz;
    }

    public static void preencherMatriz(int[][] matriz)
    {
        Random preencher = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]= preencher.nextInt(100);
            }
        }
       // System.out.println(Arrays.deepToString(matriz).replace("],","],\n"));

        Exercicio3.exibir(matriz);
    }

    public static void exibir(int[][] matriz)
    {
        int p, im;
        for (int i = 0; i < matriz.length ; i++) {
            p=0;
            im=0;
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] % 2 == 0)
                    p++;
                else
                    im++;
            }
            double total= matriz[i].length;
            double pares=(p/total) * 100;
            double impares = (im/total) * 100;
            System.out.println("Linha " + (i+1) + ": " + pares + "% de pares e " + impares + "% de ímpares");
        }
    }


    public static void main(String[] args) {
        int l,c;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Número de linhas:");
        l = leitor.nextInt();
        System.out.println("Número de Colunas:");
        c = leitor.nextInt();
        Exercicio3.preencherMatriz(criarMatriz(l,c));



    }
}