package model.herramientas;

import model.materiales.*;

public abstract class HerramientaConMaterial extends Herramienta{

    protected Material material;

    HerramientaConMaterial(Material material) {
        this.material = material;
    }

    public void restarDurabilidad() {
        material.restarDurabilidad(this);
    }

    public abstract void restarDurabilidad(Madera madera);
    public abstract void restarDurabilidad(Metal metal);
    public abstract void restarDurabilidad(Piedra piedra);
}
