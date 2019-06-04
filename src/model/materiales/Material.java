package model.materiales;

import model.herramientas.Hacha;
import model.herramientas.Herramienta;
import model.herramientas.Pico;

public abstract class Material {

    protected int durabilidad;

    Material(int durabilidad) {
        this.durabilidad = durabilidad;
    }

    public int durabilidad() {
        return durabilidad;
    }

    public abstract void esGolpeadoPor(Hacha hacha);

    public abstract void esGolpeadoPor(Pico pico);


    //Abstractos
    public abstract void restarDurabilidad(Herramienta herramienta);
    public abstract int durabilidadEn(Hacha hacha);
    public abstract int fuerzaEn(Hacha hacha);
    public abstract int durabilidadEn(Pico pico);
    public abstract int fuerzaEn(Pico pico);
}
