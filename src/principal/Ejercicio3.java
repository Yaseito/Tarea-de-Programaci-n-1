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
class Ejercicio3 {

    public static void respuesta() {
        // TODO code application logic here

        //
        int nNumeroFilas = 0;
        int nNumeroColumnas = 0;
        int nValorMaximo = 0;
        int nValorMinimo = 0;
        String MensajeError = "";
        MensajeError += "No ha ingresado número";
        String MensajeError2 = "";
        MensajeError2 += "No puede salir del programa";
        try {
            nNumeroFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el # de Filas : "));
            nNumeroColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el # de Columnas : "));
            nValorMinimo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Valor Minimo : "));
            nValorMaximo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Valor Maximo : "));
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, MensajeError);
        } catch (NullPointerException e) {

            JOptionPane.showMessageDialog(null, MensajeError2);
        }
        JOptionPane.showMessageDialog(null, ImpresionMatriz(DevuelveMatriz(nNumeroFilas, nNumeroColumnas,
                nValorMaximo, nValorMinimo), nNumeroFilas, nNumeroColumnas));

    }

    public static String ImpresionMatriz(int[][] p_matriz, int p_numero_filas, int p_numero_columnas) {
        String sLista = "Matriz Devuelta\n";
        for (int i = 0; i < p_numero_filas; i++) {
            sLista += "Matriz[" + (i) + "]";
            for (int j = 0; j < p_numero_columnas; j++) {
                // Llenar Mi Matriz
                sLista += "[" + (j) + "] = " + p_matriz[i][j] + "\n";
            }
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

}
