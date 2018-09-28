/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Familia_Borja_Li
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String y = "";
        String MensajeError = "";
        MensajeError += "No ha ingresado número";
        String MensajeError2 = "";
        MensajeError2 += "No puede salir del programa";
        try {
            int Condicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de Problema : "));
            switch (Condicion) {
                case 1:
                    Ejercicio1.respuesta();
                    break;
                case 2:
                    Ejercicio2.respuesta();
                    break;
                case 3:
                    Ejercicio3.respuesta();
                    break;
                case 4:
                    Ejercicio4.respuesta();
                    break;
                case 5:
                    Ejercicio5.respuesta();
                    break;
                case 6:
                    Ejercicio6.respuesta();
                    break;
                case 7:
                    Ejercicio7.respuesta();
                    break;
                case 8:
                    Ejercicio8.respuesta();
                    break;
                default:
                    y += "El ejercicio no existe \n";
                    JOptionPane.showMessageDialog(null, y);
            }
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, MensajeError);
        } catch (NullPointerException e) {

            JOptionPane.showMessageDialog(null, MensajeError2);
        }
    }

}
