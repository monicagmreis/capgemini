package questao3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ValidadorAnagrama {

    private final String palavra;

    public ValidadorAnagrama(String palavra) {
        this.palavra = palavra;
    }

    public int quantidadeAnagramas(){

        //formar todas as combinacoes possiveis com os caracteres
        LinkedList<String> palavras = new LinkedList<>();
        for (int indiceInicio=0; indiceInicio < palavra.length(); indiceInicio++) {
            for (int indiceTermino=indiceInicio+1;indiceTermino <= palavra.length(); indiceTermino++) {
                String subPalavra = palavra.substring(indiceInicio,indiceTermino);
                palavras.add(subPalavra);
            }
        }

        //System.out.println(palavras);
        //System.out.println("------");

        int qtdAnagramas = 0;

        for (int i = 0; i < palavras.size(); i++) {
            for (int j = 0; j < palavras.size(); j++) {
                if (i != j) {
                    String palavra1 = palavras.get(i);
                    String palavra2 = palavras.get(j);
                    Map<Character,Integer> mapa1 = mapear(palavra1);
                    Map<Character,Integer> mapa2 = mapear(palavra2);
                    if (mapa1.size() == mapa2.size()) {
                        int frequenciaLetra = 0;
                        for (Map.Entry<Character, Integer> entryMapa1 : mapa1.entrySet()) {
                            Integer qtdNoMapa2 = mapa2.getOrDefault(entryMapa1.getKey(),0);
                            if (qtdNoMapa2 == entryMapa1.getValue()) {
                                frequenciaLetra ++;
                            }
                        }
                        if (frequenciaLetra == mapa1.size() ) {
                            qtdAnagramas ++;
                            //System.out.println(palavra1 + "-> " + palavra2);
                            palavras.remove(palavra1);
                        }
                    }
                }
            }
        }
        return qtdAnagramas;
    }

    private static Map<Character, Integer> mapear(String palavra) {
        //guardar cada caracter, com a sua frequencia, em um HashMap
        HashMap<Character, Integer> mapa = new HashMap<>();
        for (char c : palavra.toCharArray()) {
            if (mapa.containsKey(c)) {
                mapa.put(c,mapa.get(c)+1);
            } else {
                mapa.put(c,1);
            }
        }
        return mapa;
    }
}
