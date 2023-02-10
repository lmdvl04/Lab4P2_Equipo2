/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo2;

/**
 *
 * @author HTS
 */
public class Torre extends Pieza{

    public Torre() {
        super();
    }

    public Torre(String nombre, boolean blanco, boolean negro, int x, int y) {
        super(nombre, blanco, negro, x, y);
        if (blanco){
            this.nombre="R";
        }else if (negro){
            this.nombre="r";
        }
    }

    @Override
    public boolean movimiento(Object[][] matriz, int actualx, int actualy, int destinox, int destinoy) {
        boolean valido=false;

        if (matriz.length - 1 >= destinox && matriz[0].length - 1 >= destinoy) {
            if(actualx == destinox || actualy == destinoy){
                valido = true;
            }else{
                valido=false;
            }
        }
      return valido; 
    }
    
    
}
