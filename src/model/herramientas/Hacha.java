package model.herramientas;

import model.materiales.Madera;
import model.materiales.Material;
import model.materiales.Metal;
import model.materiales.Piedra;

public class Hacha extends HerramientaConMaterial {

    public Hacha(Material material) {
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
        durabilidad -= fuerza;
    }

    @Override
    public void restarDurabilidad(Metal metal) {
        durabilidad -= (fuerza/2);
    }

    @Override
    public void golpear(Material material) {
        material.esGolpeadoPor(this);
    }

}