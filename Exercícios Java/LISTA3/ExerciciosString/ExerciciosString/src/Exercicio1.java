import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args)
    {
            String nome;
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite o seu nome:");
            nome= leitor.nextLine();

            System.out.println("Tamanho da String: "+nome.length());
            System.out.println(" "+nome.toUpperCase());

            String nomeFormatado= nome.toUpperCase();

            String vogais="AEIOU";
            int contagem =0;
            for(char letra: nomeFormatado.toCharArray())
            {
                if(vogais.contains(String.valueOf(letra)))
                    contagem++;
            }
            System.out.println("A String " + nome + " tem " + contagem + " vogais");

            if (nomeFormatado.startsWith("UNO")) {
                System.out.println("A string começa com 'UNO'.");
            } else {
                System.out.println("A string NÃO começa com 'UNO'.");
            }

            if (nomeFormatado.endsWith("STE")) {
                System.out.println("A string termina com 'STE'.");
            } else {
                System.out.println("A string NÃO termina com 'STE'.");
            }

            contagem=0;
            for (int i =0; i<nome.length(); i++)
            {
                if(Character.isDigit(nome.charAt(i)))
                    contagem++;

            }
        System.out.println("A String possui " +contagem + " digito(s)");

            nomeFormatado.replaceAll("\\s+","");
            String invertida = new StringBuilder(nomeFormatado).reverse().toString();
            if(nomeFormatado.equals(invertida))
            {
                System.out.println("A String é palíndroma!");
            }
            else
            {
                System.out.println("A String não é palíndroma!");
            }

    }
}
