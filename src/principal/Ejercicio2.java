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
class Ejercicio2 {

    public static void respuesta() {
        double[][] datos = new double[3][3];
        double suma = 0.0;
        int fila = 0;
        double promedio;
        String sListaMensaje = "";
        String MensajeError = "";
        MensajeError += "No ha ingresado número";
        String MensajeError2 = "";
        MensajeError2 += "No puede salir del programa";
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos.length; j++) {
                try {
                    datos[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número de la fila : " + (i + 1) + " y columna " + (j + 1)));
                } catch (NumberFormatException e) {

                    JOptionPane.showMessageDialog(null, MensajeError);
                } catch (NullPointerException e) {

                    JOptionPane.showMessageDialog(null, MensajeError2);
                }
            }
        }
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos.length; j++) {
                suma = datos[i][j] + suma;
                fila = i + 1;
            }
            promedio = suma / 3.0;
            sListaMensaje += "En la fila " + fila + " la suma es: " + suma + "\n";
            sListaMensaje += "En la fila " + fila + " el promedio es: " + promedio + "\n";

            suma = 0;

        }
        JOptionPane.showMessageDialog(null, sListaMensaje);

    }
}
