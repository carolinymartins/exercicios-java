import java.util.Random;

public class Exercicio5 {
    public static String embaralha (String palavra)
    {

        char[] caracteres = palavra.toCharArray();
        Random random = new Random();

        for (int i = caracteres.length - 1; i > 0; i--)
        {
            int j = random.nextInt(i + 1);

            char temp = caracteres[i];
            caracteres[i] = caracteres[j];
            caracteres[j]+

                     = temp;
        }
        return new String(caracteres);
    }
}
