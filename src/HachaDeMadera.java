public class HachaDeMadera {

    int durabilidad = 100;
    int fuerza = 2;

    public int getDurabilidad(){
        return this.durabilidad;
    }

    public int getFuerza(){
        return this.fuerza;
    }

    public void golpear(Madera madera){
        madera.recibirGolpe();

    }
}
