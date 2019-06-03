public class Piedra extends Material{

    public Piedra(){
        super();
        durabilidad = 30;
        puedeRomperMaterial = new Pico(new Madera());
    }

    @Override
    public int durabilidadEnHerramienta(){
        return 200;
    }

    @Override
    public int fuerzaEnHacha(){
        return 2;
    }

    @Override
    public int fuerzaEnPico(){
        return 5;
    }

}
