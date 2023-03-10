/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo2;

/**
 *
 * @author HTS
 */
public class Reina extends Pieza{

    public Reina() {
        super();
    }

    public Reina(String nombre, boolean blanco, boolean negro, int x, int y) {
        super(nombre, blanco, negro, x, y);
        if (blanco){
            this.nombre="Q";
        }else if (negro){
            this.nombre="q";
        }
    }

    @Override
    public boolean movimiento(Object[][] matriz, int actualx, int actualy, int destinox, int destinoy) {
        boolean valido=false;

        if (matriz.length - 1 >= destinox && matriz[0].length - 1 >= destinoy) {
            if(actualx == destinox || actualy == destinoy){
                valido = true;
            }else if ((actualx != destinox || actualy != destinoy)&&(destinox == destinoy)) {
                valido = true;
            } else{
                valido = false;
            }
        }
        return valido;
    }
    
    
}
