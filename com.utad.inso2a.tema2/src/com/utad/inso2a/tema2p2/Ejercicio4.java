package com.utad.inso2a.tema2p2;

public class Ejercicio4 {
	public int[][] multiplicacionMatrices(int[][] matriz1, int [][] matriz2){
        int[][] matrizResultado = new int[matriz1.length][matriz2[0].length];

        for(int i=0; i<matriz1.length; i++) {
            for(int j= 0; j<matriz2[0].length; j++) {
                for(int k=0; k<matriz1[0].length;k++) {
                	matrizResultado[i][j]+=matriz1[i][k]*matriz2[k][j];
                }
            }
        }
        return matrizResultado;
    }

    public static void main(String[] args) {
        int[][] matriz1 = {{1,2,3},
                          {4,5,6}};

        int[][] matriz2 = {{7,8},
                          {9,1},
                          {2,3}};
        Ejercicio4 calculo = new Ejercicio4();
        int[][] matrizResultado= calculo.multiplicacionMatrices(matriz1, matriz2);

        for(int i=0; i<2;i++) {
            for(int j=0; j<2; j++) {
                System.out.printf("%d ", matrizResultado[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
