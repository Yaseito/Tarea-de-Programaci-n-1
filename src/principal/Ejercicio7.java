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
class Ejercicio7 {

    public static void respuesta() {
        String MensajeError = "";
        MensajeError += "No ha ingresado número";
        String MensajeError2 = "";
        MensajeError2 += "No puede salir del programa";
        try {
            int nvector = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del vector : "));
            int rango = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un rango [0-24] : "));

            String palabra = "";
            for (int i = 0; i < nvector; i++) {
                palabra += Abc(DevuleveNumeroAleatorio(rango, 0));
            }

            JOptionPane.showMessageDialog(null, "La palabra generada es: " + palabra);
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, MensajeError);
        } catch (NullPointerException e) {

            JOptionPane.showMessageDialog(null, MensajeError2);
        }
    }

    public static String Abc(int n) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        String[] abcV = abc.split("");
        return abcV[n];
    }

    public static int DevuleveNumeroAleatorio(int p_al_vmax, int p_al_vmin) {
        int nNumeroAleatorio = 0;

        nNumeroAleatorio = (int) (Math.random() * (p_al_vmax - p_al_vmin));

        return nNumeroAleatorio;
    }
}
