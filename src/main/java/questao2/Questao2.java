package questao2;

import java.util.Scanner;

/*
Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma
senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de
caracteres que devem ser adicionados para uma string qualquer ser considerada segura.
 */
public class Questao2 {
    public static void main(String[] args) {
        System.out.println("Informe a senha: ");
        Scanner scan = new Scanner(System.in);
        String senha = scan.nextLine();

        System.out.println(new ValidadorSenha(senha).quantidadeTotalNecessaria());

    }
}
