package questao2;

public class ValidadorSenha {
    private final String senha;

    public ValidadorSenha(String senha) {
        this.senha = senha;
    }

    public int quantidadeTotalNecessaria(){
        int quantidade=0;

        if (this.senha.length()<6) {
            quantidade = 6- this.senha.length();
        }
        return quantidade;
    }

    private int quatidadeDigitosNecessaria(){
        int count = 0;
        for (int i = 0; i < this.senha.length(); i++) {
            if (Character.isDigit(this.senha.charAt(i))) {
                count++;
            }
        }
        return count > 0 ? 0 : 1;
    }

    private int quantidadeMinimaMinusculo(){
        boolean achouMinuscula = this.senha.matches("(?=.*[a-z]).{1,}");

        return achouMinuscula ? 0 : 1;
    }

    private int quantidadeMinimaMaiusculo(){

        boolean achouMaiuscula = this.senha.matches("(?=.*[A-Z]).{1,}");

        return achouMaiuscula ? 0 : 1;
    }

    private int quantidadeMinimaEspecial(){

        boolean achouEspecial = this.senha.matches("(?=.*[!@#$%^&*()-+]).{1,}");

        return achouEspecial ? 0 : 1;
    }

    public String montaMensagemValidacao(){
        StringBuilder mensagem = new StringBuilder();

        mensagem.append(this.quantidadeTotalNecessaria() + "\n");

        if (this.quatidadeDigitosNecessaria() > 0) mensagem.append("Dígitos Necessários: " + this.quatidadeDigitosNecessaria() + "\n");
        if (this.quantidadeMinimaMinusculo() > 0) mensagem.append("Letra Minúscula Necessária: " + this.quantidadeMinimaMinusculo() + "\n");
        if (this.quantidadeMinimaMaiusculo() > 0) mensagem.append("Letra Maiúscula Necessária: " + this.quantidadeMinimaMaiusculo() + "\n");
        if (this.quantidadeMinimaEspecial() > 0) mensagem.append("Caractere Especial Necessário: " + this.quantidadeMinimaEspecial() + "\n");


        if(this.quantidadeTotalNecessaria() + this.quatidadeDigitosNecessaria() + this.quantidadeMinimaMinusculo()
        + this.quantidadeMinimaMaiusculo() + this.quantidadeMinimaEspecial() == 0) mensagem.append("Senha Segura");

        return mensagem.toString();
    }


}
