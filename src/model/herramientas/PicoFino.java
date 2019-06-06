package model.herramientas;

import model.materiales.*;

public class PicoFino extends Herramienta {

    public PicoFino(){
        durabilidad = 1000;
        fuerza = 20;
    }

    @Override
    public void restarDurabilidad() {
        durabilidad -= durabilidad * 0.1;
    }

    @Override
    public void golpear(Material material) {
        material.esGolpeadoPor(this);
    }
}
