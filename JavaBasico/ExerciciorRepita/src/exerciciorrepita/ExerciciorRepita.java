/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorrepita;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe
 */
public class ExerciciorRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Etapa 1
        JOptionPane.showMessageDialog(null, "Olá Mundo!", "Boas Vindas", JOptionPane.ERROR_MESSAGE);
        System.out.println(JOptionPane.ERROR_MESSAGE);
        */
        /*Etapa 2
        int n, s=0;
        do{
        n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "<html>Informe um número: <em><br>(valor 0 interrompe)<br></html></em>"));
        s += n;
        }
        while(n != 0);
        System.out.println(s);
        JOptionPane.showMessageDialog(null,
                "<html> Resultado final<hr>Somatório vale "+s+"</html>", "Resultado", JOptionPane.WARNING_MESSAGE);
    }
*/
        int n, c=0, pares=0, impares=0, acima=0;
        float s=0;
        while(true){
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: </html>"));
            if(n != 0){
                s += n;
                c++;
                
                if(n%2 == 0)
                    pares++;
                else
                    impares++;
                if(n>100)
                    acima++;
            }
            else
                break;
            
        }
        JOptionPane.showMessageDialog(null,"<html>resultado<hr>Total de Valores: "+c+
                "<br>Total de pares: "+pares+
                "<br>Total de ímpares: "+impares+
                "<br>Acima de 100: "+acima+
                "<br>Média dos valores: "+(s/c), "Resultado", JOptionPane.WARNING_MESSAGE);
}
}