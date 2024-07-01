package ajedrez2;
import java.util.Scanner;

public class KnightMeneandose {
    public static void main(String[] args){
        Scanner leer = new Scanner (System.in);
        int x = leer.nextInt();
        int y = leer.nextInt();
        int matriz [][] = new int [8][8];
        
        knight(matriz, x, y);
    }
    public static void knight(int matriz[][], int x, int y){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i == x-2 && (j == y+1 || j == y-1)) ||
                        (i == x-1 && (j == y+2 || j == y-2)) ||
                        (i == x+1 && (j == y+2 || j == y-2)) ||
                        (i == x+2 && (j == y+1 || j == y-1))) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        matriz[x-1][y-1] = 1;
        for (int i = 0 ; i < 8 ; i++){
            for (int j = 0 ; j < 8 ; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }
    }
}
