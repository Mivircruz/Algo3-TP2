package model.materiales;

import model.herramientas.*;
import model.herramientas.Estados.EstadoHerramienta;
import model.herramientas.Estados.EstadosHacha.EstadoHachaMadera;
import model.herramientas.Estados.EstadosPico.EstadoPicoMadera;
import model.herramientas.desgastes.Desgaste;
import model.herramientas.desgastes.DesgastePorFuerza;

public class Madera extends Material {

    public Madera() {
        super(10);
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
    public EstadoHerramienta fabricar(Pico pico) {
        return new EstadoPicoMadera();
    }

    @Override
    public EstadoHerramienta fabricar(Hacha hacha) {
        return new EstadoHachaMadera();
    }

    @Override
    public Desgaste tipoDeDesgaste(Pico pico) {
        return new DesgastePorFuerza();
    }

    @Override
    public Desgaste tipoDeDesgaste(Hacha hacha) {
        return new DesgastePorFuerza();
    }

}
