/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo2;

/**
 *
 * @author HTS
 */
public abstract class Pieza {
    protected String nombre;
    protected boolean blanco, negro;
    protected int x, y;

    public Pieza() {
    }

    public Pieza(String nombre, boolean blanco, boolean negro, int x, int y) {
        this.nombre = nombre;
        this.blanco = blanco;
        this.negro = negro;
        this.x = x;
        this.y = y;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isBlanco() {
        return blanco;
    }

    public void setBlanco(boolean blanco) {
        this.blanco = blanco;
    }

    public boolean isNegro() {
        return negro;
    }

    public void setNegro(boolean negro) {
        this.negro = negro;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return nombre;
    }
    public abstract boolean movimiento (Object[][] matriz, int actualx, int actualy, int destinox, int destinoy);
        
    
    
    
}
