package model.herramientas;

import model.materiales.Madera;
import model.materiales.Material;
import model.materiales.Metal;
import model.materiales.Piedra;

public abstract class Herramienta {

    protected int durabilidad;
    protected int fuerza;


    public int fuerza() {
        return fuerza;
    }

    public int durabilidad() {
        return durabilidad;
    }

    public void golpear(Material material) {
        material.esGolpeadoPor(this);
    }

    public abstract void restarDurabilidad();
    public abstract void golpear(Madera madera);
    public abstract void golpear(Piedra piedra);
    public abstract void golpear(Metal metal);

}
