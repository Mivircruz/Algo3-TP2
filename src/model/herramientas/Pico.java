package model.herramientas;

import model.materiales.*;

public class Pico extends HerramientaConMaterial {

    public Pico(Material material) {
        super(material);
        durabilidad = material.durabilidadEn(this);
        fuerza = material.fuerzaEn(this);
        estado = material.fabricar(this);
    }

    @Override
    public void restarDurabilidad(Madera madera) {
        durabilidad -= fuerza;
    }

    @Override
    public void restarDurabilidad(Piedra piedra) {
        durabilidad -= (fuerza/1.5);
    }


    @Override
    public void restarDurabilidad(Metal metal) {
        //TODO, meter un contador. Posiblemente habria que implementar una clase nueva "desgaste" para que se encargue de eso.
    }

    @Override
    public void golpear(Material material) {
        material.esGolpeadoPor(this);
    }

    @Override
    public void golpear(Madera madera) {
        material.restarDurabilidad(this);
        estado.golpear(madera, fuerza);
    }

    @Override
    public void golpear(Piedra piedra) {
        material.restarDurabilidad(this);
        estado.golpear(piedra, fuerza);
    }

    @Override
    public void golpear(Metal metal) {
        material.restarDurabilidad(this);
        estado.golpear(metal, fuerza);
    }
}
