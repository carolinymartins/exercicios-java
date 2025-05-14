import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {
        public static int[][] geraMatrizQuadrada(int n)
        {
            int[][] matriz= new int[n][n];
            Random gera = new Random();
            for (int i = 0; i <n; i++) {
                for (int j = 0; j < n; j++) {
                    matriz[i][j]= gera.nextInt(n*n);
                }
            }
            System.out.println("Matriz gerada com sucesso!");
            return matriz;
        }

        public static boolean verificaQM(int[][] matriz)
        {
            int primeiralinha= 0;


            for (int j = 0; j < matriz[0].length; j++)
            {
                primeiralinha += matriz[0][j];
            }


            for (int i = 1; i < matriz.length; i++)
            {
                int soma = 0;
                for (int j = 0; j < matriz[i].length; j++) {
                    soma += matriz[i][j];
                }
                if (soma != primeiralinha) {
                    return false;
                }
            }
            return true;
        }

        public static void exibeMQ(int[][] matriz)
        {
            System.out.println("Matriz:");
            for (int[] linha : matriz) {
                System.out.println(Arrays.toString(linha));
            }
        }

    public static void main(String[] args) {
            Scanner leitor=new Scanner(System.in);
        System.out.println("Digite o números de linhas da matriz:");
            int n= leitor.nextInt();
        int[][] matriz= geraMatrizQuadrada(n);
        if (verificaQM(matriz)) {
            System.out.println("A matriz é quadrada e todas as linhas têm a mesma soma.");
        } else {
            System.out.println("A matriz não tem todas as linhas com a mesma soma.");
        }
       exibeMQ(matriz);
    }

}
