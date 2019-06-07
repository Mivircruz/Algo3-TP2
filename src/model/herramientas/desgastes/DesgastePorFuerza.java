package model.herramientas.desgastes;

public class DesgastePorFuerza implements Desgaste {

    @Override
    public float desgastar(float durabilidad, int fuerza) {
        return durabilidad - fuerza;
    }
}
