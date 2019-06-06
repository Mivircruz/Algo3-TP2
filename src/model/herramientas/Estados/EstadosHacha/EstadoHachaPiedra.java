package model.herramientas.Estados.EstadosHacha;

import model.herramientas.Estados.EstadoHerramienta;
import model.materiales.Madera;
import model.materiales.Metal;
import model.materiales.Piedra;

public class EstadoHachaPiedra implements EstadoHerramienta {

    @Override
    public void golpear(Madera madera, int fuerza) {
        madera.restarDurabilidad(fuerza);
    }

    @Override
    public void golpear(Piedra piedra, int fuerza) {
        //no hace nada
    }

    @Override
    public void golpear(Metal metal, int fuerza) {
        //no hace nada
    }

}
