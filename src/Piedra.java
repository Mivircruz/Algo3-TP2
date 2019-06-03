public class Piedra {

    private int durabilidad = 30;

    public int durabilidad() {
        return durabilidad;
    }

    public void recibirGolpe(){
        durabilidad -= 2;
    }
}
