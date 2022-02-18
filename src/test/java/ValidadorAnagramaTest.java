import org.junit.Assert;
import org.junit.Test;
import questao2.ValidadorSenha;
import questao3.ValidadorAnagrama;

public class ValidadorAnagramaTest {
    @Test
    public void deveRetornar3(){
        Assert.assertEquals(3,new ValidadorAnagrama("ifailuhkqq").quantidadeAnagramas());
    }

    @Test
    public void deveRetornar2(){
        Assert.assertEquals(2, new ValidadorAnagrama("ovo").quantidadeAnagramas());
    }
}
