package model.materiales;

import model.herramientas.*;
import model.herramientas.Estados.EstadoHerramienta;
import model.herramientas.desgastes.Desgaste;

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

    public abstract void esGolpeadoPor(Herramienta herramienta);
    public abstract void esGolpeadoPor(Hacha hacha);
    public abstract void esGolpeadoPor(Pico pico);
    public abstract void esGolpeadoPor(PicoFino picoFino);

    //Abstractos
    public abstract int durabilidadEn(Hacha hacha);
    public abstract int fuerzaEn(Hacha hacha);
    public abstract int durabilidadEn(Pico pico);
    public abstract int fuerzaEn(Pico pico);
    public abstract EstadoHerramienta fabricar(Pico pico);
    public abstract EstadoHerramienta fabricar(Hacha hacha);
    public abstract Desgaste tipoDeDesgaste(Pico pico);
    public abstract Desgaste tipoDeDesgaste(Hacha hacha);
}