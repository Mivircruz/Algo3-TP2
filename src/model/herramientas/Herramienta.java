package model.herramientas;

import model.materiales.Material;

public abstract class Herramienta {

    protected int durabilidad;
    protected int fuerza;


    public int fuerza() {
        return fuerza;
    }

    public int durabilidad() {
        return durabilidad;
    }

    public abstract void restarDurabilidad();
    public abstract void golpear(Material material);
    //public abstract void golpear(Madera madera);
    //public abstract void golpear(Piedra piedra);
    //public abstract void golpear(Metal metal);

}
