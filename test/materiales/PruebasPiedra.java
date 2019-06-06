package materiales;

import model.herramientas.Hacha;
import model.herramientas.Pico;
import model.materiales.Madera;
import model.materiales.Metal;
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

    @Test
    public void PiedraEsGolpeadaPorPicoDeMaderaYNoSeReduceSuDurabilidad() {
        Piedra bloquePiedra = new Piedra();
        Pico picoMadera = new Pico(new Madera());
        int durabilidadBloquePiedra = bloquePiedra.durabilidad();

        picoMadera.golpear(bloquePiedra);

        Assert.assertEquals(bloquePiedra.durabilidad(), durabilidadBloquePiedra);
    }

    @Test
    public void PiedraEsGolpeadaPorPicoDePiedraYSiSeReduceSuDurabilidad() {
        Piedra bloquePiedra = new Piedra();
        Pico picoPiedra = new Pico(new Piedra());
        int durabilidadBloquePiedra = bloquePiedra.durabilidad();

        picoPiedra.golpear(bloquePiedra);

        Assert.assertEquals(bloquePiedra.durabilidad(), durabilidadBloquePiedra - picoPiedra.fuerza());
    }

    @Test
    public void PiedraEsGolpeadaPorPicoDeMetalYSiSeReduceSuDurabilidad() {
        Piedra bloquePiedra = new Piedra();
        Pico picoMetal = new Pico(new Metal());
        int durabilidadBloquePiedra = bloquePiedra.durabilidad();

        picoMetal.golpear(bloquePiedra);

        Assert.assertEquals(bloquePiedra.durabilidad(), durabilidadBloquePiedra - picoMetal.fuerza());
    }
}