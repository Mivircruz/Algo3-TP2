package model.herramientas.desgastes;


public class DesgastePorCantidadDeUsos implements Desgaste {

    private int contador;

    public DesgastePorCantidadDeUsos(int contador) {
        this.contador = contador;
    }

    @Override
    public float desgastar(float durabilidad, int fuerza) {
        contador--;
        if (contador <= 0) {
            durabilidad -= durabilidad;
        }
        return durabilidad;
    }
}
