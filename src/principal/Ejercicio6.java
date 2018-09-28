/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia_Borja_Li
 */
class Ejercicio6 {

    public static void respuesta() {
        String sLista = "";
        String MensajeError = "";
        MensajeError += "No ha ingresado número";
        String MensajeError2 = "";
        MensajeError2 += "No puede salir del programa";
        try {
            int[][] matriz = {{3, 2, 4}, {4, 3, 2}};
            int[][] matriz2 = {{2, 3, 1}, {3, 4, 1}};
            int nNumeroFilas = matriz.length;
            int nNumeroColumnas = matriz[0].length;
            int nNumeroFilas2 = matriz2.length;
            int nNumeroColumnas2 = matriz2[0].length;
            sLista += "La suma de la matriz es: " + Filas(nNumeroFilas, nNumeroFilas2, nNumeroColumnas, nNumeroColumnas2) + "\n";
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, MensajeError);
        } catch (NullPointerException e) {

            JOptionPane.showMessageDialog(null, MensajeError2);
        }
        JOptionPane.showMessageDialog(null, sLista);
    }

    public static String Filas(int N_Filas, int N_Filas_2, int N_Columna, int N_Columna_2) {
        int[][] matriz = {{3, 2, 4}, {4, 3, 2}};
        int[][] matriz2 = {{2, 3, 1}, {3, 4, 1}};
        int[][] smatriz = new int[N_Filas][N_Columna];
        String sLista = "Matriz Devuelta\n";
        if (N_Filas == N_Filas_2 && N_Columna == N_Columna_2) {
            for (int i = 0; i < N_Filas; i++) {
                for (int j = 0; j < N_Columna; j++) {
                    // Sumar matrices
                    smatriz[i][j] = matriz[i][j] + matriz2[i][j];
                    sLista += smatriz[i][j] + " ";
                }
                sLista += "\n";
            }
        } else {
            for (int i = 0; i < N_Filas; i++) {
                for (int j = 0; j < N_Columna; j++) {
                    // Sumar matrices
                    smatriz[i][j] = 0;
                    sLista += smatriz[i][j] + " ";
                }
                sLista += "\n";
            }
        }

        return sLista;
    }

}
