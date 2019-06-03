import org.junit.Test;
import org.junit.Assert;

public class PruebasPiedra {

    @Test
    public void PiedraSeGolpeaConHachaDeMaderaNoReduceSuDurabilidad() {
        Piedra bloquePiedra = new Piedra();
        HachaMadera hachaDeMadera = new HachaMadera();
        int durabilidadBloquePiedra = bloquePiedra.durabilidad();

        hachaDeMadera.usar(bloquePiedra);

        Assert.assertEquals(bloquePiedra.durabilidad(), durabilidadBloquePiedra);
    }

    @Test
    public void PiedraSeGolpeaConHachaDePiedraNoReduceSuDurabilidad() {
        Piedra bloquePiedra = new Piedra();
        HachaPiedra hachaDePiedra = new HachaPiedra();
        int durabilidadBloquePiedra = bloquePiedra.durabilidad();

        hachaDePiedra.usar(bloquePiedra);

        Assert.assertEquals(bloquePiedra.durabilidad(), durabilidadBloquePiedra);
    }

    @Test
    public void PiedraSeGolpeaConHachaDeMetalNoReduceSuDurabilidad() {
        Piedra bloquePiedra = new Piedra();
        HachaMetal hachaDeMetal = new HachaMetal();
        int durabilidadBloquePiedra = bloquePiedra.durabilidad();

        hachaDeMetal.usar(bloquePiedra);

        Assert.assertEquals(bloquePiedra.durabilidad(), durabilidadBloquePiedra);
    }
}