/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programahora;

// Importo el paquete java.util para poder utilizar la clase Scanner

import java.util.*;

/**
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
 * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos
 * de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta
 * las horas, los minutos no se deben introducir por teclado.
 *
 * @author Amarico
 */
public class ProgramaHora {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    //Creo un objeto de la clase Scanner
    
    Scanner entrada = new Scanner(System.in);
    
    // Declaro una variable de tipo entero 
    
    int hora;
    
    // Pido la hora por teclado
    
    System.out.println("Introduce la hora ");
    
    hora = entrada.nextInt();
    
    
    
  }
  
}
