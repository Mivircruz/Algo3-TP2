package model.herramientas.Estados.EstadosPico;

import model.herramientas.Estados.EstadoHerramienta;
import model.materiales.Madera;
import model.materiales.Metal;
import model.materiales.Piedra;

public class EstadoPicoMadera implements EstadoHerramienta {

    @Override
    public void golpear(Madera madera, int fuerza) {
        //nada para hacer
    }

    @Override
    public void golpear(Piedra piedra, int fuerza) {
        piedra.restarDurabilidad(fuerza);
    }

    @Override
    public void golpear(Metal metal, int fuerza) {
        //nada para hacer
    }
}
