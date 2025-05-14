import java.util.Arrays;

public class Exercicio2 {
    public static String gerarIniciais (String nome)
    {

        String[] conectores={"e", "do", "da", "dos", "das","de","di","du"};

        String[] partes= nome.trim().split("\\s+");
        StringBuilder iniciais = new StringBuilder();

        for( String palavra: partes)
        {
            if (!Arrays.asList(conectores).contains(palavra.toLowerCase()))
            {
                iniciais.append(Character.toUpperCase(palavra.charAt(0)));
            }

        }
        return iniciais.toString();
    }
}

