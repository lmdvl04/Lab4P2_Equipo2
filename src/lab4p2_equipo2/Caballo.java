/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo2;

/**
 *
 * @author HTS
 */
public class Caballo extends Pieza {

    public Caballo() {
        super();
    }

    public Caballo(String nombre, boolean blanco, boolean negro, int x, int y) {
        super(nombre, blanco, negro, x, y);
        if (blanco) {
            this.nombre = "N";
        } else if (negro) {
            this.nombre = "n";
        }
    }

    @Override
    public boolean movimiento(Object[][] matriz, int actualx, int actualy, int destinox, int destinoy) {
        boolean valido=false;

        if (matriz.length - 1 >= destinox && matriz[0].length - 1 >= destinoy) {
            if (destinox == actualx + 2 && destinoy == actualy + 1) { //4
                valido = true;
            }else if(destinox == actualx  -2 && destinoy == actualy - 1){//1
                valido = true;
            }else if(destinox == actualx - 2 && destinoy == actualy + 1){//2
                valido = true;
            }else if(destinox == actualx + 2 && destinoy == actualy -1){//3
                valido = true;          
            }else if(destinox == actualx -1 && destinoy == actualy -2){//9
                valido = true;       
            }else if(destinox == actualx - 1 && destinoy == actualy +2){//11
                valido = true;
            }else if(destinox == actualx + 1 && destinoy == actualy -2){//13
                valido = true;
            }else if(destinox == actualx + 1 && destinoy == actualy +2){
                valido = true;
            }else{
                valido = false;
            }


        }
        return valido;
    }


}
