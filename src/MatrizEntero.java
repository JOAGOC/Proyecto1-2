
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Angel Gabriel
 */
public class MatrizEntero {

    private int ren, col, M[][];

    public MatrizEntero() {
        ren = col = 3;
        M = new int[ren][col];
    }

    public MatrizEntero(int r, int c) {
        ren = r;
        col = c;
        M = new int[ren][col];
    }

    public MatrizEntero(int t) {
        ren = t;
        col = t;
        M = new int[ren][col];
    }

    public int getRen() {
        return ren;
    }

    public void setRen(int ren) {
        this.ren = ren;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int[][] getM() {
        return M;
    }

    public void setM(int[][] M) {
        this.M = M;
        this.ren = M.length;
        this.col = M.length;
    }

    public long identidad() {
        long startTime = System.nanoTime();//1
        try { //     1        (n+1)   n    
            for (int i = 0; i < ren; i++) {
                M[i][i] = 1;//1
            }//n(1) = n + (n+2) = 2n+2 + (2) = 2n+4
        } catch (Exception e) {
        }
        return System.nanoTime() - startTime;//1
    }

    public long identidad(int c) {
        long startTime = System.nanoTime(); //1
        //         1     (n+1)    n
        for (int i = 0; i < col; i++) {
            //       1      (n+1)   n
            for (int j = 0; j < ren; j++) {
                M[i][j] = (i == j) ? 1 : 0;//1
            } //1(n) = n + (n+2) = 2n+2 => 2n+2(n) = 2n^2 + 2n + (n+2) = 2n^2+3n+2 => 2n^2+3n+4
        }
        return System.nanoTime() - startTime;//1
    }
    
    public long inicializar() {
        long startTime = System.nanoTime(); //1
        //         1     (n+1)    n
        for (int i = 0; i < ren; i++) {
            //       1      (n+1)   n
            for (int j = 0; j < col; j++) {
                M[i][j] = (int)(Math.random()*9);//1
            } //1(n) = n + (n+2) = 2n+2 => 2n+2(n) = 2n^2 + 2n + (n+2) = 2n^2+3n+2 => 2n^2+3n+4
        }
        return System.nanoTime() - startTime;//1
    }

}
