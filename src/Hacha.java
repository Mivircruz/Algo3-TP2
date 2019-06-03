public class Hacha extends Herramienta{


    public Hacha(Material material){
        super();
        durabilidad = material.durabilidadEnHerramienta();
        fuerza = material.fuerzaEnHacha();
        this.material = material;
    }

}