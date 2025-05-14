import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {

    public static int[] geraAposta(int num)
    {
        int[] aposta = new int[num];
        Random preencher = new Random();
        int i = 0;

        while (i < num)
        {
            int numero = preencher.nextInt(60) + 1;
            boolean repetido = false;
            for (int j = 0; j < i; j++)
            {
                if (aposta[j] == numero)
                {
                    repetido = true;
                }
            }

            if (!repetido)
            {
                aposta[i] = numero;
                i++;
            }
        }

        return aposta;
    }

    public static int[] geraMegaSena()
    {
        Random numeros = new Random();
        int i=0;
        int[] megasena= new int[6];
        while (i < 6)
        {
            int primeiroDigito = numeros.nextInt(6);
            int segundoDigito = numeros.nextInt(10);

            int num;
            if (primeiroDigito == 0 && segundoDigito == 0)
            {
                num = 60;
            } else {
                num = primeiroDigito * 10 + segundoDigito;
            }
            if (num >= 1 && num <= 60)
            {
                boolean repetido = false;
                for (int j = 0; j < i; j++)
                {
                    if (megasena[j] == num)
                    {
                        repetido = true;
                    }
                }

                if (!repetido)
                {
                    megasena[i] = num;
                    i++;
                }
            }
        }
        return megasena;
    }

    public static int verificaAposta(int[] aposta, int[] megasena)
    {
        int acertos = 0;

        for (int i = 0; i < aposta.length; i++) {
            for (int j = 0; j < megasena.length; j++) {
                if (aposta[i] == megasena[j])
                {
                    acertos++;
                }
            }
        }
        return acertos;
    }

    public static void MostraMegaSena(int[] megasena)
    {
        System.out.println("Números sorteados na Mega-Sena:");
        for (int num : megasena)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void MostraAposta(int[] aposta)
    {
        System.out.println("Números da sua aposta:");
        for (int num : aposta)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int j, num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------- BEM-VINDO À MEGA-SENA ----------------");
        System.out.print("Número de Jogos que irá fazer: ");
        j = scanner.nextInt();
        System.out.print("Quantidade de números a apostar (de 6 a 15): ");
        num = scanner.nextInt();


        int[] megasena = Exercicio5.geraMegaSena();
        int[][] apostas = new int[j][num];
        for (int i = 0; i < j; i++)
        {
            apostas[i] = Exercicio5.geraAposta(num);
            System.out.println("Jogo " + (i + 1));
            Exercicio5.MostraAposta(apostas[i]);
            Exercicio5.MostraMegaSena(megasena);
            int acertos = Exercicio5.verificaAposta(apostas[i], megasena);
            System.out.println("Você acertou " + acertos + " número(s)!");
            System.out.println("-------------------------------------");
        }
    }

}
