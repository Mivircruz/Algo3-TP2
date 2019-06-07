package model.herramientas.desgastes;


public class DesgastePorDivision implements Desgaste {

    private float divisor;

    public DesgastePorDivision(float divisor) {
        this.divisor = divisor;
    }

    @Override
    public float desgastar(float durabilidad, int fuerza) {
        durabilidad -= fuerza / divisor;
        return durabilidad;
    }
}
