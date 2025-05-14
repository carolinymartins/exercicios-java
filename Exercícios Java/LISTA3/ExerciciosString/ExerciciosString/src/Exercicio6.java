public class Exercicio6 {
    public static String tipoVariavel (String tipo)
    {
        if (tipo.matches("^[A-Z][a-z]+( [A-Z][a-z]+)+$"))
        {
            return "Nome";
        }
        if (tipo.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            return "E-mail";
        }
        if (tipo.matches("^[A-Z]{3}-\\d[A-Z0-9]\\d{2}$"))
        {
            return "Placa";
        }
        return "Desconhecido";
    }
}
