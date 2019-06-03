import java.util.Objects;

public abstract class Material {

    //Atributos

    protected int durabilidad;
    protected Herramienta puedeRomperMaterial;


    //Metodos

    //Implementados

    public int durabilidad() {

        return durabilidad;
    }

    public void romperCon(Herramienta herramienta){
        if(puedeRomperMaterial.getClass().equals(herramienta.getClass())){
            durabilidad -= herramienta.fuerza();
        }
    }

    //Abstractos

    public abstract int durabilidadEnHerramienta();
    public abstract int fuerzaEnHacha();
    public abstract int fuerzaEnPico();
}
