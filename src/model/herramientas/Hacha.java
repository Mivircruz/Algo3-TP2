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
        desgaste = material.tipoDeDesgaste(this);
    }

    @Override
    public void golpear(Material material) {
        material.esGolpeadoPor(this);
    }

    @Override
    public void golpear(Madera madera) {
        restarDurabilidad();
        estado.golpear(madera, fuerza);
    }

    @Override
    public void golpear(Piedra piedra) {
        restarDurabilidad();
        estado.golpear(piedra, fuerza);
    }

    @Override
    public void golpear(Metal metal) {
        restarDurabilidad();
        estado.golpear(metal, fuerza);
    }

}