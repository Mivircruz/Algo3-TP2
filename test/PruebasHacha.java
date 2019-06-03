import org.junit.Assert;
import org.junit.Test;

public class PruebasHacha {

    @Test
    public void test01DurabilidadInicialHachaDeMaderaEs100(){
        Hacha hacha = new Hacha(new Madera());
        Assert.assertEquals(100, hacha.durabilidad());
    }

    @Test
    public void test02FuerzaHachaDeMaderaEs2(){
        Hacha hacha = new Hacha(new Madera());
        Assert.assertEquals(2, hacha.fuerza());
    }

}
