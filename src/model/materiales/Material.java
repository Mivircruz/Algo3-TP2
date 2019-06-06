package model.materiales;

import model.herramientas.Hacha;
import model.herramientas.HerramientaConMaterial;
import model.herramientas.Pico;
import model.herramientas.PicoFino;

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

    public abstract void esGolpeadoPor(PicoFino picoFino);


    //Abstractos
    public abstract void restarDurabilidad(HerramientaConMaterial herramientaConMaterial);
    public abstract int durabilidadEn(Hacha hacha);
    public abstract int fuerzaEn(Hacha hacha);
    public abstract int durabilidadEn(Pico pico);
    public abstract int fuerzaEn(Pico pico);
}
