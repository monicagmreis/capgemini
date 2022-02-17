import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
     *
    **
   ***
  ****
 *****
******
 */

public class Questao1 {
    public static void main(String[] args) throws IOException {

        //como ter certeza que recebi um numero inteiro?
        //verificar negativo???

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer n = 0;

        System.out.println("Informar Número: ");
        try {
            n = Integer.parseInt(bufferedReader.readLine().trim());
        } catch (NumberFormatException ex) {
            System.out.println("Entrada Inválida");
        }

        String escada = criarEscada(n);

        System.out.print(escada);
    }

    public static String criarEscada(Integer n) {
        if (n<=0) {
            throw new IllegalArgumentException("Informar Número Inteiro Positivo.");
        }
        StringBuilder buffer = new StringBuilder();
        for (int i = 1; i <= n; i++ ) {
            concatenaEspaco(n-i, buffer);
            concatenaAsterisco(i, buffer);
            if (i < n) buffer.append("\n");
//            buffer.append(System.getProperty("line.separator"));
        }
        return buffer.toString();
    }

    private static void concatenaEspaco(Integer i, StringBuilder buffer) {
        for (int y = 1; y <= i; y++) {
            buffer.append(" ");
        }
    }

    private static void concatenaAsterisco(Integer i, StringBuilder buffer) {
        for (int y = 1; y <= i; y++) {
            buffer.append("*");
        }
    }
}
