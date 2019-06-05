package model.materiales;

import model.herramientas.*;

public abstract class Material {

    protected int durabilidad;

    Material(int durabilidad) {
        this.durabilidad = durabilidad;
    }

    public int durabilidad() {
        return durabilidad;
    }

    public void restarDurabilidad(int daño) {
        durabilidad -= daño;
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
    public abstract void vs(Material material, Herramienta herramienta);
    public abstract void vs(Madera madera, Herramienta herramienta);
    public abstract void vs(Piedra piedra, Herramienta herramienta);
    public abstract void vs(Metal metal, Herramienta herramienta);
}