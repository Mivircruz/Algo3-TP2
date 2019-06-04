package model.materiales;

import model.herramientas.Hacha;
import model.herramientas.Herramienta;
import model.herramientas.Pico;

public class Metal extends Material {

    public Metal() {
        super(50);
    }

    @Override
    public void esGolpeadoPor(Pico pico) {
        pico.restarDurabilidad();
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
