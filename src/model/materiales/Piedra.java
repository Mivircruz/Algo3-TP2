package model.materiales;

import model.herramientas.*;

public class Piedra extends Material {

    public Piedra(){
        super(30);
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
    public void esGolpeadoPor(Pico pico) {
        pico.restarDurabilidad(this);
        durabilidad -= pico.fuerza();
    }

    @Override
    public void esGolpeadoPor(PicoFino picoFino){
        durabilidad -= picoFino.fuerza();
    }


    @Override
    public int durabilidadEn(Hacha hacha) {
        return 200;
    }

    @Override
    public int fuerzaEn(Hacha hacha) {
        return 5;
    }

    @Override
    public int durabilidadEn(Pico pico) {
        return 200;
    }

    @Override
    public int fuerzaEn(Pico pico) {
        return 4;
    }
}
