/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author felipe
 */
public class Aula02 {

    
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        //c1.ponta = 1.0f;
        c1.carga = 80;
        
        c1.tampar();
        c1.status();
        //c1.rabiscar();
        

        
    }
    
}
