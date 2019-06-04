package model.herramientas;

import model.materiales.Madera;
import model.materiales.Material;
import model.materiales.Metal;
import model.materiales.Piedra;

public class Pico extends Herramienta {

    public Pico(Material material){
        super(material);
        durabilidad = material.durabilidadEn(this);
        fuerza = material.fuerzaEn(this);
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

}
