/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo2;

/**
 *
 * @author HTS
 */
public class Peon extends Pieza {

    public Peon() {
        super();
    }

    public Peon(String nombre, boolean blanco, boolean negro, int x, int y) {
        super(nombre, blanco, negro, x, y);
        if (blanco) {
            this.nombre = "P";
        } else if (negro) {
            this.nombre = "p";
        }

    }

    @Override
    public boolean movimiento(Object[][] matriz, int actualx, int actualy, int destinox, int destinoy) {
        boolean valido = false;

        if (matriz.length - 1 >= destinox && matriz[0].length - 1 >= destinoy) {
            if (blanco) {
                if (actualx == 6) {
                    if (destinox == actualx - 2 && actualy == destinoy) {
                        valido = true;
                    } else if (destinox == actualx - 1 && actualy == destinoy) {
                        valido = true;
                    }
                } else {
                    if (destinox == actualx - 1 && actualy == destinoy) {
                        valido = true;
                    }
                }

            }else if(negro){
                if (actualx == 1) {
                    if (destinox == actualx + 2 && actualy == destinoy) {
                        valido = true;
                    } else if (destinox == actualx + 1 && actualy == destinoy) {
                        valido = true;
                    }
                } else {
                    if (destinox == actualx + 1 && actualy == destinoy) {
                        valido = true;
                    }
                }
            }
        }
        return valido;
    }

}
