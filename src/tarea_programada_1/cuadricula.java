/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_programada_1;

/**
 *
 * @author Kelchan
 */
public class cuadricula {
    public class Cuadricula {
    int[][] grid;
    private int options = 0;
    public Cuadricula(int[][] grid){
    this.grid = grid;
}
    public Cuadricula(){
        grid = new int[8][8];
    }
    public int[][] createGrid(int option){


   switch(options){
    case 1:
    grid = new int[8][8];
    return grid;


    case 2:
    grid = new int[9][9];
    return grid;

    case 3:
    grid = new int[11][11];
    return grid;

    case 4:
    grid = new int[12][12];
    return grid;

    case 5:
    grid = new int[13][13];
    return grid;

    case 6:
    grid = new int[14][14];
    return grid;

    case 7:
    grid = new int[15][15];
    return grid;

    case 8:
    grid = new int[16][16];
    return grid;

    case 9:
    grid = new int[17][17];
    return grid;

    case 10:
    grid = new int[18][18];
    return grid;

    case 11:
    grid = new int[19][19];
    return grid;

    case 12:
    grid = new int[20][20];
    return grid;
} return null;
    }


}
}
