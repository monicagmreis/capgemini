package questao3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra
podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um
algoritmo que encontre o número de pares de substrings que são anagramas.
 */
public class Questao3 {
    public static void main(String[] args) {
        System.out.println("Informe a String: ");
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        List<String> palavras = new ArrayList();

        char[] charArray = inputString.toCharArray();
        for (int i=0; i < inputString.length(); i++) {
            //System.out.println(Character.toString(charArray[i]));
            for (int j=i+1;j <= inputString.length(); j++) {
                //System.out.println(inputString.substring(i,j));
                palavras.add(inputString.substring(i,j));
            }
        }

        System.out.println("----");
        System.out.println(palavras);
        System.out.println("----");

        for (String i : palavras) {

            StringBuilder reversa = new StringBuilder();
            reversa.append(i);

//            System.out.println(i);
//            System.out.println(reversa.reverse().toString());
//            System.out.println(" --- ");

            if (palavras.contains(reversa.reverse().toString())) {
                System.out.println("verdadeiro");
                System.out.println(i);
                System.out.println(reversa.reverse().toString());
                System.out.println(" --- ");
            }
        }
    }
}
