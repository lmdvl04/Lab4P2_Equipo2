/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo2;

/**
 *
 * @author HTS
 */
public class Peon extends Pieza{

    public Peon() {
        super();
    }

    public Peon(String nombre, boolean blanco, boolean negro, int x, int y) {
        super(nombre, blanco, negro, x, y);
        if (blanco){
            this.nombre="P";
        }else{
            this.nombre="p";
        }
        
        
    }
    
    
    
    
    
}
