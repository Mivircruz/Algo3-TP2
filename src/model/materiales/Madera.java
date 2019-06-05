package model.materiales;

import model.herramientas.*;

public class Madera extends Material {

    public Madera() {
        super(10);
    }

    @Override
    public void restarDurabilidad(HerramientaConMaterial herramienta) {
        herramienta.restarDurabilidad(this);
    }

    @Override
    public void esGolpeadoPor(Hacha hacha) {
        hacha.restarDurabilidad();
        durabilidad -= hacha.fuerza();
    }

    @Override
    public void esGolpeadoPor(Pico pico) {
        pico.restarDurabilidad();
    }

    @Override
    public void esGolpeadoPor(PicoFino picoFino) {
        durabilidad -= picoFino.fuerza();
    }

    @Override
    public int durabilidadEn(Hacha hacha) {
        return 100;
    }

    @Override
    public int fuerzaEn(Hacha hacha) {
        return 2;
    }

    @Override
    public int durabilidadEn(Pico pico) {
        return 100;
    }

    @Override
    public int fuerzaEn(Pico pico) {
        return 2;
    }

    @Override
    public void vs(Material material, Herramienta herramienta) {

    }

    @Override
    public void vs(Madera madera, Herramienta herramienta) {

    }

    @Override
    public void vs(Piedra piedra, Herramienta herramienta) {

    }

    @Override
    public void vs(Metal metal, Herramienta herramienta) {

    }
}
