package model.materiales;

import model.herramientas.Hacha;
import model.herramientas.HerramientaConMaterial;
import model.herramientas.Pico;
import model.herramientas.PicoFino;

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
}
