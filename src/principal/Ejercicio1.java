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
class Ejercicio1 {
    public static void respuesta() {
        // TODO code application logic here
        int nNumero = 10; 
        double nSuma = 0;
         double nPromedio = 0;
        // int nNumeroElementos = 0;
         
         double nNumeroMayor = 0;
         double nNumeroMenor = 999999;
        
        double[] numeros = new double[nNumero];
        
        int[] nRepetidos = new int[nNumero];
         
        String sListaMensaje = "";
        String MensajeError = "";
        MensajeError +=  "No ha ingresado número";
        String MensajeError2 = "";
        MensajeError2 +=  "No puede salir del programa";
        for (int i = 0; i < nNumero; i++) {
         try{
            numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese El Numero : " + (i +1)));
         }catch(NumberFormatException e){
             
             JOptionPane.showMessageDialog(null, MensajeError);
        }catch(NullPointerException e){
             
             JOptionPane.showMessageDialog(null, MensajeError2);
        }
         
            if (numeros[i] >= nNumeroMayor) {
                nNumeroMayor = numeros[i];
            }
            
            if (numeros[i] <= nNumeroMenor) {
               nNumeroMenor = numeros[i]; 
            }
            nSuma = nSuma + numeros[i];
            
        }
        
            nPromedio = nSuma / nNumero ;
            
            for (int i = 0; i < numeros.length; i++) {
            
                nRepetidos[i] = DevuelveRepeticiones(numeros[i],numeros);
            
            }
        
            
            
        sListaMensaje +=  "Listado de Numeros\n";
        
        for (int i = 0; i < numeros.length; i++) {
            sListaMensaje +=  "Numero(" +(i+1) + ") : " + numeros[i] +"\n";
        }
        
        sListaMensaje += "El # Mayor es : " + nNumeroMayor + "\n";
        sListaMensaje += "El # Menor es : " + nNumeroMenor + "\n";
        sListaMensaje += "El # Promedio es : " + nPromedio + "\n";
                
        sListaMensaje +=  "***Repetidos***\n";
        
         for (int i = 0; i < nRepetidos.length; i++) {
           sListaMensaje +=  "Numero(" +(i+1) +  ") --> " +numeros[i]  + ":  Repetido : " + nRepetidos[i] +" veces \n"; 
        }
         
        // Mandar Mensaje de Impresion.
        
        JOptionPane.showMessageDialog(null, sListaMensaje);
            
    }
    
    public static int DevuelveRepeticiones(double p_numero, double[] p_parreglo)
    {
        int nNumeroRepeticiones = 0;
       
        for (int i = 0; i < p_parreglo.length; i++) {
            
            if (p_parreglo[i] == p_numero) {
                nNumeroRepeticiones++;
            }
            
        }
        
        return nNumeroRepeticiones;
    }
            
    
}


