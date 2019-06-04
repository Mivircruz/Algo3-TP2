package model.materiales;

import model.herramientas.Hacha;
import model.herramientas.Herramienta;
import model.herramientas.Pico;

public class Piedra extends Material {

    public Piedra(){
        super(30);
    }

    @Override
    public void esGolpeadoPor(Pico pico) {
        pico.restarDurabilidad(this);
        durabilidad -= pico.fuerza();
    }

    @Override
    public void restarDurabilidad(Herramienta herramienta) {
        herramienta.restarDurabilidad(this);
    }

    @Override
    public void esGolpeadoPor(Hacha hacha) {
        hacha.restarDurabilidad();
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
