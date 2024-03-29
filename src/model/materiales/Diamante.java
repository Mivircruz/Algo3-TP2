package model.materiales;


import model.herramientas.*;
import model.herramientas.Estados.EstadoHerramienta;
import model.herramientas.desgastes.Desgaste;

public class Diamante extends Material {

    public Diamante() {
        super(100);
    }


    @Override
    public void esGolpeadoPor(Herramienta herramienta) {
        herramienta.golpear(this);
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
    public EstadoHerramienta fabricar(Pico pico) {
        return null;
    }

    @Override
    public EstadoHerramienta fabricar(Hacha hacha) {
        return null;
    }

    @Override
    public Desgaste tipoDeDesgaste(Pico pico) {
        return null;
    }

    @Override
    public Desgaste tipoDeDesgaste(Hacha hacha) {
        return null;
    }

}
