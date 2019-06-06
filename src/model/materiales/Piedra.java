package model.materiales;

import model.herramientas.*;
import model.herramientas.Estados.EstadoHerramienta;
import model.herramientas.Estados.EstadosHacha.EstadoHachaPiedra;
import model.herramientas.Estados.EstadosPico.EstadoPicoPiedra;

public class Piedra extends Material {

    public Piedra(){
        super(30);
    }

    @Override
    public void restarDurabilidad(HerramientaConMaterial herramienta) {
        herramienta.restarDurabilidad(this);
    }

    @Override
    public void esGolpeadoPor(Herramienta herramienta) {
        herramienta.golpear(this);
    }

    @Override
    public void esGolpeadoPor(Hacha hacha) {
        hacha.golpear(this);
    }

    @Override
    public void esGolpeadoPor(Pico pico) {
        pico.golpear(this);
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

    @Override
    public EstadoHerramienta fabricar(Pico pico) {
        return new EstadoPicoPiedra();
    }

    @Override
    public EstadoHerramienta fabricar(Hacha hacha) {
        return new EstadoHachaPiedra();
    }
}
