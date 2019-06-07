package model.materiales;

import model.herramientas.*;
import model.herramientas.Estados.EstadoHerramienta;
import model.herramientas.Estados.EstadosHacha.EstadoHachaMetal;
import model.herramientas.Estados.EstadosPico.EstadoPicoMetal;
import model.herramientas.desgastes.Desgaste;
import model.herramientas.desgastes.DesgastePorCantidadDeUsos;
import model.herramientas.desgastes.DesgastePorDivision;

public class Metal extends Material {

    public Metal() {
        super(50);
    }

    @Override
    public void esGolpeadoPor(Herramienta herramienta) {
        herramienta.golpear(this);
    }

    @Override
    public void esGolpeadoPor(Pico pico) {
        pico.golpear(this);
    }

    @Override
    public void esGolpeadoPor(Hacha hacha) {
        hacha.golpear(this);
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
    public EstadoHerramienta fabricar(Pico pico) {
        return new EstadoPicoMetal();
    }

    @Override
    public EstadoHerramienta fabricar(Hacha hacha) {
        return new EstadoHachaMetal();
    }

    @Override
    public Desgaste tipoDeDesgaste(Pico pico) {
        return new DesgastePorCantidadDeUsos(10);
    }

    @Override
    public Desgaste tipoDeDesgaste(Hacha hacha) {
        return new DesgastePorDivision(2);
    }

}
