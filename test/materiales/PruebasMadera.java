package materiales;

import model.herramientas.Hacha;
import model.materiales.Madera;
import org.junit.Test;
import org.junit.Assert;

public class PruebasMadera {

    @Test
    public void test01DurabilidadMaderaEs10() {
        Madera madera = new Madera();
        Assert.assertEquals(10, madera.durabilidad());
    }

    @Test
    public void test02MaderaSeGolpeaConHachaDeMaderaYReduceSuDurabilidad() {
        Madera bloqueMadera = new Madera();
        Hacha hachaMadera = new Hacha(new Madera());

        int durabilidadBloqueMadera = bloqueMadera.durabilidad();
        hachaMadera.golpear(bloqueMadera);

        Assert.assertEquals(bloqueMadera.durabilidad(),durabilidadBloqueMadera -2);
    }

}