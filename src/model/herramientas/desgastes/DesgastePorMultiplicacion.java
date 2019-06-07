package model.herramientas.desgastes;


public class DesgastePorMultiplicacion implements Desgaste {

    private float multiplicante;

    public DesgastePorMultiplicacion(float multiplicante) {
        this.multiplicante = multiplicante;
    }

    @Override
    public float desgastar(float durabilidad, int fuerza) {
        durabilidad -= durabilidad * multiplicante;
        return durabilidad;
    }

}
