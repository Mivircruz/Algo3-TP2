package materiales;

import model.herramientas.Hacha;
import model.materiales.Madera;
import model.materiales.Piedra;
import org.junit.Test;
import org.junit.Assert;

public class PruebasPiedra {

    @Test
    public void PiedraSeGolpeaConHachaDeMaderaNoReduceSuDurabilidad() {
        Piedra bloquePiedra = new Piedra();
        Hacha hachaDeMadera = new Hacha(new Madera());

        int durabilidadBloquePiedra = bloquePiedra.durabilidad();
        hachaDeMadera.golpear(bloquePiedra);

        Assert.assertEquals(bloquePiedra.durabilidad(), durabilidadBloquePiedra);
    }

    @Test
    public void PiedraSeGolpeaConHachaDePiedraNoReduceSuDurabilidad() {
        Piedra bloquePiedra = new Piedra();
        Hacha hachaDePiedra = new Hacha(new Piedra());
        int durabilidadBloquePiedra = bloquePiedra.durabilidad();

        hachaDePiedra.golpear(bloquePiedra);

        Assert.assertEquals(bloquePiedra.durabilidad(), durabilidadBloquePiedra);
    }

}