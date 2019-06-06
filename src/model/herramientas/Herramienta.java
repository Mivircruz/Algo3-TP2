package model.herramientas;

import model.herramientas.desgastes.Desgaste;
import model.materiales.Madera;
import model.materiales.Material;
import model.materiales.Metal;
import model.materiales.Piedra;

public abstract class Herramienta {

    protected float durabilidad;
    protected int fuerza;
    protected Desgaste desgaste;

    public int fuerza() {
        return fuerza;
    }

    public float durabilidad() {
        return durabilidad;
    }

    public void golpear(Material material) {
        material.esGolpeadoPor(this);
    }

    public void restarDurabilidad() {
        durabilidad = desgaste.desgastar(durabilidad, fuerza);
    }

    public abstract void golpear(Madera madera);
    public abstract void golpear(Piedra piedra);
    public abstract void golpear(Metal metal);

}
