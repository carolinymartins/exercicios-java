import java.util.Arrays;
import java.util.Scanner;


public class Exercicio1 {
    public static int[] decompor(long num)
    {
        String numero = Long.toString(num);
        int tam = numero.length();
        int[] vetor = new int[tam];

        for (int i = tam - 1; i >= 0; i--)
        {
            vetor[i] = (int)(num % 10);
            num = num / 10;
        }

        return vetor;
    }

    public static void main (String[] args) {
        long num;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        num = leitor.nextLong();
        System.out.println(Arrays.toString(Exercicio1.decompor(num)));
    }
}