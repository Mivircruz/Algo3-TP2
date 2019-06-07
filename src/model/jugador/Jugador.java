package model.jugador;

import model.herramientas.Hacha;
import model.herramientas.Herramienta;
import model.materiales.Madera;
import model.materiales.Material;

public class Jugador {

    protected Herramienta herramientaEquipada;
    
    public Jugador () {
        this.herramientaEquipada = new Hacha (new Madera ());
    }

    public Herramienta obtenerHerramientaEquipada() {
        return herramientaEquipada;
    }
    public void usarHerramientaEquipadaSobre(Material material) {
        herramientaEquipada.golpear(material);
    }
}
