public class Pico extends Herramienta{

    public Pico(Material material){
        super();
        durabilidad = material.durabilidadEnHerramienta();
        fuerza = material.fuerzaEnPico();
        this.material = material;
    }

}
