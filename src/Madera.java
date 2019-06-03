public class Madera extends Material{

    public Madera(){
        super();
        durabilidad = 10;
        puedeRomperMaterial = new Hacha(new Piedra());
    }

    @Override
    public int durabilidadEnHerramienta(){
        return 100;
    }

    @Override
    public int fuerzaEnHacha(){
        return 2;
    }

    @Override
    public int fuerzaEnPico(){
        return 4;
    }

}
