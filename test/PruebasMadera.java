import org.junit.Test;
import org.junit.Assert;

public class PruebasMadera {

    @Test
    public void test01MaderaSeGolpeaConHachaDeMaderaYReduceSuDurabilidad(){
        Madera bloqueMadera = new Madera();
        Hacha hachaMadera = new Hacha(new Madera());

        int durabilidadBloqueMadera = bloqueMadera.durabilidad();
        hachaMadera.golpear(bloqueMadera);

        Assert.assertEquals(bloqueMadera.durabilidad(),durabilidadBloqueMadera -2);

    }


}