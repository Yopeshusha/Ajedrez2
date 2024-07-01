package ajedrez2;
import java.util.Scanner;

public class PawnMeneandose {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        int matriz [][] = new int [8][8];
        int x = leer.nextInt();
        int y = leer.nextInt();
        pawn(matriz, x, y);
    }
    public static void pawn(int matriz[][], int x, int y){
        for (int i = 0 ; i < 8 ; i ++){
            for (int j = 0 ; j < 8 ; j ++){
                if ((j == y-1) && ((i == x-2) || (i == x-1))){
                    matriz[i][j] = 1;
                }else{
                    matriz [i][j] = 0;
                }
            }
        }
        for (int i = 0 ; i < 8 ; i ++){
            for (int j = 0 ; j < 8 ; j ++){
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }
    }
}
