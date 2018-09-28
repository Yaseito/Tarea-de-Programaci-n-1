/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Familia_Borja_Li
 */
class Ejercicio5 {

    public static void respuesta() {
        //Valores de la matriz 1//
        int nNumeroFilas = 0;
        int nNumeroColumnas = 0;
        int nValorMaximo = 0;
        int nValorMinimo = 0;
        //Valores de la matriz 2//
        int nNumeroFilas2 = 0;
        int nNumeroColumnas2 = 0;
        int nValorMaximo2 = 0;
        int nValorMinimo2 = 0;
        String MensajeError = "";
        MensajeError += "No ha ingresado número";
        String MensajeError2 = "";
        MensajeError2 += "No puede salir del programa";
        try {
            nNumeroFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el # de Filas de matriz 1: "));
            nNumeroColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el # de Columnas de matriz 1: "));
            nValorMinimo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Valor Minimo de matriz 1: "));
            nValorMaximo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Valor Maximo de matriz 1: "));

            nNumeroFilas2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el # de Filas de matriz 2: "));
            nNumeroColumnas2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el # de Columnas de matriz 2 : "));
            nValorMinimo2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Valor Minimo de matriz 2 : "));
            nValorMaximo2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Valor Maximo de matriz 2 : "));
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, MensajeError);
        } catch (NullPointerException e) {

            JOptionPane.showMessageDialog(null, MensajeError2);
        }
        JOptionPane.showMessageDialog(null, ImpresionMatriz2(DevuelveMatriz2(nNumeroFilas2, nNumeroColumnas2,
                nValorMaximo2, nValorMinimo2), nNumeroFilas2, nNumeroColumnas2));

        JOptionPane.showMessageDialog(null, Comparar(DevuelveMatriz2(nNumeroFilas2, nNumeroColumnas2,
                nValorMaximo2, nValorMinimo2), DevuelveMatriz(nNumeroFilas, nNumeroColumnas, nValorMaximo, nValorMinimo)));
    }

    public static String Comparar(int[][] p_matriz, int[][] p_matriz2) {
        String sLista = "";
        if (Arrays.equals(p_matriz, p_matriz2)) {
            sLista += "Son matrices iguales";

        } else {
            sLista += "Son matrices diferentes";
        }
        return sLista;

    }

    public static String ImpresionMatriz(int[][] p_matriz, int p_numero_filas, int p_numero_columnas) {
        String sLista = "Matriz Devuelta\n";
        int x = 0;
        for (int i = 0; i < p_numero_filas; i++) {
            sLista += "Matriz[" + (i) + "]";
            for (int j = 0; j < p_numero_columnas; j++) {
                // Llenar Mi Matriz
                sLista += "[" + (j) + "] = " + p_matriz[i][j] + "\n";
                if (p_matriz[i][j] != p_matriz[j][i]) {
                    continue;
                } else {
                    x = x + 1;
                }
            }

        }

        if (p_numero_filas == p_numero_columnas) {
            sLista += "Es una matriz cuadrada\n";
        }
        if (x == p_numero_filas * (p_numero_columnas - 1)) {
            sLista += "Es una matriz simétrica\n";
        }
        return sLista;
    }

    public static int[][] DevuelveMatriz(int p_numero_filas, int p_numero_columnas,
            int p_al_vmax, int p_al_vmin) {

        int[][] matriz_retorno = new int[p_numero_filas][p_numero_columnas];

        for (int i = 0; i < p_numero_filas; i++) {
            for (int j = 0; j < p_numero_columnas; j++) {
                // Llenar Mi Matriz

                matriz_retorno[i][j] = DevuleveNumeroAleatorio(p_al_vmax, p_al_vmin);

            }

        }

        return matriz_retorno;

    }

    public static int DevuleveNumeroAleatorio(int p_al_vmax, int p_al_vmin) {
        int nNumeroAleatorio = 0;

        nNumeroAleatorio = (int) (Math.random() * (p_al_vmax - p_al_vmin));

        return nNumeroAleatorio;
    }

    public static String ImpresionMatriz2(int[][] p_matriz, int p_numero_filas, int p_numero_columnas) {
        String sLista = "Matriz Devuelta\n";
        int x = 0;
        for (int i = 0; i < p_numero_filas; i++) {
            sLista += "Matriz[" + (i) + "]";
            for (int j = 0; j < p_numero_columnas; j++) {
                // Llenar Mi Matriz
                sLista += "[" + (j) + "] = " + p_matriz[i][j] + "\n";
                if (p_matriz[i][j] != p_matriz[j][i]) {
                    continue;
                } else {
                    x = x + 1;
                }
            }

        }
        if (p_numero_filas == p_numero_columnas) {
            sLista += "Es una matriz cuadrada\n";
        }
        if (x == p_numero_filas * (p_numero_columnas - 1)) {
            sLista += "Es una matriz simétrica\n";
        }
        return sLista;
    }

    public static int[][] DevuelveMatriz2(int p_numero_filas, int p_numero_columnas,
            int p_al_vmax, int p_al_vmin) {

        int[][] matriz_retorno = new int[p_numero_filas][p_numero_columnas];

        for (int i = 0; i < p_numero_filas; i++) {
            for (int j = 0; j < p_numero_columnas; j++) {
                // Llenar Mi Matriz

                matriz_retorno[i][j] = DevuleveNumeroAleatorio(p_al_vmax, p_al_vmin);

            }

        }

        return matriz_retorno;

    }

    public static int DevuleveNumeroAleatorio2(int p_al_vmax, int p_al_vmin) {
        int nNumeroAleatorio = 0;

        nNumeroAleatorio = (int) (Math.random() * (p_al_vmax - p_al_vmin));

        return nNumeroAleatorio;
    }

}
