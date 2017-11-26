
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Milena
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        String nome = "Gustavo";
        Float nota = 8.5f;
        /*
        System.out.println("A nota é: "+nota);
        System.out.printf("A note de %s é: %.2f \n", nome, nota);
        System.out.format("A note de %s é: %.2f \n\n\n", nome, nota);
        */
        
        Scanner teclado = new Scanner(System.in);
        nome = teclado.nextLine();
        nota = teclado.nextFloat();
        System.out.format("A note de %s é: %.2f \n\n\n", nome, nota);
        
    }
    
}
