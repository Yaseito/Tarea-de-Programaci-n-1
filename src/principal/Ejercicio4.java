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
class Ejercicio4 {

    public static void respuesta() {
        String sLista = "";
        String MensajeError = "";
        MensajeError += "No ha ingresado número";
        String MensajeError2 = "";
        MensajeError2 += "No puede salir del programa";
        try {
        int[][] matriz = {{3, 2, 4}, {4, 3, 2}};
        int nNumeroFilas = matriz.length;
        int nNumeroColumnas = matriz[0].length;
        
            sLista += "El número de Filas es: " + Filas(nNumeroFilas) + "\n";
            sLista += "El número de Columnas es: " + Columnas(nNumeroColumnas) + "\n";
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, MensajeError);
        } catch (NullPointerException e) {

            JOptionPane.showMessageDialog(null, MensajeError2);
        }
        JOptionPane.showMessageDialog(null, sLista);
    }

    public static int Filas(int N_Filas) {
        int cont = 0;
        for (int i = 0; i < N_Filas; i++) {
            cont = cont + 1;
        }

        return cont;
    }

    public static int Columnas(int N_Columnas) {

        int cont2 = 0;
        for (int j = 0; j < N_Columnas; j++) {
            cont2 = cont2 + 1;
        }

        return cont2;
    }
}
