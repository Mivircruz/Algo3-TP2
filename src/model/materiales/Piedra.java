package model.materiales;

import model.herramientas.*;
import model.herramientas.Estados.EstadoHerramienta;
import model.herramientas.Estados.EstadosHacha.EstadoHachaPiedra;
import model.herramientas.Estados.EstadosPico.EstadoPicoPiedra;
import model.herramientas.desgastes.Desgaste;
import model.herramientas.desgastes.DesgastePorDivision;
import model.herramientas.desgastes.DesgastePorFuerza;

public class Piedra extends Material {

    public Piedra(){
        super(30);
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

    @Override
    public Desgaste tipoDeDesgaste(Pico pico) {
        return new DesgastePorDivision(1.5f);
    }

    @Override
    public Desgaste tipoDeDesgaste(Hacha hacha) {
        return new DesgastePorFuerza();
    }
}
