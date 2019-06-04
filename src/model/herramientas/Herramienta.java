package model.herramientas;

import model.materiales.Madera;
import model.materiales.Material;
import model.materiales.Metal;
import model.materiales.Piedra;

public abstract class Herramienta {

    protected int durabilidad;
    protected int fuerza;
    protected Material material;

    Herramienta(Material material) {
        this.material = material;
    }

    public int fuerza() {
        return fuerza;
    }

    public int durabilidad() {
        return durabilidad;
    }

    public Material material() {
        return material;
    }

    public void restarDurabilidad() {
        material.restarDurabilidad(this);
    }

    public abstract void restarDurabilidad(Madera madera);
    public abstract void restarDurabilidad(Metal metal);
    public abstract void restarDurabilidad(Piedra piedra);
    public abstract void golpear(Material material);

}
