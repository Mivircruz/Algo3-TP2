package model.herramientas;

import model.herramientas.Estados.EstadoHerramienta;
import model.materiales.*;

public abstract class HerramientaConMaterial extends Herramienta {

    protected Material material;
    protected EstadoHerramienta estado;

    HerramientaConMaterial(Material material) {
        this.material = material;
    }

    public void restarDurabilidad() {
        material.restarDurabilidad(this);
    }

    public Material material() {
        return material;
    }

    public abstract void restarDurabilidad(Madera madera);
    public abstract void restarDurabilidad(Metal metal);
    public abstract void restarDurabilidad(Piedra piedra);
}
