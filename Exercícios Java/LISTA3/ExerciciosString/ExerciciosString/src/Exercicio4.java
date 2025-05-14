import javax.swing.*;

public class Exercicio4 {
    public static int lerInteiro (String titulo, String mensagem) {
        String entrada = JOptionPane.showInputDialog(null,mensagem,titulo,JOptionPane.QUESTION_MESSAGE);

        try {
            int numero = Integer.parseInt(entrada);
            return numero;
        } catch (NumberFormatException e)
        {
            return 0;
        }
    }

    public static double lerReal (String titulo, String mensagem)
    {
        String entrada = JOptionPane.showInputDialog(null,mensagem,titulo,JOptionPane.QUESTION_MESSAGE);

        try {
            double numero = Double.parseDouble(entrada);
            return numero;
        } catch (NumberFormatException e)
        {
            return 0;
        }
    }
}


