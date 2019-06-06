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
        estado = material.fabricar(this);
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