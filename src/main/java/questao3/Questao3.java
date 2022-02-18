package questao3;

import java.util.Scanner;

/*
Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra
podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um
algoritmo que encontre o número de pares de substrings que são anagramas.
 */
public class Questao3 {
    public static void main(String[] args) {
        System.out.println("Informar a String: ");
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.nextLine().toLowerCase();

        System.out.println(new ValidadorAnagrama(palavra).quantidadeAnagramas());
    }
}
