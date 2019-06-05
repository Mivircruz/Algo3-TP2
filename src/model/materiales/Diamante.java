package model.materiales;


import model.herramientas.*;

//TODO, faltan las pruebas del diamante.
public class Diamante extends Material {

    public Diamante() {
        super(100);
    }


    @Override
    public void esGolpeadoPor(Hacha hacha) {
        hacha.restarDurabilidad();

    }

    @Override
    public void esGolpeadoPor(Pico pico) {
        pico.restarDurabilidad();
    }

    @Override
    public void esGolpeadoPor(PicoFino picoFino) {
        picoFino.restarDurabilidad();
        durabilidad -= picoFino.fuerza();
    }

    @Override
    public void restarDurabilidad(HerramientaConMaterial herramientaConMaterial) {

    }

    @Override
    public int durabilidadEn(Hacha hacha) {
        return 0;
    }

    @Override
    public int fuerzaEn(Hacha hacha) {
        return 0;
    }

    @Override
    public int durabilidadEn(Pico pico) {
        return 0;
    }

    @Override
    public int fuerzaEn(Pico pico) {
        return 0;
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
