package jugador;

import org.junit.Assert;
import org.junit.Test;
import model.herramientas.*;
import model.materiales.*;
import model.jugador.Jugador;

public class PruebasJugador {
    /*
    El objetivo de todas estas pruebas en su conjunto es probar que el jugador efectivamente comienza con un
    Hacha de madera equipada. Por ello se usa Herramienta en lugar de Hacha.
     */

    private static final double RANGO_BASE = 0.1;

    @Test
    public void test01JugadorComienzaConHerramientaCuyaDurabilidadDeberiaSerDeUnHachaDeMadera() {

        Jugador jugador = new Jugador();
        Herramienta herramienta = jugador.obtenerHerramientaEquipada();
        Hacha hachaMadera = new Hacha(new Madera());

        Assert.assertEquals(herramienta.durabilidad(), hachaMadera.durabilidad(), RANGO_BASE);
    }

    @Test
    public void test02JugadorComienzaConHerramientaCuyaFuerzaDeberiaSerDeUnHachaDeMadera() {

        Jugador jugador = new Jugador();
        Herramienta herramienta = jugador.obtenerHerramientaEquipada();
        Hacha hachaMadera = new Hacha(new Madera());

        Assert.assertEquals(herramienta.fuerza(), hachaMadera.fuerza());
    }

    @Test
    public void test03JugadorComienzaConHerramientaQueSeDesgastaComoUnHachaDeMaderaAlUsarseSobreMadera() {

        Jugador jugador = new Jugador();
        Madera bloqueMadera = new Madera();
        Herramienta herramienta = jugador.obtenerHerramientaEquipada();
        Hacha hachaMadera = new Hacha(new Madera());
        float durabilidadHerramienta = herramienta.durabilidad();

        jugador.usarHerramientaEquipadaSobre(bloqueMadera);

        Assert.assertEquals(herramienta.durabilidad(), durabilidadHerramienta - hachaMadera.fuerza(), RANGO_BASE);
    }

    @Test
    public void test04JugadorComienzaConHerramientaQueSeDesgastaComoUnHachaDeMaderaAlUsarseSobrePiedra() {

        Jugador jugador = new Jugador();
        Piedra bloquePiedra = new Piedra();
        Herramienta herramienta = jugador.obtenerHerramientaEquipada();
        Hacha hachaMadera = new Hacha(new Madera());
        float durabilidadHerramienta = herramienta.durabilidad();

        jugador.usarHerramientaEquipadaSobre(bloquePiedra);

        Assert.assertEquals(herramienta.durabilidad(), durabilidadHerramienta - hachaMadera.fuerza(), RANGO_BASE);
    }

    @Test
    public void test05JugadorComienzaConHerramientaQueSeDesgastaComoUnHachaDeMaderaAlUsarseSobreMetal() {

        Jugador jugador = new Jugador();
        Metal bloqueMetal = new Metal();
        Herramienta herramienta = jugador.obtenerHerramientaEquipada();
        Hacha hachaMadera = new Hacha(new Madera());
        float durabilidadHerramienta = herramienta.durabilidad();

        jugador.usarHerramientaEquipadaSobre(bloqueMetal);

        Assert.assertEquals(herramienta.durabilidad(), durabilidadHerramienta - hachaMadera.fuerza(), RANGO_BASE);
    }

    @Test
    public void test06JugadorComienzaConHerramientaQueAlUsarseSobreMaderaLaDesgastaComoSiFueraUnHachaDeMadera() {

        Jugador jugador = new Jugador();
        Madera bloqueMadera = new Madera();
        Hacha hachaMadera = new Hacha(new Madera());
        int durabilidadBloqueMadera = bloqueMadera.durabilidad();

        jugador.usarHerramientaEquipadaSobre(bloqueMadera);

        Assert.assertEquals(bloqueMadera.durabilidad(), durabilidadBloqueMadera - hachaMadera.fuerza());
    }

    @Test
    public void test07JugadorComienzaConHerramientaQueAlUsarseSobrePiedraNoLaDesgastaComoSiFueraUnHachaDeMadera() {

        Jugador jugador = new Jugador();
        Piedra bloquePiedra = new Piedra();
        int durabilidadBloquePiedra = bloquePiedra.durabilidad();

        jugador.usarHerramientaEquipadaSobre(bloquePiedra);

        Assert.assertEquals(bloquePiedra.durabilidad(), durabilidadBloquePiedra);
    }

    @Test
    public void test08JugadorComienzaConHerramientaQueAlUsarseSobreMetalNoLaDesgastaComoSiFueraUnHachaDeMadera() {

        Jugador jugador = new Jugador();
        Metal bloqueMetal = new Metal();
        int durabilidadBloqueMetal = bloqueMetal.durabilidad();

        jugador.usarHerramientaEquipadaSobre(bloqueMetal);

        Assert.assertEquals(bloqueMetal.durabilidad(), durabilidadBloqueMetal);
    }
}
