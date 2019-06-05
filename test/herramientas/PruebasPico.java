package herramientas;

import model.herramientas.Pico;
import model.materiales.Madera;
import model.materiales.Metal;
import model.materiales.Piedra;
import org.junit.Assert;
import org.junit.Test;

public class PruebasPico {

    @Test
    public void test01DurabilidadInicialPicoDeMaderaEs100() {
        Pico pico = new Pico(new Madera());
        Assert.assertEquals(100, pico.durabilidad());
    }

    @Test
    public void test02FuerzaPicoDeMaderaEs2() {
        Pico pico = new Pico(new Madera());
        Assert.assertEquals(2, pico.fuerza());
    }

    @Test
    public void test03DurabilidadInicialPicoDePiedraEs200() {
        Pico pico = new Pico(new Piedra());
        Assert.assertEquals(200, pico.durabilidad());
    }

    @Test
    public void test04FuerzaPicoDePiedraEs4() {
        Pico pico = new Pico(new Piedra());
        Assert.assertEquals(4, pico.fuerza());
    }

    @Test
    public void test05DurabilidadInicialPicoDeMetalEs400() {
        Pico pico = new Pico(new Metal());
        Assert.assertEquals(400, pico.durabilidad());
    }

    @Test
    public void test06FuerzaPicoDeMetalEs12() {
        Pico pico = new Pico(new Metal());
        Assert.assertEquals(12, pico.fuerza());
    }

    @Test
    public void test07PicoMaderaGolpeaMaderaYPierdeDurabilidad() {
        Madera bloqueMadera = new Madera();
        Pico picoMadera = new Pico(new Madera());

        int durabilidadPico = picoMadera.durabilidad();
        int fuerzaPicoMadera = picoMadera.fuerza();
        picoMadera.golpear(bloqueMadera);

        Assert.assertEquals(picoMadera.durabilidad(),durabilidadPico - fuerzaPicoMadera);
    }

    @Test
    public void test08PicoMaderaGolpeaPiedraYPierdeDurabilidad() {
        Piedra bloquePiedra = new Piedra();
        Pico picoMadera = new Pico(new Madera());

        int durabilidadPico = picoMadera.durabilidad();
        int fuerzaPicoMadera = picoMadera.fuerza();
        picoMadera.golpear(bloquePiedra);

        Assert.assertEquals(picoMadera.durabilidad(),durabilidadPico - fuerzaPicoMadera);
    }

    @Test
    public void test09PicoMaderaGolpeaMetalYPierdeDurabilidad() {
        Metal bloqueMetal = new Metal();
        Pico picoMadera = new Pico(new Madera());

        int durabilidadPico = picoMadera.durabilidad();
        int fuerzaPicoMadera = picoMadera.fuerza();
        picoMadera.golpear(bloqueMetal);

        Assert.assertEquals(picoMadera.durabilidad(),durabilidadPico - fuerzaPicoMadera);
    }
}
