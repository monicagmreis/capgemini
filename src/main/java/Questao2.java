import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
O site considera uma senha forte quando ela satisfaz os seguintes critérios:
. Possui no mínimo 6 caracteres.
. Contém no mínimo 1 digito.
. Contém no mínimo 1 letra em minúsculo.
. Contém no mínimo 1 letra em maiúsculo.
. Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+

Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma
senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de
caracteres que devem ser adicionados para uma string qualquer ser considerada segura.

 */
public class Questao2 {
    public static void main(String[] args) {
        System.out.println("Informe a senha: ");
        Scanner scan = new Scanner(System.in);
        String senha = scan.nextLine();
        Integer quantidade = 0;

        quantidade = validaSenha(senha);
        System.out.println(quantidade);

        System.out.println("--------------");

        Boolean senhaValida = validaSenha2(senha);
        System.out.println(senhaValida);
    }

    public static Integer validaSenha(String senha) {
        Integer quantidade=0;

        if (senha.length()<6) {
            quantidade = 6- senha.length();
        }
        return quantidade;
    }

    public static Boolean validaSenha2(String senha) {
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[!@#$%^&*()-+])"
                + "(?=\\S+$).{6}$";

        Pattern p = Pattern.compile(regex);

        if (senha == null) {
            return false;
        }

        Matcher m = p.matcher(senha);

        return m.matches();
    }
}
