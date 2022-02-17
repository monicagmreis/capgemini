import org.junit.Assert;
import org.junit.Test;

public class Questao1Test {

    @Test
    public void deveRetornarEscada6() {
        Assert.assertEquals(
                "     *\n" +
                "    **\n" +
                "   ***\n" +
                "  ****\n" +
                " *****\n" +
                "******", Questao1.criarEscada(6));
    }

    @Test
    public void deveRetornarEscada1(){
        Assert.assertEquals("*", Questao1.criarEscada(1));
    }

    @Test
    public void deveRetornarErroSeEntradaInvalida(){
        IllegalArgumentException ex = Assert.assertThrows(IllegalArgumentException.class, () -> Questao1.criarEscada(0));
        Assert.assertEquals("Informar Número Inteiro Positivo.", ex.getMessage());
   }
}
