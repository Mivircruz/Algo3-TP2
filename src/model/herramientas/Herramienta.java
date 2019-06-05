package model.herramientas;

import model.materiales.Madera;
import model.materiales.Material;
import model.materiales.Metal;
import model.materiales.Piedra;
import model.materiales.Diamante;

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

}
