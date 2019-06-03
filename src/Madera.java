public class Madera {

    private int durabilidad = 10;

    public int durabilidad() {
        return durabilidad;
    }

    public void recibirGolpe(){
        durabilidad -= 2;
    }
}
