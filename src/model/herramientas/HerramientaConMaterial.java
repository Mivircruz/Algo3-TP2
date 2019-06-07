package model.herramientas;

import model.herramientas.Estados.EstadoHerramienta;
import model.herramientas.desgastes.Desgaste;
import model.materiales.*;

public abstract class HerramientaConMaterial extends Herramienta {

    protected Material material;
    protected EstadoHerramienta estado;

    HerramientaConMaterial(Material material) {
        this.material = material;
    }

    public Material material() {
        return material;
    }

}
