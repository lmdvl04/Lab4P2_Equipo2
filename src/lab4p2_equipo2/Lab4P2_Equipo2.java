package lab4p2_equipo2;

public class Lab4P2_Equipo2 {

    public static void main(String[] args) {
        Object[][] tablero = new Object[8][8];
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
        System.out.println("  A  B  C  D  E  F  G  H");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print(i);
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print("["+tablero[i][j].toString()+"]" );
            }
            System.out.println();
        }
        boolean terminar = false;
        do{
            System.out.print("Ingrese ");
        }while(terminar==false);
    }
}
