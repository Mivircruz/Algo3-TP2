package model.materiales;

import model.herramientas.*;

public class Metal extends Material {

    public Metal() {
        super(50);
    }

    @Override
    public void restarDurabilidad(HerramientaConMaterial herramienta) {
        herramienta.restarDurabilidad(this);
    }

    @Override
    public void esGolpeadoPor(Pico pico) {
        pico.restarDurabilidad();
        vs(pico.material(), pico);
    }

    @Override
    public void esGolpeadoPor(Hacha hacha) {
        hacha.restarDurabilidad();
    }

    @Override
    public void esGolpeadoPor(PicoFino picoFino){
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

    @Override
    public void vs(Material material, Herramienta herramienta) {
        material.vs(this, herramienta);
    }

    @Override
    public void vs(Madera madera, Herramienta herramienta) {
        //no es afectado.
    }

    @Override
    public void vs(Piedra piedra, Herramienta herramienta) {
        piedra.restarDurabilidad(herramienta.fuerza());
    }

    @Override
    public void vs(Metal metal, Herramienta herramienta) {
        metal.restarDurabilidad(herramienta.fuerza());
    }
}
