public abstract class Herramienta {

    //Atributos

    protected int durabilidad;
    protected int fuerza;
    protected Material material;



    //Métodos

    public int fuerza(){
        return fuerza;
    }

    public int durabilidad(){
        return durabilidad;
    }

    public void golpear(Material material){
        material.romperCon(this);
    }

}
