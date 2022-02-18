import org.junit.Assert;
import org.junit.Test;
import questao2.ValidadorSenha;

public class ValidadorSenhaTest {
    @Test
    public void deveRetornar3ECaracterEspecial(){
        Assert.assertEquals("3\n" +
                "Caractere Especial Necessário: 1\n",new ValidadorSenha("Ya3").montaMensagemValidacao());
    }

    @Test
    public void deveRetornar3ECaracterEspecialEMaiuscula(){
        Assert.assertEquals("3\n" +
        "Letra Maiúscula Necessária: 1\n" +
        "Caractere Especial Necessário: 1\n",new ValidadorSenha("ya3").montaMensagemValidacao());
    }

    public void deveRetornar0SenhaSegura(){
        Assert.assertEquals("0\n" +
                "Senha Segura\n",new ValidadorSenha("Ya3&ab").montaMensagemValidacao());
    }

    @Test
    public void deveRetornar3QuandoChamarQuantidadeTotalNecessaria(){
        Assert.assertEquals(3,new ValidadorSenha("Ya3").quantidadeTotalNecessaria());
    }
}
