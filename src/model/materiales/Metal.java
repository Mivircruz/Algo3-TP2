package model.materiales;

import model.herramientas.*;

public class Metal extends Material {

    public Metal() {
        super(50);
    }

    @Override
    public void esGolpeadoPor(Pico pico) {
        pico.restarDurabilidad();
    }

    @Override
    public void restarDurabilidad(HerramientaConMaterial herramienta) {
        herramienta.restarDurabilidad(this);
    }

    @Override
    public void esGolpeadoPor(Hacha hacha) {
        hacha.restarDurabilidad();
    }

    @Override
    public void esGolpeadoPor(PicoFino picoFino){
        picoFino.restarDurabilidad();
        durabilidad -= picoFino.fuerza();
    }

    @Override
    public int durabilidadEn(Hacha hacha) {
        return 400;
    }

    @Override
    public int fuerzaEn(Hacha hacha) {
        return 10;
    }

    @Override
    public int durabilidadEn(Pico pico) {
        return 400;
    }

    @Override
    public int fuerzaEn(Pico pico) {
        return 12;
    }
}
