package lab4p2_equipo2;

import java.util.Scanner;

public class Lab4P2_Equipo2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Object[][] tablero = new Object[8][8];
        System.out.print("Ingrese el nombre del jugador 1: ");
        String nombre1 = leer.nextLine();
        System.out.println("Ingrese el nombre del jugador 2: ");
        String nombre2 = leer.nextLine();
        boolean blanco = true;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = " ";
            }
        }

        tablero[0][0] = new Torre("T", true, false, 0, 0);
        tablero[0][1] = new Caballo("C", true, false, 0, 1);
        tablero[0][2] = new Alfil("A", true, false, 0, 2);
        tablero[0][3] = new Reina("Q", true, false, 0, 3);
        tablero[0][4] = new Rey("K", true, false, 0, 4);
        tablero[0][5] = new Alfil("A", true, false, 0, 5);
        tablero[0][6] = new Caballo("C", true, false, 0, 6);
        tablero[0][7] = new Torre("T", true, false, 0, 7);
        tablero[7][0] = new Torre("t", false, true, 7, 0);
        tablero[7][1] = new Caballo("c", false, true, 7, 1);
        tablero[7][2] = new Alfil("a", false, true, 7, 2);
        tablero[7][3] = new Reina("q", false, true, 7, 3);
        tablero[7][4] = new Rey("k", false, true, 7, 4);
        tablero[7][5] = new Alfil("a", false, true, 7, 5);
        tablero[7][6] = new Caballo("c", false, true, 7, 6);
        tablero[7][7] = new Torre("t", false, true, 7, 7);
        for (int j = 0; j < 8; j++) {
            tablero[1][j] = new Peon("P", true, false, 1, j);
        }
        for (int j = 0; j < 8; j++) {
            tablero[6][j] = new Peon("p", false, true, 6, j);
        }
        
        boolean terminar = false;
        boolean nicaso = false;
        boolean mover;
        do {
            System.out.println("  A  B  C  D  E  F  G  H");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print(i);
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print("[" + tablero[i][j].toString() + "]");
            }
            System.out.println();
        }
            if (blanco) {
                System.out.println(nombre1+" ponete viv@, move algo");
            }else{
                System.out.println(nombre2+" viv@ chaval@");
            }
            System.out.print("Ingrese la cadena (pieza)|ubicacion actual-destino: ");
            String cadena = leer.nextLine();
            if(cadena.toLowerCase().equals("gusbai")){
                System.out.println("cheke");
                terminar = true;
            }else{
            String movimiento[] = cadena.split("\\|");
            String posactual = movimiento[0];
            String demas = movimiento[1];
                System.out.println(posactual+" "+demas);
            char tipo = posactual.charAt(0);
            int actualc = valorchar(demas.charAt(0));
            int actualc2 = (int) demas.charAt(1)-48;
            int nuevoc = valorchar(demas.charAt(3));
            int nuevoc2 = (int) demas.charAt(4)-48;
                System.out.println(actualc+" "+actualc2+" "+nuevoc+" "+nuevoc2);
            if (blanco) {
                switch (tipo) {
                    case 'P':
                        mover = ((Pieza) (tablero[actualc2][actualc])).movimiento(tablero, actualc2, actualc, nuevoc2, nuevoc);
                        if (mover) {
                            if (((Peon) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Rey) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Reina) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Torre) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Alfil) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Caballo) (tablero[nuevoc2][nuevoc])).isBlanco()) {
                                tablero[actualc2][actualc] = " ";
                                tablero[nuevoc2][nuevoc] = new Peon("P", true, false, nuevoc2, nuevoc);
                                mover = true;
                                System.out.println("No puede esta es un blanca");
                                mover = false;
                            } else {
                                tablero[actualc2][actualc] = " ";
                                tablero[nuevoc2][nuevoc] = new Peon("P", true, false, nuevoc2, nuevoc);
                                mover = true;
                            }
                        } else {
                            System.out.println("No se puede mover de esa manera");
                            mover = false;
                        }
                        nicaso = true;
                        break;
                    case 'N':
                        int actualcc = valorchar(demas.charAt(0));
                        int actualcc2 = Character.getNumericValue(1);
                        int nuevocc = valorchar(demas.charAt(3));
                        int nuevocc2 = Character.getNumericValue(4);
                        mover = ((Pieza) (tablero[actualcc2][actualcc])).movimiento(tablero, actualcc2, actualcc, nuevocc2, nuevocc);
                        if (mover) {
                            if (((Peon) (tablero[nuevocc2][nuevocc])).isBlanco() || ((Rey) (tablero[nuevocc2][nuevocc])).isBlanco() || ((Reina) (tablero[nuevocc2][nuevocc])).isBlanco() || ((Torre) (tablero[nuevocc2][nuevocc])).isBlanco() || ((Alfil) (tablero[nuevocc2][nuevocc])).isBlanco() || ((Caballo) (tablero[nuevocc2][nuevocc])).isBlanco()) {
                                System.out.println("No puede esta es un blanca");
                                mover = false;
                            } else {
                                tablero[actualcc2][actualcc] = " ";
                                tablero[nuevocc2][nuevocc] = new Caballo("N", true, false, nuevocc2, nuevocc);
                                mover = true;
                            }
                        } else {
                            System.out.println("No se puede mover ahi");
                            mover = false;
                        }

                        nicaso = true;
                        break;
                    case 'B':
                        mover = ((Pieza) (tablero[actualc2][actualc])).movimiento(tablero, actualc2, actualc, nuevoc2, nuevoc);
                        if (mover) {
                            if (((Peon) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Rey) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Reina) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Torre) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Alfil) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Caballo) (tablero[nuevoc2][nuevoc])).isBlanco()) {
                                System.out.println("No puede esta es un blanca");
                                mover = false;
                            } else {
                                tablero[actualc2][actualc] = " ";
                                tablero[nuevoc2][nuevoc] = new Alfil("B", true, false, nuevoc2, nuevoc);
                                mover = true;
                            }
                        } else {
                            System.out.println("No se puede mover de esa manera");
                            mover = false;
                        }
                        nicaso = true;
                        break;
                    case 'R':
                        mover = ((Pieza) (tablero[actualc2][actualc])).movimiento(tablero, actualc2, actualc, nuevoc2, nuevoc);
                        if (mover) {
                            if (((Peon) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Rey) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Reina) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Torre) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Alfil) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Caballo) (tablero[nuevoc2][nuevoc])).isBlanco()) {
                                System.out.println("No puede esta es un blanca");
                                mover = false;
                            } else {
                                tablero[actualc2][actualc] = " ";
                                tablero[nuevoc2][nuevoc] = new Torre("R", true, false, nuevoc2, nuevoc);
                                mover = true;
                            }
                        } else {
                            System.out.println("No se puede mover de esa manera");
                            mover = false;
                        }
                        nicaso = true;
                        break;
                    case 'Q':
                        mover = ((Pieza) (tablero[actualc2][actualc])).movimiento(tablero, actualc2, actualc, nuevoc2, nuevoc);
                        if (mover) {
                            if (((Peon) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Rey) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Reina) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Torre) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Alfil) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Caballo) (tablero[nuevoc2][nuevoc])).isBlanco()) {
                                System.out.println("No puede esta es un blanca");
                                mover = false;
                            } else {
                                tablero[actualc2][actualc] = " ";
                                tablero[nuevoc2][nuevoc] = new Reina("Q", true, false, nuevoc2, nuevoc);
                                mover = true;
                            }
                        } else {
                            System.out.println("No se puede mover de esa manera");
                            mover = false;
                        }
                        nicaso = true;
                        break;
                    case 'K':
                        mover = ((Pieza) (tablero[actualc2][actualc])).movimiento(tablero, actualc2, actualc, nuevoc2, nuevoc);
                        if (mover) {
                            if (((Peon) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Rey) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Reina) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Torre) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Alfil) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Caballo) (tablero[nuevoc2][nuevoc])).isBlanco()) {
                                System.out.println("No puede esta es un blanca");
                                mover = false;
                            } else {
                                tablero[actualc2][actualc] = " ";
                                tablero[nuevoc2][nuevoc] = new Rey("K", true, false, nuevoc2, nuevoc);
                                mover = true;
                            }
                        } else {
                            System.out.println("No se puede mover de esa manera");
                            mover = false;
                        }
                        nicaso = true;
                        break;
                    default:
                        System.out.println("Ingreso un tipo no valido");
                        nicaso = false;
                        break;
                }
                blanco = false;
            }else{
                switch (tipo){
                    case 'p':
                        mover = ((Pieza) (tablero[actualc2][actualc])).movimiento(tablero, actualc2, actualc, nuevoc2, nuevoc);
                        if (mover) {
                            if (((Peon) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Rey) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Reina) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Torre) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Alfil) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Caballo) (tablero[nuevoc2][nuevoc])).isBlanco()) {
                                System.out.println("No puede esta es un blanca");
                                mover = false;
                            } else {
                                tablero[actualc2][actualc] = " ";
                                tablero[nuevoc2][nuevoc] = new Peon("p", false, true, nuevoc2, nuevoc);
                                mover = true;
                            }
                        } else {
                            System.out.println("No se puede mover de esa manera");
                            mover = false;
                        }
                        nicaso = true;
                        break;
                    case 'n':
                        mover = ((Pieza) (tablero[actualc2][actualc])).movimiento(tablero, actualc2, actualc, nuevoc2, nuevoc);
                        if (mover) {
                            if (((Peon) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Rey) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Reina) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Torre) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Alfil) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Caballo) (tablero[nuevoc2][nuevoc])).isBlanco()) {
                                System.out.println("No puede esta es un blanca");
                                mover = false;
                            } else {
                                tablero[actualc2][actualc] = " ";
                                tablero[nuevoc2][nuevoc] = new Caballo("n", false, true, nuevoc2, nuevoc);
                                mover = true;
                            }
                        } else {
                            System.out.println("No se puede mover de esa manera");
                            mover = false;
                        }
                        nicaso = true;
                        break;
                    case 'b':
                        mover = ((Pieza) (tablero[actualc2][actualc])).movimiento(tablero, actualc2, actualc, nuevoc2, nuevoc);
                        if (mover) {
                            if (((Peon) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Rey) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Reina) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Torre) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Alfil) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Caballo) (tablero[nuevoc2][nuevoc])).isBlanco()) {
                                System.out.println("No puede esta es un blanca");
                                mover = false;
                            } else {
                                tablero[actualc2][actualc] = " ";
                                tablero[nuevoc2][nuevoc] = new Alfil("b", false, true, nuevoc2, nuevoc);
                                mover = true;
                            }
                        } else {
                            System.out.println("No se puede mover de esa manera");
                            mover = false;
                        }
                        nicaso = true;
                        break;
                    case 'r':
                        mover = ((Pieza) (tablero[actualc2][actualc])).movimiento(tablero, actualc2, actualc, nuevoc2, nuevoc);
                        if (mover) {
                            if (((Peon) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Rey) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Reina) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Torre) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Alfil) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Caballo) (tablero[nuevoc2][nuevoc])).isBlanco()) {
                                System.out.println("No puede esta es un blanca");
                                mover = false;
                            } else {
                                tablero[actualc2][actualc] = " ";
                                tablero[nuevoc2][nuevoc] = new Torre("r", false, true, nuevoc2, nuevoc);
                                mover = true;
                            }
                        } else {
                            System.out.println("No se puede mover de esa manera");
                            mover = false;
                        }
                        nicaso = true;
                        break;
                    case 'q':
                        mover = ((Pieza) (tablero[actualc2][actualc])).movimiento(tablero, actualc2, actualc, nuevoc2, nuevoc);
                        if (mover) {
                            if (((Peon) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Rey) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Reina) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Torre) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Alfil) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Caballo) (tablero[nuevoc2][nuevoc])).isBlanco()) {
                                System.out.println("No puede esta es un blanca");
                                mover = false;
                            } else {
                                tablero[actualc2][actualc] = " ";
                                tablero[nuevoc2][nuevoc] = new Reina("q", false, true, nuevoc2, nuevoc);
                                mover = true;
                            }
                        } else {
                            System.out.println("No se puede mover de esa manera");
                            mover = false;
                        }
                        nicaso = true;
                        break;
                    case 'k':
                        mover = ((Pieza) (tablero[actualc2][actualc])).movimiento(tablero, actualc2, actualc, nuevoc2, nuevoc);
                        if (mover) {
                            if (((Peon) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Rey) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Reina) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Torre) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Alfil) (tablero[nuevoc2][nuevoc])).isBlanco() || ((Caballo) (tablero[nuevoc2][nuevoc])).isBlanco()) {
                                System.out.println("No puede esta es un blanca");
                                mover = false;
                            } else {
                                tablero[actualc2][actualc] = " ";
                                tablero[nuevoc2][nuevoc] = new Rey("k", false, true, nuevoc2, nuevoc);
                                mover = true;
                            }
                        } else {
                            System.out.println("No se puede mover de esa manera");
                            mover = false;
                        }
                        nicaso = true;
                        break;
                    default:
                        System.out.println("Ingreso un tipo no valido");
                        break;
                }
                blanco = true;
            }
        }

        } while (terminar == false);
    }


    public static int valorchar(char valor) {
        int cual;
        switch (valor) {
            case 'A', 'a':
                cual = 0;
                break;
            case 'B', 'b':
                cual = 1;
                break;
            case 'C', 'c':
                cual = 2;
                break;
            case 'D','d':
                cual = 3;
                break;
            case 'e', 'E':
                cual = 4;
                break;
            case 'F','f':
                cual = 5;
                break;
            case 'G', 'g':
                cual = 6;
                break;
            case 'H', 'h':
                cual = 7;
                break;
            default:
                cual = 99;
                break;
        }
        return cual;
    }
}
