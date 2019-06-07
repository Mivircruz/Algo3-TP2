package model.herramientas;

import model.materiales.*;

public class Pico extends HerramientaConMaterial {

    public Pico(Material material) {
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
