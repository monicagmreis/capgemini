package questao2;

import java.util.Scanner;

/*
Implementei essa nova questao, para deixar mais claro
Quais os tipos de caracteres que faltam, para deixar a senha segura
 */
public class Questao2Extra {
    public static void main(String[] args) {
        System.out.println("Informe a senha: ");
        Scanner scan = new Scanner(System.in);
        String senha = scan.nextLine();

        System.out.println(new ValidadorSenha(senha).montaMensagemValidacao());
    }
}
