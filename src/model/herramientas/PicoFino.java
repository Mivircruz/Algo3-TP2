package model.herramientas;

import model.herramientas.desgastes.DesgastePorMultiplicacion;
import model.materiales.*;

public class PicoFino extends Herramienta {

    public PicoFino(){
        durabilidad = 1000;
        fuerza = 20;
        desgaste = new DesgastePorMultiplicacion(0.1f);
    }

    @Override
    public void golpear(Madera madera) {
        madera.restarDurabilidad(fuerza);
    }

    @Override
    public void golpear(Piedra piedra) {
        piedra.restarDurabilidad(fuerza);
    }

    @Override
    public void golpear(Metal metal) {
        metal.restarDurabilidad(fuerza);
    }

    @Override
    public void golpear(Material material) {
        material.esGolpeadoPor(this);
    }
}
