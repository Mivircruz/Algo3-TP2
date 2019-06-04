package herramientas;

import model.herramientas.Hacha;
import model.materiales.Madera;
import model.materiales.Metal;
import model.materiales.Piedra;
import org.junit.Assert;
import org.junit.Test;

public class PruebasHacha {

    @Test
    public void test01DurabilidadInicialHachaDeMaderaEs100() {
        Hacha hacha = new Hacha(new Madera());
        Assert.assertEquals(100, hacha.durabilidad());
    }

    @Test
    public void test02FuerzaHachaDeMaderaEs2() {
        Hacha hacha = new Hacha(new Madera());
        Assert.assertEquals(2, hacha.fuerza());
    }

    @Test
    public void test03DurabilidadInicialHachaDePiedraEs200() {
        Hacha hacha = new Hacha(new Piedra());
        Assert.assertEquals(200, hacha.durabilidad());
    }

    @Test
    public void test04FuerzaHachaDePiedraEs5() {
        Hacha hacha = new Hacha(new Piedra());
        Assert.assertEquals(5, hacha.fuerza());
    }

    @Test
    public void test05DurabilidadInicialHachaDeMetalEs400() {
        Hacha hacha = new Hacha(new Metal());
        Assert.assertEquals(400, hacha.durabilidad());
    }

    @Test
    public void test06FuerzaHachaDeMetalEs10() {
        Hacha hacha = new Hacha(new Metal());
        Assert.assertEquals(10, hacha.fuerza());
    }

    @Test
    public void test07HachaMaderaGolpeaMaderaYPierdeDurabilidad() {
        Madera bloqueMadera = new Madera();
        Hacha hachaMadera = new Hacha(new Madera());

        int durabilidadHachaMadera = hachaMadera.durabilidad();
        int fuerzaHachaMadera = hachaMadera.fuerza();
        hachaMadera.golpear(bloqueMadera);

        Assert.assertEquals(hachaMadera.durabilidad(),durabilidadHachaMadera - fuerzaHachaMadera);
    }
}
