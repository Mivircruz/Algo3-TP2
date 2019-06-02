import org.junit.Assert;
import org.junit.Test;

public class PruebasHacha {

    @Test
    public void test01DurabilidadInicialHachaDeMaderaEs100(){
        HachaDeMadera hacha = new HachaDeMadera();
        Assert.assertEquals(100, hacha.getDurabilidad());
    }

    @Test
    public void test02FuerzaHachaDeMaderaEs2(){
        HachaDeMadera hacha = new HachaDeMadera();
        Assert.assertEquals(2, hacha.getFuerza());
    }

    @Test
    public void test03DurabilidadInicialHachaDePiedraEs200(){
        HachaDePiedra hacha = new HachaDePiedra();
        Assert.assertEquals(200, hacha.getDurabilidad());
    }

    @Test
    public void test04FuerzaHachaDePiedraEs5(){
        HachaDePiedra hacha = new HachaDePiedra();
        Assert.assertEquals(5, hacha.getFuerza());
    }


    @Test
    public void test05DurabilidadInicialHachaDeMetalEs400(){
        HachaDeMetal hacha = new HachaDeMetal();
        Assert.assertEquals(400, hacha.getDurabilidad());
    }

    @Test
    public void test06FuerzaHachaDeMaderaEs10(){
        HachaDeMetal hacha = new HachaDeMetal();
        Assert.assertEquals(10, hacha.getFuerza());
    }
}
