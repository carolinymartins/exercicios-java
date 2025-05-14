public class ExercicioExtra {
    public static String coluna(String frase, int colunas)
    {
        String[] palavras=frase.split("\\s");
        int mincol=0;
        for(String palavra : palavras)
            if(mincol<palavra.length())
                mincol=palavra.length();
        String textoAjustado="coluna muito estreita";
        if(colunas>mincol) {
            textoAjustado="";
            int inicio = 0, fim = colunas;
            while (fim < frase.length()) {
                //volta até achar um espaço em branco
                while (frase.charAt(fim) != ' ')
                    fim--;
                //concatena o pedaço encontrado
                textoAjustado += frase.substring(inicio, fim) + "\n";
                inicio = fim;
                fim += colunas;
            }
            textoAjustado += frase.substring(inicio); //pega o restante, caso exista
        }
        return textoAjustado;
    }

}
