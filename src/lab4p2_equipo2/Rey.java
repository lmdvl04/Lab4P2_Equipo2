/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo2;

/**
 *
 * @author HTS
 */
public class Rey extends Pieza{

    public Rey() {
        super();
    }

    public Rey(String nombre, boolean blanco, boolean negro, int x, int y) {
        super(nombre, blanco, negro, x, y);
        if (blanco){
            this.nombre="K";
        }else if(negro){
            this.nombre="k";
        }
    }

    @Override
    public boolean movimiento(Object[][] matriz, int actualx, int actualy, int destinox, int destinoy) {
      
    }
    
    
    
}
